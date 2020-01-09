package com.app.test;
interface I{
	public void m1();
	public default void m2() {
		System.out.println("m2-default-I");
	}
	public default void m3() {
		System.out.println("m3-default-I");
	}
	public static void m4() {
		System.out.println("m4-static-I");
	}
	public static void m5() {
		System.out.println("m5-static-I");
	}
}
public class Test implements I {
public static void main(String[] args) {
	I.m4();
	I.m5();
    I obj=new Test();
    obj.m1();
    obj.m2();
    obj.m3();
}
	@Override
	public void m1() {
		System.out.println("m1 method implementation class");
	}
	

}
