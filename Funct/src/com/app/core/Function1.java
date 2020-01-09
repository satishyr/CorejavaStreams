package com.app.core;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
      Function<Integer, Integer> f=i->i*i;
      System.out.println("square of 4 is:"+f.apply(4));
      System.out.println("square of 50 is:"+f.apply(50));
	}

}
