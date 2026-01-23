package com.assignment1911;

public class Example4 {
	    static double interestRate = 5.0;
	    double balance;

	    Example4(double balance) {
	        this.balance = balance;
	    }
	    static void changeInterestRate(double rate) {
	        interestRate = rate;
	    }
	   public  void display() {
	        System.out.println("Balance: " + balance); 
	        		System.out.println("Interest Rate: " + interestRate);
	    }
	    public static void main(String[] args) {
	        Example4 e1 = new Example4(10000);
	        Example4 e2 = new Example4(20000);
	        Example4.changeInterestRate(6.5);
	        e1.display();
	        e2.display();
	    }
	}
