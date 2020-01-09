package com.app.util.consu;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test1 {
	public static void main(String[] args) {
		Consumer<String> c=(String s)->{
			System.out.println("the String value is:"+s.toLowerCase());
			System.out.println("the String value is:"+s.toUpperCase());
			System.out.println("the String value is:"+s.charAt(5));
			
		};
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s2=sc.next();
		c.accept(s2);
	}
}
