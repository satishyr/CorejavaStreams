package com.app.metd;

public class Test {

	public static void main(String[] args) {
		I i=A::test;
		System.out.println(i.toString());
	}
}
