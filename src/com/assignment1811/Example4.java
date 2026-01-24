package com.assignment1811;

public class Example4 {
	public static void main(String[] args) {
	        int a = 10, b = 20;
	        System.out.println("Before Swap:");
	        System.out.println("a = " + a + ", b = " + b);
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("After Swap (Using Third Variable):");
	        System.out.println("a = " + a + ", b = " + b);
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("\nAfter Swap (Without Third Variable):");
	        System.out.println("a = " + a + ", b = " + b);
	    }
	}

