package com.app.core.de.in;

public interface Cube {
public default void cal(int x) {
	System.out.println("the cube of given no is:"+(x*x*x));
}
}
