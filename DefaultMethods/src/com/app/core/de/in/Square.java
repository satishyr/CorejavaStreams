package com.app.core.de.in;

public interface Square {
	public default void cal(int x) {
		System.out.println("the square of given no is"+(x*x));
	}

}
