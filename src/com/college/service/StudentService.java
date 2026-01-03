package com.college.service;

public class StudentService {
	public static double calculateDiscountedFee(double fee,String department) {
		if(department.equals("IT")) {
			return fee-(fee*0.10);
		}
		return fee;
	}
}
