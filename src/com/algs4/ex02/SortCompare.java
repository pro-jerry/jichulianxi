package com.algs4.ex02;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * 几种排序的所花费的时间比较
 * @author Administrator
 *
 */
public class SortCompare {

	public static double time(String alg,Double[] a){
		
		Stopwatch timer = new Stopwatch();
		if(alg.equals("Insertion")) Insertion.sort(a);
		if(alg.equals("Selection")) Selection.sort(a);
		if(alg.equals("Shell")) Shell.sort(a);
		if(alg.equals("Merge")) Merge.sort(a);
		if(alg.equals("Quick")) Quick.sort(a);
		if(alg.equals("Heap")) Heap.sort(a);
		
		return timer.elapsedTime();
	}
	
	
	public static double timeRandomInput(String alg,int N,int T){
		
		double total = 0.0;
		Double[] a = new Double[N];
		for(int t=0;t<T;t++){
			for(int i=0;i<N;i++)
				a[i]=StdRandom.uniform();
			total+=time(alg, a);
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println(timeRandomInput("Selection", 1000, 1000));
		System.out.println(timeRandomInput("Insertion", 1000, 1000));
	}
	
	
}
