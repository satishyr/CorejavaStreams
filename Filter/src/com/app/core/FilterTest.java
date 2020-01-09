package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
public static void main(String[] args) {
	ArrayList<String> l1=new ArrayList<>();
	l1.add("sunny leone");
	l1.add("kathrina kaif");
	l1.add("kareena kapoor");
	l1.add("thrisha");
	l1.add("nayanathara");
System.out.println(l1);
List<String> l2=l1.stream().filter(s->s.length()%2==0).collect(Collectors.toList());
System.out.println(l);
}

}
