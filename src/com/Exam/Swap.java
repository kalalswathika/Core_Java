package com.Exam;
import java.util.Scanner;
public class Swap {
	    public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        System.out.print("Enter value of A: ");
	        int a = scr.nextInt();
	        System.out.print("Enter value of B: ");
	        int b = scr.nextInt();
	        System.out.println("Before Swapping");
	        System.out.println("A = " + a);
	        System.out.println("B = " + b);
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("After Swapping");
	        System.out.println("A = " + a);
	        System.out.println("B = " + b);
	        scr.close();
	    }
	}
