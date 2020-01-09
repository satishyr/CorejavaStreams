package com.app.core;

import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {

		double total=Stream.of(7.3,1.5,4.8).reduce(0.0, (a,b)->a+b);
		System.out.println("total="+total);
	}

}
