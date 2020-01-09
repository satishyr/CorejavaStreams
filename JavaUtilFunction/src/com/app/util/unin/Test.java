package com.app.util.unin;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Test {
	public static void main(String[] args) {
     UnaryOperator<Integer> u=(Integer i)->{
    	 int square=i*i;
    	 return square;
     };
     System.out.println("enter the square of number:");
     @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
     Integer k=sc.nextInt();
     System.out.println("square of the number is:"+u.apply(k));

     
     UnaryOperator<String> s1=(String s)->{
    	 String toupper=s.toUpperCase();
    	 return toupper;
     };
     System.out.println("enter the given String:");
          String s2=sc.next();
          System.out.println("the uppercase characters are:"+s1.apply(s2));
	}

}
