package com.app.lam.parm;

public class Test {
	public static void main(String[] args) {
		I i=()->System.out.println("m1 method");
		i.m1();
		J j=y->System.out.println("y:"+y);
		j.m2(10);
	}

}
