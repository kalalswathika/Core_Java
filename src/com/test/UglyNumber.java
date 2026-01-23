package com.test;

public class UglyNumber {
	public boolean isUglyNumber(int num) {
		if (num <= 0)
            return false;
		while(num!=1) {
			if(num%2==0) {
				num/=2;
			}
			if(num%3==0) {
			num/=3;	
			}
			 if(num%5==0) {
				num/=5;
			 }
			else {
				return false;
			}
		}
			return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UglyNumber UN=new UglyNumber();
       System.out.println(UN.isUglyNumber(25)?"UglyNumber":"NotUglyNumber");
	}
}
