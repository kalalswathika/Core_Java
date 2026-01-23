package com.assignment1911;

public class Example6 {
static String company = "Infosys";
	    static void display() {
	        System.out.println("Company: " + company);
	    }
	    public static void main(String[] args) {
	       Example6.company = "TCS";
	        Example6.display();
	    }
	}