package com.methodoverriding;
class Payment {
     Double amount;
     Integer transactionLimit;
    public Payment(Double amount, Integer transactionLimit) {
        this.amount = amount;
        this.transactionLimit = transactionLimit;
    }
    public void processPayment(Double paymentAmount) {
        System.out.println("Processing payment...");
    }
}
class CreditCardPayment extends Payment{
	public CreditCardPayment(Double amount, Integer transactionLimit) {
		super(amount, transactionLimit);
	}
	public void processPayment(Double paymentAmount) {
		   if (paymentAmount <= amount) {
	            amount -= paymentAmount;
	            System.out.println("Credit Card Payment Successful: " + amount);
	        } else {
	            System.out.println(" Insufficient credit limit.");
	        }
	    }
	}
class  DebitCardPayment extends Payment{
    public DebitCardPayment(Double balance) {
        super(balance, null);
    }
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= amount) {
            amount -= paymentAmount;
            System.out.println("Debit Card Payment Successful: " + amount);
        } else {
            System.out.println("Debit Card Payment Failed. Insufficient balance.");
        }
    }
}
class UPIPayment extends Payment {
    public UPIPayment(Integer dailyLimit) {
        super(0.0, dailyLimit);
    }
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= transactionLimit) {
            System.out.println("UPI Payment Successful. Amount paid: " + paymentAmount);
        } else {
            System.out.println("UPI Payment Failed.");
        }
    }
}
public class Practice {

	public static void main(String[] args) {
		Payment p=new CreditCardPayment(5000.0,2);
		p.processPayment(5000.0);
	    System.out.println("-----------");
	    Payment p1=new DebitCardPayment(500.0);
	    p.processPayment(5000.0);
		
		

	}

}
