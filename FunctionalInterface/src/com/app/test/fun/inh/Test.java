package com.app.test.fun.inh;

public class Test {

	public static void main(String[] args) {
		J j=new J() {

			@Override
			public void m1() {

				System.out.println("m1-annonymous");
				
			}
	};
	j.m1();
	
}
}
