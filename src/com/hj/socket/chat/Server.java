package com.hj.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务器
 * @author Administrator
 *
 */
public class Server {

	
	private List<MyChannel> all = new ArrayList<MyChannel>();
	
	public static void main(String[] args) throws IOException {
		
		new Server().start();
	}
	
	public void start() throws IOException{
		
		ServerSocket server = new ServerSocket(9999);
		while(true){
			
			Socket client = server.accept();
			MyChannel channel = new MyChannel(client);
			all.add(channel);
			new Thread(channel).start();//一条道路
		}
	}
	
	
	
	/**
	 * 一个客户端一条道路
	 * 输入流
	 * 输出流
	 * 接收数据
	 * 发送数据
	 * @author Administrator
	 *
	 */
	private class MyChannel implements Runnable{

		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;
		
		public MyChannel(Socket client ) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {

				CloseUtil.closeAll(dis,dos);
				isRunning = false;
			}
		}
		
		/**
		 * 读取数据
		 * @return
		 */
		private String receive(){
			
			String msg = "";
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return msg;
		}

		
		private void send(String msg){
			
			if(msg==null || msg.equals("")){
				return ;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				CloseUtil.closeAll(dos);
				isRunning = false;
				all.remove(this);//移出自身
			}
			
		}
		
		/**
		 * 发送给其他客户端
		 */
		private void sendOthers(){
			
			String msg = this.receive();
			//遍历容器
			for(MyChannel other:all){
				
				if(other == this){
					continue;
				}
				//发送给其他客户端
				other.send(msg);
			}
		}
		
		
		@Override
		public void run() {

			while(isRunning){
				
//				send(receive());
				sendOthers();
			}
		}
		
	}
	
}
