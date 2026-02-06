package com.abstraction;

public abstract class Payment {
	abstract void processPayment();
	 abstract void validateTransaction();
	   
	 public void generateTransactionId() {
	        long transactionId = (long)(Math.random() * 1_000_000_000);
	        System.out.println("Generated transaction ID: " + transactionId);
	    }
	}
