package com.app.lam.nonvoid.nonparm;

public class Test {

	public static void main(String[] args) {
		K k=()->{return 123;
		
		};
		System.out.println(k.m1());
		L l=y->{
			return y.length();
		};
		System.out.println(l.m1("sai"));
	}
}
