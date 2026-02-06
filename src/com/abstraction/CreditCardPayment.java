package com.abstraction;

public class CreditCardPayment extends Payment {
	String cardNumber , expiryDate , cvv;

	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	public void processPayment() {
		System.out.println("Processing credit card payment.");
		
	}
	public  void validateTransaction() {
	        System.out.println("Validating card number, expiry, and CVV.");
	    }

}
