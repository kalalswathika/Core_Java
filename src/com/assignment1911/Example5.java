package com.assignment1911;

public class Example5 {
static int x;
static {
	   x = 100;
	   System.out.println("Static block executed");
	    }
	    public static void main(String[] args) {
	        System.out.println("Value of x: " + x);
	    }
	}
