package com.app.test.fun.para;

public class Test {

	static void m1(Square o) {
		System.out.println(o.hashCode());
		System.out.println(o.area(12));
	}
	public static void main(String[] args) {
		Square s=(int value)->{return value*value;
	};
	System.out.println(s.hashCode());
	System.out.println(s.area(13));
	m1(s);
	System.out.println("----------");
	m1((int value)->{return value*value;});
}
}