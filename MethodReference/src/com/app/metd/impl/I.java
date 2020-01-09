package com.app.metd.impl;

@FunctionalInterface
public interface I {

	public abstract void m1();
	public static void m2() {
		System.out.println("static method of m2");
	}
	
}
