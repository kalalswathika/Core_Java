package com.Scanner;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    int attempt=0;
    do {
    	System.out.println("Enter user Name:");
    	String username=scr.next();
    	System.out.println("Enter password:");
    	String password=scr.next();
    	if(username.equals("admin")&& password.equals("user@123")) {
    		System.out.println("Login Sucessful");
    		break;
    	}
    	else {
    		attempt++;
    		System.out.println("Login failed"+(3-attempt)+"attempts left");
    		
    	}
    }while(attempt<3);
    if(attempt==3) {
    	System.out.println("You have login after 24 hours");
    }
    scr.close();
}
	}
