package com.app.optional;

import java.util.Optional;

public class Test {
public static void main(String[] args) {
	String[] s=new String[5];
	s[0]="ram";
	s[1]="sam";
	s[2]="sai";
	
	System.out.println(s[1].toUpperCase());
	//System.out.println(s[2].toUpperCase());
	System.out.println(s[2]);
	//Optional<String> o=Optional.ofNullable(s[1]);
	//System.out.println(o.isPresent());
	Optional<String> o=Optional.ofNullable(s[2]);
	//System.out.println(o.isPresent());
	
	if (o.isPresent()) {
		System.out.println("value existed..."+o.get()+"......"+o.get().toUpperCase());
	}
	else {
		System.out.println("value is not existed");
	}
}
}
