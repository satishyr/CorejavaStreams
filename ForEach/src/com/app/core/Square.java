package com.app.core;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Square {
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(25);
		i.add(26);
		i.add(29);
		i.add(28);
		System.out.println(i);
    Consumer<Integer> c= l->{System.out.println("the square of "+l+"is:"+(l*l));
    };
    i.stream().forEach(c);
	}
}
