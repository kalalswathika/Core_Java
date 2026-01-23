package com.assignment1911;

public class Example1 {
	  static int count = 0;
Example1(){
	count++;
}
	    public static void main(String[] args) {
	        new Example1();
	        new Example1();
	        new Example1();
	        new Example1();
	        new Example1();
	        System.out.println("Count:"+count);
	        
	    }
}
