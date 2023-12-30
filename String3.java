package com.mypackage.Strings;

public class String3 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();    
		System.out.println(sb.capacity());  
		sb.append("Hello");    
		System.out.println(sb.capacity());    
		sb.append("Java is my favourite language");    
		System.out.println(sb.capacity());

	}

}
