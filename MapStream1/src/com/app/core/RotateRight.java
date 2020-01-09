package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RotateRight {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al);
		int n=al.size();
		int k=2;
		int mod=k%n;
		List<Integer> l=al.stream().map(j->((j+mod))%n).collect(Collectors.toList());
		System.out.println(l);
	}

}
