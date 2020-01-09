package com.app.metd.impl;

import com.app.metd.I;

public class A implements I {
public static void main(String[] args) {
A a=new A();
a.m1();

}
@Override
public void m1() {
System.out.println("m1 implementation class A");
}

}