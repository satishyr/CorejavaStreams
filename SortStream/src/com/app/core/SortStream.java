package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {
	public static void main(String[] args) {
		
			ArrayList<Integer> l1=new ArrayList<>();
			l1.add(20);
			l1.add(35);
			l1.add(25);
			l1.add(40);
			l1.add(26);
			l1.add(19);
			System.out.println(l1);

			List<Integer> l2=l1.stream().sorted().collect(Collectors.toList());
			System.out.println(l2);
	}

}
