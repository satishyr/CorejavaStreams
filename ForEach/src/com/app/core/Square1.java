package com.app.core;

import java.util.ArrayList;

public class Square1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> i=new ArrayList<>();
		i.add(25);
		i.add(26);
		i.add(29);
		i.add(28);
		System.out.println(i);
    
		i.stream().forEach(l->{System.out.println("the square of"+l+"is:"+(l*l));});
	}

}
