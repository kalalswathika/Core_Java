package com.Scanner;
import java.util.Scanner;
public class BankDetails {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter your name:");
		String customerName=scr.next();
		System.out.println("Enter your Address:");
		String customerAddress=scr.next();
		System.out.println("Enter your Number:");
		long phnNumber=scr.nextLong();
		System.out.println("Enter your balance:");
		double balance=scr.nextDouble();
		BankApplication obj=new BankApplication(customerAddress, customerAddress, phnNumber, balance);
		int options=0;
		do {
		System.out.println("Enter 1 for deposite:");
		System.out.println("Enter 2 for withdraw:");
		System.out.println("Enter 3 for check balance:");
		System.out.println("Enter 4 for exit");
	     options=scr.nextInt();
		switch(options)
		{
		case 1:
		System.out.println("Enter amount to deposite:");
		int amount=scr.nextInt();
		obj.deposite(amount);
		break;
		
		case 2:
		System.out.println("Enter amount to withdraw:");
		amount=scr.nextInt();
		obj.withDraw(amount);
		break;
		 
		case 3:
		obj.ShowBalance();
		break;
		
		case 4:
			obj.exit();
			break;
			
			default:
				System.out.println("Invalid option");

	}
	}
while(options!=4);
		scr.close();
}
}
