package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortOrder {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(20);
		marks.add(50);
		marks.add(45);
		marks.add(25);
		marks.add(15);
		System.out.println(marks);
		List<Integer> l1=marks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
				
	System.out.println(l1);
	}
}
