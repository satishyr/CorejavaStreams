package com.app.min.max;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("satish");
		al.add("hmed");
		al.add("samanth");
		al.add("ram");
		al.add("ajaya");
		Stream<String> s=al.stream();
		/*
		 * Optional<String> o=s.max((x,y)->{ return x.compareTo(y); });
		 */
		
		Optional<String> o=s.min((x,y)->{
			return x.compareTo(y);
		});
		if (o.isPresent()) {
			System.out.println(o.get());
			
			
		}
	}

}
