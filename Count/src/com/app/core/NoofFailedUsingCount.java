package com.app.core;

import java.util.ArrayList;
import java.util.List;

public class NoofFailedUsingCount {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(20);
		l1.add(35);
		l1.add(25);
		l1.add(40);
		l1.add(26);
		l1.add(19);
		System.out.println(l1);
		long noofFailed=l1.stream().filter(m->m<35).count();
		System.out.println(noofFailed);
	}

}
