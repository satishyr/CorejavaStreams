package com.app.core;

import java.util.Arrays;

public class Average {
	public static void main(String[] args) {
		Arrays.stream(new int[] {1,2,4,8,6,10}).map(x->x*x).average().ifPresent(System.out::print);
	}

}
