package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpdatedMarks {
public static void main(String[] args) {
	ArrayList<Integer> marks=new ArrayList<>();
	marks.add(40);
	marks.add(50);
	marks.add(60);
	marks.add(70);
	marks.add(80);
	marks.add(90);
	System.out.println(marks);
	List<Integer> updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
	System.out.println(updatedmarks);
}
}
