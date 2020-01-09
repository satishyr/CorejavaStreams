package com.app.core.defu.ov;

public interface I {
	public default void m1() {
		System.out.println("deafult m1-I");
	}
public default void m3() {
	System.out.println("default m3-I");
}
}
