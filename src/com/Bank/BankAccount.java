package com.Bank;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
public BankAccount(int accountNumber,String accountHolder,double balance) {
	this.accountNumber=accountNumber;
	this.accountHolder=accountHolder;
	this.balance=balance;
}
public int getAccountNumber() {
	return accountNumber;
}
public String getAccountHolder() {
	return accountHolder;
}
public double getBalance() {
	return balance;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber=accountNumber;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder=accountHolder;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public void deposite(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("Deposite Successful"); 
	}
	else {
		System.out.println("Invalid Occured");
	}
}
public void withDraw(double amount) {
	if(balance>=amount) {
		balance-=amount;
		System.out.println("Withdraw Successful");
	}
	else {
		System.out.println("Insufficient balance"); 
	}
}
}
