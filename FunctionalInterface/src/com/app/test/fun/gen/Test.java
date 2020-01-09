package com.app.test.fun.gen;

public class Test {
	public static void main(String[] args) {
		I<Integer> o=(x)->{System.out.println("lambda expression:"+x);
	return 111;};
	System.out.println(o.m1(22));
	I<String> s=(String x)->{System.out.println("lambda string:"+x);
	return "java8";
	};
	System.out.println(s.m1("java7"));
	}

}
