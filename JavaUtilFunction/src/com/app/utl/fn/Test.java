package com.app.utl.fn;

import java.util.Scanner;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		
		Function<String, Integer> f=(String x)->{return x.length();};
		System.out.println("enter your string");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int LengthofString=f.apply(s);
		System.out.println("the length of string:"+LengthofString);
		
		Function<Integer, Integer> f1=(Integer x)->{return x*x;};
		System.out.println("enter your Integer");
		int var=scan.nextInt();
		int square=f1.apply(var);
		System.out.println("the of the square::"+square);
	
     
	Function<String, String> sa=(String x)->{return x.toUpperCase();};
System.out.println("enter the String:");
String si=scan.next();
String toupp=sa.apply(si);
System.out.println("the uppercase letter is:"+toupp);

	}
}
