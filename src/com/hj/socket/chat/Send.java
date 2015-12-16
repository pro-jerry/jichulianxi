package com.hj.socket.chat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 数据发送线程
 * @author Administrator
 *
 */
public class Send implements Runnable {

	//控制台输入流
	private BufferedReader console;
	//管道输出流
	private DataOutputStream dos;
	//控制线程
	private boolean isRunning = true;
	
	public Send(){
		console = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	public Send(Socket client){
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			isRunning = false;
			CloseUtil.closeAll(dos,console);
		}
	}
	
	//从控制台接收数据
	private String getMsgFromConsole(){
		
		String msg = null;
		try {
			msg = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
	
	/**
	 * 1.从控制台接收数据
	 * 2.发送数据
	 * 
	 */
	public void send(){
		
		String msg = getMsgFromConsole();
		try {
			if(msg!=null && !msg.equals("")){
				dos.writeUTF(msg);
				dos.flush();//强制刷新
			}
		} catch (IOException e) {
//			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dos,console);
		}
	}
	
	@Override
	public void run() {

		//线程体
		while(isRunning){
			send();
		}
	}

}
