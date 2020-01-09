package com.app.core.comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(20);
		marks.add(50);
		marks.add(45);
		marks.add(25);
		marks.add(15);
		System.out.println(marks);
	List<Integer> ascending=marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(ascending);
}
}