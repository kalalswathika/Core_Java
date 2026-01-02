package com.Scanner;
import java.util.Scanner;

public class Example2 {
	public void dispalyDetails(String name,String address,int pincode,long phnNumber) {
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+address);
		System.out.println("Pincode is:"+pincode);
		System.out.println("PhoneNumber is:"+phnNumber);	
	}
	public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    System.out.println("Enter your Name:");
    String name=scr.next();
    System.out.println("Enter your Address:");
    String address=scr.next();
    System.out.println("Enter your Pincode:");
    int pincode=scr.nextInt();
    System.out.println("Enter your Phone Number:");
    long phnNumber=scr.nextLong();
    Example2 obj=new Example2();
    obj.dispalyDetails(name, address, pincode,phnNumber);
    scr.close();
    
	}

}
