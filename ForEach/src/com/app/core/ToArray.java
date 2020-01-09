package com.app.core;

import java.util.ArrayList;

public class ToArray {
public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(25);
		l.add(26);
		l.add(29);
		l.add(28);
		System.out.println(l);
    Integer[]i=l.stream().toArray(Integer[]::new);
    for(Integer i1:i)
    {
    	System.out.println(i1);
    }
}
}
