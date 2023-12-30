package com.mypackage.Strings;

public class Gc {
	public void joy()
	{
		System.out.println("object is garbage collected");}  
	
	 public static void main(String args[]){  
	  Gc g=new  Gc();  
	  Gc g1=new Gc();  
	  g=null;  
	  g1=null;  
	  System.gc();  
	 }
}
