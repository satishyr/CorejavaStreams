package com.app.core;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
			
		}
		ArrayList<Integer> a=new ArrayList<>();
		for(Integer i:al)
		{
			if(i%2==0)
			{
				a.add(i);
			}
		}
		System.out.println(a);
	}

}
