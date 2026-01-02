package com.Scanner;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phnNumber;
	private double balance;
	public BankApplication(String customerName,String customerAddress,long phnNumber,double balance) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phnNumber=phnNumber;
		this.balance=balance;
	}
	public void deposite(int amount) {
		balance=balance+amount;
		System.out.println("Deposite Successful:"+balance);
	}
	public void withDraw(int amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdraw successful:"+balance);
		}
		else {
			System.out.println("Insufficent Funds");
		}
	}
	public void ShowBalance() {
		System.out.println("The balance is:"+balance);
	}
	public void exit() {
		System.out.println("Thank You!");
	}
}
