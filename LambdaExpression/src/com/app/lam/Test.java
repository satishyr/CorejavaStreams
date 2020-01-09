package com.app.lam;

public class Test {

	public static void main(String[] args) {
		I i=new I() {

			@Override
			public void m1() {
				System.out.println("m1-annanymous");
			}
	};
	i.m1();
	I obj=()->System.out.println("lambda");
	obj.m1();
	System.out.println(obj.hashCode());
}
}