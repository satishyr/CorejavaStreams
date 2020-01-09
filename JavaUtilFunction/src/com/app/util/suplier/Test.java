package com.app.util.suplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
		Supplier< String> s=()->{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			String var=sc.next();
			int val=var.length();
			return "the length of thegiven string is:"+val;
		};
		String output=s.get();
		System.out.println(output);
	}

}
