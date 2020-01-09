package com.app.core.comparable.max;

import java.util.ArrayList;

public class Maximum {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(20);
		marks.add(50);
		marks.add(45);
		marks.add(25);
		marks.add(15);
		System.out.println(marks);
int max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
System.out.println(max);

}
}