package com.assignment1811;

public class Example9 {
	    int instanceVar = 10;
	    static int staticVar = 20;
	    void display() {
	    int localVar = 30;
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	    }
	    public static void main(String[] args) {
	        Example9 obj1 = new 	Example9();
	        obj1.display();
	        obj1.instanceVar = 50;
	        Example9.staticVar = 100;
	        System.out.println("After modification:");
	        obj1.display();
	       Example9 obj2 = new Example9();
	        System.out.println("Using second object:");
	        obj2.display();
	    }
	}

