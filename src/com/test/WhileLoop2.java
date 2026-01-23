package com.test;

public class WhileLoop2 {

	public static void main(String[] args) {
	int num=10001;
	int rev=0;
	int temp=num;
	while(num>0) {
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
	}
	System.out.println(rev);
	System.out.println((rev==temp?"palindrome":"Not palindrome"));

	}
}
