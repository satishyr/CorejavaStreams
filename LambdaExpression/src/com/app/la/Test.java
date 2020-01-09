package com.app.la;

public class Test {
	public static void main(String[] args) {
		I obj=new I() {
			
			@Override
			public void m1() {
System.out.println("m1-test");				
			}
		};
	obj.m1();
	I obj1=()->System.out.println("m1-lambda");
	obj1.m1();
	}
	

}
