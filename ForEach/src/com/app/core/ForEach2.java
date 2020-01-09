package com.app.core;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ForEach2 {
public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(25);
		l.add(26);
		l.add(29);
		l.add(28);
		System.out.println(l);
      Stream.of(l).forEach(System.out::println);

}
}