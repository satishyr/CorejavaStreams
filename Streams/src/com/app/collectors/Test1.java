package com.app.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	
	public static void main(String[] args) {
		/* 1.
		 * List<Integer> li=new ArrayList<Integer>(); li.add(15); li.add(20);
		 * li.add(25); li.add(23); li.add(89); li.add(87); li.add(48);
		 * System.out.println(li+" ");
		 */	
		
		
		/* 2.
		 * Stream<Integer> s=Stream.of(new Integer[]
		 * {15,20,15,89,25,23,26,59}).map((x)->x*x).distinct();
		 * 
		 * Object[] o1=s.toArray(); for(Object o2:o1) { System.out.println(o2); }
		 */
		
		/* 1a.
		 * List<Integer> l=li.stream().map((x)->x*x).collect(Collectors.toList());
		 * for(Object o1:l) System.out.println(o1);
		 */
		
	//1b.	li.stream().map((x)->x*x).collect(Collectors.toList()).forEach(System.out::println);
		
		Set<Integer> s=new TreeSet<Integer>();
		
		s.add(15);
		s.add(16);
		s.add(45);
		s.add(26);
		s.add(17);
		s.add(23);
		
		
		System.out.println(s+" ");
		
		
	}
	

}
