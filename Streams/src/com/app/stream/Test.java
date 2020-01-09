package com.app.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		/*1
		 * List<Integer> l1=new ArrayList<Integer>(); Iterator<Integer> i=l.iterator();
		 * while(i.hasNext()) { int value=i.next(); int square =value*value;
		 * l1.add(square); } System.out.println("l:"+l); System.out.println("l1:"+l1);
		 */
		
		  Stream<Integer> s=l.stream(); 
		  Stream<Integer> s1=s.map((x)->x*x); 
		/*2 Object[]
		  o=s1.toArray(); for(Object o1:o) { System.out.println(o1); }
		*/
		  
		/*3
		 * List<Integer> li=s1.collect(Collectors.toList());
		 * System.out.println("li:"+li);
		 */
		  
		  List<Integer> ll=l.stream().map(x->x*x).collect(Collectors.toList());
		  System.out.println("li:"+l);
		  System.out.println("ll"+ll);
	}
}
 