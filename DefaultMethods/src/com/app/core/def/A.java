package com.app.core.def;

public class A implements I,J{

	@Override
	public void m3() {
		I.super.m3();
		
	}
	@Override
	public void m1() {
		System.out.println("m1-A");
	}
	@Override
	public void m2() {
		System.out.println("m2-A");
	}

}
