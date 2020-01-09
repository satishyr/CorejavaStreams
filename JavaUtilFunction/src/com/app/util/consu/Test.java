package com.app.util.consu;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c=(Integer i)->{
			System.out.println("the integer value:"+i);
			System.out.println("the square of the given number:"+(i*i));
			System.out.println("the cube of the given number is:"+(i*i*i));
		};
		System.out.println("the given number is");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Integer k=sc.nextInt();
		c.accept(k);
	}

}
