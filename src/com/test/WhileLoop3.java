package com.test;

public class WhileLoop3 {

	    public static boolean isNeon(int num) {
	        int square = num * num;
	        int sum = 0;

	        while (square > 0) {
	            sum += square % 10;
	            square /= 10;
	        }
	        return sum == num;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop3 L3=new WhileLoop3();
		System.out.println(L3.isNeon(9)?"NeonNumber":"Not NeonNumber");
	}
	}
