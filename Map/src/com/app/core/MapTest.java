package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<>();
		l1.add("kareen kapoor");
		l1.add("kathrina kaif");
		l1.add("thrisha");
		l1.add("nayanathara");
		System.out.println(l1);
	List<String> l2=l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(l2);
	}
	

}
