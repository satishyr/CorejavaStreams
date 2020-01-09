package com.app.lam.block;

public class Test {

	public static void main(String[] args) {
		I i=()->{System.out.println("unblocked lambda expression");
		
		};
		i.m1();
		
		I j=()->{
			System.out.println("blocked lambda expression");
			for(int i1=0;i1<5;i1++) {
System.out.println("h1");				
			}
		};
		j.m1();
	}
}
