package com.java.task;
class Employee{
	double salary=50000.0;
}
 class Manager extends Employee{
	 double bonus=20000.0;
 }
public class Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Manager m = new Manager();
	        double totalSalary = m.salary + m.bonus;
	        System.out.println("Total Salary: " + totalSalary);
	    }
	}
