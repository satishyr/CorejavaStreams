package com.app.stream.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		/*
		 * List<Integer> al=new ArrayList<Integer>(); Iterator<Integer> i=li.iterator();
		 * while(i.hasNext()) { int value=i.next(); if(value%2==0) { int square
		 * =value*value; al.add(square); } } System.out.println("li"+li);
		 * System.out.println("al:"+al);
		 */	
	List<Integer> li1=li.stream().filter((x)->x%2==0).map((x)->x*x).collect(Collectors.toList());
	System.out.println("li1:"+li1);
	
	}

}
