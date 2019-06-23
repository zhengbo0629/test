package com.prac.java;

public class two {
public static void main(String[] args) {
	String a="     前边"+"      "+"后边      ";
	String b=a.trim();
	String c=a.replace(" ", "");
	System.out.println("原始"+a);
	System.out.println("trim"+b);
	System.out.println("replace"+c);
	
}
}
