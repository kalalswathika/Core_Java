package com.Package;

public class Employee {
	private int empId;
	private String empName;
	private String empDesg;
	private double salary;
	private int performanceRating;
public Employee(int empId,String empName,String empDesg,double salary,int performanceRating) {
	this.empId=empId;
	this.empName=empName;
	this.empDesg=empDesg;
	this.salary=salary;
	this.performanceRating=performanceRating;
}
//getters
public int getEmpId() {
	return empId; 
}
public String getEmpName() {
	return empName; 
}
public String getEmpDesg() {
	return empDesg; 
}
public double getEmpSalary() {
	return salary; 
}
public int getEmpRating() {
	return performanceRating; 
}
//setters
public void setEmpId(int empId) {
	this.empId=empId;
}
public void setEmpName(String empName) {
	this.empName=empName;
}
public void setEmpId(String empDesg) {
	this.empDesg=empDesg;
}
public void setEmPSalary(double salary) {
	this.salary=salary;
}
public void setEmpRating(int performanceRating) {
	this.performanceRating=performanceRating;
}
public void promoteEmployee(String newDesignation) {
	if(performanceRating>=4) {
		salary+=salary*0.2;
		empDesg="SoftwareEnginnering";
		System.out.println("Salary had been hiked");
	}
	else {
		System.out.println("No Promotion");
	}
}
}
