package com.app.core;

import java.util.Arrays;

public class Filter1 {

	public static void main(String[] args) {

		String[] names= {"al","ankit","sachin","rohit","kohili","yuvaraj","dhoni","jadeja"};
	    Arrays.stream(names).map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);
		
	}

}
