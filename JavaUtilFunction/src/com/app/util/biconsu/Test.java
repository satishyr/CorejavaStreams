package com.app.util.biconsu;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Test {
	
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> b=(Integer x,Integer y)->{
			
			int sx=x*x;
			int sy=y*y;
			int sum=sx+sy;
			System.out.println("sum of the squares is:"+sum);
			System.out.println("sum of the cubes:"+((x*x*x)+(y*y*y)));
		};
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Integer s=sc.nextInt();
		int s1=sc.nextInt();
		b.accept(s, s1);
		
		BiConsumer<Integer, String> bi=(Integer x,String y)->{
			int ly=y.length();
			System.out.println((x*x)+"--------"+(ly*ly));
		};
		int x=sc.nextInt();
		String y=sc.next();
		bi.accept(x, y);
	}

}
