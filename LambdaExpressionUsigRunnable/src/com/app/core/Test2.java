package com.app.core;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {

		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(6);
		l.add(9);
		l.add(100);
		l.add(89);
		l.add(79);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
		
	}

}
