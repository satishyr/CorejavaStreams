package com.app.concat.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
		li.add("sam");
		li.add("satish");
		li.add("ram");
		li.add("samanth");
		Stream<String> s=li.stream();
		/*2
		 * List<Integer> li1=new ArrayList<Integer>(); li1.add(10); li1.add(15);
		 * li1.add(20); li1.add(25); Stream<Integer> s1=li1.stream(); Stream<Object>
		 * s2=Stream.concat(s, s1); s2.forEach((x)->{ System.out.println(x); });
		 */
		Optional<String> o=s.reduce((a,y)->{
			return a+y;
		});
		if(o.isPresent()) {
			System.out.println(o.get());
		}
	}

}
