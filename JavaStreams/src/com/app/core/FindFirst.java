package com.app.core;

import java.util.stream.Stream;

public class FindFirst {
	public static void main(String[] args) {
		Stream.of("vjay","vijay","banny","satish","uday","brammi").sorted().findAny().ifPresent(System.out::print);
		System.out.println();
		
		
	}

}
