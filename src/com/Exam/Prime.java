package com.Exam;
import java.util.Scanner;
public class Prime {
	    public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scr.nextInt();
	        boolean isPrime = true;
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println("Prime Number");
	        } else {
	            System.out.println("Not a Prime Number");
	        }

	        scr.close();
	    }
	}

