package com.app.methd.para;

public class A {
	public static void main(String[] args) {
		
		I i=new Test()::test;
		i.m1();
		J j=new Test1()::m2;
		System.out.println(j.m2());
		K k=new Test2()::m3;
		k.m3(111);
		
		L l=new Test3()::m4;
		System.out.println(l.m4(111));
		
	}

}
