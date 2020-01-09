package com.app.util.fun;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		IntSupplier is=()->{
			int value=sc.nextInt();
			return value*value;
		};
		
		LongSupplier ls=()->{
			return System.currentTimeMillis();
		};
		
		DoubleSupplier ds=()->{
			double d=sc.nextDouble();
			return Math.sqrt(d);
		};
		BooleanSupplier bs=()->{
			int value=sc.nextInt();
			if(value%2==0) {
				return true;
			}
			else {
				return false;
			}
		};
		System.out.println(bs.getAsBoolean());
		System.out.println(ds.getAsDouble());
		System.out.println(ls.getAsLong());
		System.out.println(+is.getAsInt());
	}

}
