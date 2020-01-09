package com.app.findany;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("java");
		l.add("oracle");
		l.add("html");
		l.add("aws");
		Stream<String> s=l.stream();
		//Optional<String> o=s.findFirst();
		//System.out.println(o.isPresent());
		/*
		 * if(o.isPresent()) { System.out.println(o.get()); }
		 */
		Optional<String> o=s.findAny();
		System.out.println(o.isPresent());
		if (o.isPresent()) {
       System.out.println(o.get());			
		}
	}

}
