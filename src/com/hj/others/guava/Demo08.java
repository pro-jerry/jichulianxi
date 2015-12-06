package com.hj.others.guava;

import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * 双键的Map-->Table -->rowKey+columnKey
 * @author Administrator
 *
 */
public class Demo08 {

	
	public static void main(String[] args) {
		
		Table<String, String, Integer> tables = HashBasedTable.create();
		//测试数据
		tables.put("a", "javase", 80);
		tables.put("b", "javaee", 90);
		tables.put("c", "oracle", 50);
		tables.put("a", "oracle", 50);
		
		//所有行的数据
		Set<Cell<String, String, Integer>> cells = tables.cellSet();
		for(Cell<String, String, Integer> temp:cells){
			
			System.out.println(temp.getRowKey()+"---->"+temp.getColumnKey()+"---->"+temp.getValue());
		}
	}
}
