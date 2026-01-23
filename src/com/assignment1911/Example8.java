package com.assignment1911;

public class Example8 {
	    static int staticCount = 0;
	    int instanceCount = 0;
public  void increment() {
	        staticCount++;
	        instanceCount++;
	    }
public void display() {
	        System.out.println("Static:" + staticCount );
	        System.out.println("Instance:" + instanceCount);
	    }
	    public static void main(String[] args) {
	        Example8 c1 = new Example8();
	        Example8 c2 = new Example8();

	        c1.increment();
	        c1.increment();
	        c2.increment();

	        c1.display();
	        c2.display();
	    }
	}

