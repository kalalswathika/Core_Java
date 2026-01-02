package com.Scanner;
import java.util.Scanner;
public class Exampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=scr.nextInt();
		if(age>=18) {
			System.out.println("Eligibile to vote");
		}
		else {
			System.out.println("Not eligible to vote");	
		}
		
scr.close();
	}

}
