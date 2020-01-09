package com.app.lambd.sper;

public class A extends B{
	
	public int test() {
		int a=333;
		System.out.println("test method");
		I i=()->{System.out.println("lambda expression");
		//return a;
		//return this.a;
		return super.a;
		};
		int x=i.m1();
		return x;
	}

}
