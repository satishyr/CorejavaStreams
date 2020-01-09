package com.app.util.consu;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test2 {
public static void main(String[] args) {

	Consumer<Integer> c=(Integer i)->{
		System.out.println("i value:"+i);
		System.out.println("square of i:"+(i*i));
		System.out.println("square root of i is:"+Math.sqrt(i));
	};
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	Integer value=sc.nextInt();
c.accept(value);

}

}
