package com.Account;
import com.Bank.BankAccount;
public class BankProcessor {

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount(12345,"Swathika",80000.0);
		System.out.println(obj1.getAccountNumber());
		System.out.println(obj1.getAccountHolder());
		System.out.println(obj1.getBalance());
		obj1.deposite(20000.0);
			System.out.println(obj1.getBalance());
		obj1.withDraw(15000.0);
		System.out.println(obj1.getBalance());
		

	}

}
