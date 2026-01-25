package com.Exam;
import java.util.Scanner;
public class FibonacciSeries {
	    public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        System.out.print("Enter number of terms: ");
	        int n = scr.nextInt();
	        int first = 0, second = 1;
	        System.out.print("Fibonacci Series: ");
	        if (n >= 1) {
	            System.out.print(first + " ");
	        }
	        if (n >= 2) {
	            System.out.print(second + " ");
	        }
	        for (int i = 3; i <= n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }
	        scr.close();
	    }
	}

