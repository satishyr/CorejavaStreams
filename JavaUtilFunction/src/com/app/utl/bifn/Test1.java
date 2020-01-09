package com.app.utl.bifn;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Test1 {

	public static void main(String[] args) {

		BiFunction< Integer, Integer, String> bi=(Integer i,Integer j)->{
			
			int square1=i*i;
			int square2=j*j;
			int result=square1+square2;
			return "the result is:"+result;
			
		};
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int fno=s.nextInt();
		System.out.println("enter lastnumber");
		int lno=s.nextInt();
		String r=bi.apply(fno, lno);
		System.out.println(r);
	}

}
