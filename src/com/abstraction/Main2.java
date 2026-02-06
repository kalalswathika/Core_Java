package com.abstraction;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employe=new FullTimeEmployee("John Doe", "12345", 50000, 10000);
        employe.calculateSalary();
        employe.applyLeave();
        employe.getDetails();
        System.out.println("************");
        Employee employe1=new PartTimeEmployee("Jane Smith", "67890", 20, 15);
        employe1.calculateSalary();
        employe1.applyLeave();
        employe1.getDetails();
        System.out.println("*************");
        Employee employe2=new Freelancer("Alice Johnson", "54321", 5000);
        employe2.calculateSalary();
        employe2.applyLeave();
        employe2.getDetails();
	}

}

