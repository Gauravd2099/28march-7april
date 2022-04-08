package com.examples;

public class StringCode3 {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		//length: gives the length of the string
		String sl=new String("Hello World");
		System.out.println(sl.length());//11
		//substring: creates another string from the existing string
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));
		//String Comparison 
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());
		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
	}
}