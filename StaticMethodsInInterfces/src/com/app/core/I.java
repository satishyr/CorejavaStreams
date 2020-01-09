package com.app.core;

public interface I {
	public default void m1() {
		System.out.println("default-m1-I");
	}

}
