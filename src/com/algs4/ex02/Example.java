package com.algs4.ex02;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Example {

	/*
	 * 选择排序
	 * 1.找到数组中最小的那个元素
	 * 2.将他和数组中的第一个元素交换位置（如果第一个元素就是最小元素那么它就和它自己交换）
	 * 3.在剩下的元素中找到最小的元素，将它与第二个元素进行交换
	 * 4.如此往复，直到整个元素排序
	 */
	public static void selectionSort(Comparable[] a){
		
		//将a[]按升序排列
		int N = a.length;
		for(int i=0;i<N;i++){
			
			int min = i;
			for(int j=i+1;j<N;j++)
				if(less(a[j], a[min])) min = j;
			exch(a, i, min);
		}
	}
	
	/**
	 * 插入排序
	 * 为了要给插入的元素腾出空间，我们需要将其余的所有元素在插入之前都向右移动一位
	 */
	public static void insertSort(Comparable[] a){
		
		int N = a.length;
		for(int i=1;i<N;i++){
			for(int j=i;j>0&&less(a[j], a[j-1]);j--)
				exch(a, j, j-1);
		}
			
	}
	
	/**
	 * shell排序
	 * @param a
	 */
	public static void shellSort(Comparable[] a){
		
		int N = a.length;
		int h=1;
		while(h<N/3) h = 3*h+1;//1,4,13,40,121
		while(h>=1){
			//将数组变为h有序
			for(int i=h;i<N;i++){
				//将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]..之中
				for(int j=i;j>=h&&less(a[j], a[j-h]);j-=h){
					exch(a, i, j-h);
				}
			}
			h=h/3;
		}
	}
	
	
	/**
	 * 插入排序动态图
	 * @param a
	 */
	public static void insertSort2D(Comparable[] a){
		
		int N = a.length;
		Comparable[][] c=new Comparable[N][N] ;
		for(int i=1;i<N;i++){
			for(int j=i;j>0&&less(a[j], a[j-1]);j--){
				exch(a, j, j-1);
			}	
			
			show2D(a);
		}
		
	}
	
	
	private static boolean less(Comparable v,Comparable w){
		
		return v.compareTo(w)<0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		
		Comparable t = a[i];
		a[i]=a[j];
		a[j] = t;
	}
	
	private static void show (Comparable[] a){
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		StdOut.println();
	}
	
	private static void show2D (Comparable[] a){
		
		
		int N = a.length;
		for(int i=0;i<a.length;i++){
			System.out.println(i+"--"+a[i]+" ");
				double x = 1.0*i/N;
				double y =Double.valueOf(a[i].toString())/2.0;
				double rw = 0.5/N;
				double rh=Double.valueOf(a[i].toString())/2.0;
				StdDraw.filledRectangle(x, y, rw, rh);
		}
		
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a){
		
		for(int i=1;i<a.length;i++)
			if(less(a[i], a[i-1])) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String[] a = In.readStrings("D:/algs4-data/words4.txt");
		
		
	}
	
}
