package com.app.core.ann;
@FunctionalInterface
public interface I {
	public default void m1() {
		System.out.println("default m1 methods");
	}
	public abstract void m2();
	public static void m3() {
		System.out.println("static m3 method");
	}

}
