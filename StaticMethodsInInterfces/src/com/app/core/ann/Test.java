package com.app.core.ann;

public class Test {

	public static void main(String[] args) {
		I i=new I() {
			
			@Override
			public void m2() {
				System.out.println("m2-I");
				m1();
			}
		};

		i.m1();
		i.m2();
	}
}
