package com.app.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(25);
		li.add(30);
		li.add(35);
		li.add(40);
		li.add(45);
		li.add(50);
		Stream<Integer> s=li.stream();
		Stream<Integer> s1=s.filter((x)->x%2==0);
		//1.System.out.println(s1.count());
		/*2.
		 * Object[] o=s1.toArray(); for(Object o1:o) { System.out.println(o1); }
		 */
	
	List<Integer> li1=s1.collect(Collectors.toList());
	System.out.println(li1);
	}
}
