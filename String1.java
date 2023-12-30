package com.mypackage.Strings;

public class String1 {
	public static void main(String[] args)
	{
	StringBuilder sb=new StringBuilder("Hello ");  
	sb.append("Java"); 
	System.out.println(sb);
	StringBuilder sb1=new StringBuilder("Hello ");  
	sb1.insert(1,"Java"); 
	System.out.println(sb1);
	sb.replace(1,3,"Java");  
	System.out.println(sb);
	}

}
