package com.app.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("corejava advancejav Spring");
	l.add("nit kit nren");
	l.add("ram sg ka");
	System.out.println("l:"+l);
	Stream<String> s=l.stream().flatMap((x)->{
		String[] value=x.split(" ");
		return Arrays.asList(value).stream();
	});
		
		
		/*
		 * System.out.println(s.count()); List<String>
		 * li=s.collect(Collectors.toList()); System.out.println("li:"+li);
		 */
		/*
		 * Object[] o=s.toArray(); for(Object o1:o) { System.out.println(o1); }
		 */
 
	//System.out.println(s.count());
		
	
		/*
		 * s.forEach((x)->{ System.out.println(x+"----"+x.length()); });
		 */
	
		 List<String> li1=s.collect(Collectors.toList());
		  System.out.println("li1:"+li1);
		 
		
		  Object[] o=li1.toArray();
		  for(Object o1:o) 
		  { 
			  System.out.println(o1); 
			  }
		 
		
		/*
		 * s.forEach((x)->{ System.out.println(x+"------"+x.length()); });
		 */
}
	
}
