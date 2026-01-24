package com.assignment1811;

public class Example10 {
	    public static void main(String[] args) {
	        int sub1 = 80;
	        int sub2 = 75;
	        int sub3 = 90;
	        int sub4 = 85;
	        int sub5 = 70;
	        int total = sub1 + sub2 + sub3 + sub4 + sub5;
	        double average = total / 5.0;
	        double percentage = (total / 500.0) * 100; 
	        System.out.println("Subject 1 Marks: " + sub1);
	        System.out.println("Subject 2 Marks: " + sub2);
	        System.out.println("Subject 3 Marks: " + sub3);
	        System.out.println("Subject 4 Marks: " + sub4);
	        System.out.println("Subject 5 Marks: " + sub5);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        System.out.println("Percentage: " + percentage + "%");
	    }
	}
