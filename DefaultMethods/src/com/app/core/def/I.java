package com.app.core.def;

public interface I {
public default void m1() {
	System.out.println("method-m1-I");
}
public default void m3() {
	System.out.println("method-m3-I");
}
}
