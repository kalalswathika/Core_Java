package com.abstraction;

public class Main1 {

	public static void main(String[] args) {

        Payment payment =new CreditCardPayment("user@upi", "1234567890", "123");

        payment.processPayment();
        payment.validateTransaction();
        payment.generateTransactionId();
   System.out.println("***************");
        Payment payment1 =new UPIPayment("user@upi", "1234567890");
        payment1.processPayment();
        payment1.validateTransaction();
        payment1.generateTransactionId();
        System.out.println("****************");
        Payment payment2=new PayPalPayment("user@example.com", "abc123");
        payment2.processPayment();
        payment2.validateTransaction();
        payment2.generateTransactionId();
    }

}
