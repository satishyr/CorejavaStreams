package com.app.test;
@FunctionalInterface
interface J{
	public abstract void m1();
}
public class Test1 {
	public static void main(String[] args) {
		System.out.println("test one class ");
		J obj=new J() {
			
			@Override
			public void m1() {

				System.out.println("from m1 anonymous");
			}
		};
		obj.m1();
		
}
	
}