package com.abstraction;

public class UPIPayment extends Payment {
	String upiId , phoneNumber;

	public UPIPayment(String upiId, String phoneNumber) {
		super();
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}
	 public void processPayment() {
	        System.out.println("Processing UPI payment.");
	    }
	    public void validateTransaction() {
	        System.out.println("Validating UPI ID and phone number.");
	    }
	} 
