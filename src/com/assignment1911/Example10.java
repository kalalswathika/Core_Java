package com.assignment1911;

public class Helper{
	    static int count = 0;
	}

	class ClassA {
	    void increment() {
	       Helper.count++;
	        System.out.println("ClassA count: " + Helper.count);
	    }
	}

	class ClassB {
	    void increment() {
	        Helper.count++;
	        System.out.println("ClassB count: " + Helper.count);
	    }
	}

 public class Example10{ 
	    public static void main(String[] args) {

	        ClassA a = new ClassA();
	        ClassB b = new ClassB();

	        a.increment();  // 1
	        b.increment();  // 2
	        a.increment();  // 3
	        b.increment();  // 4
	    }
	}

