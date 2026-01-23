package com.test;

public class HarshadNumber {
	public static boolean isHarshadNumber(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			if(temp%sum==0) {
				return true;
			}
		}
		return false;	
	}
	public static void main(String[] args) {
	System.out.println(isHarshadNumber(18)?"HarshadNumber":"Not HarshadNumber");
	}

}
