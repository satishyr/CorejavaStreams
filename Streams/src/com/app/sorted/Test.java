package com.app.sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(15);
		li.add(30);
		li.add(25);
		li.add(35);
		li.add(40);
		li.add(45);
		li.add(50);
		System.out.println("li:"+li);
		Stream<Integer> s=li.stream();
		/*
		 * Object[] o=s.toArray(); for(Object o1:o) { System.out.println(o1); }
		 */
		
		Stream<Integer> s1=s.sorted();
		Object[] o=s1.toArray(); 
		for(Object o1:o) { System.out.println(o1+" "); }
	}
}
