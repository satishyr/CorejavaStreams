package com.app.core;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		String[] names= {"AL","ankit","sachin","rohit","kohili","yuvaraj","dhoni","jadeja"};
		Arrays.stream(names).filter(x->x.startsWith("s")).sorted().forEach(System.out::println);
	}
}
