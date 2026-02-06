package com.abstraction;

public class PayPalPayment extends Payment {
	String email, authToken;

	public PayPalPayment(String email, String authToken) {
		super();
		this.email = email;
		this.authToken = authToken;
	}
	public void processPayment() {
		System.out.println("Processing PayPal payment.");
		
	}
	public void validateTransaction() {
		System.out.println("Validating email and authentication token");
	}
}
