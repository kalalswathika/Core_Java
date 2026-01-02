package com.Package;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp1=new Employee(3,"Swathika","SoftwareDeveloper",50000.0,5);
		System.out.println("Employee Id:"+emp1.getEmpId());
		System.out.println("Employee Name:"+emp1.getEmpName());
		System.out.println("Employee Desg:"+emp1.getEmpDesg());
		System.out.println("Employee Salary:"+emp1.getEmpSalary());
		System.out.println("Employee PerformanceRating:"+emp1.getEmpRating());
		emp1.promoteEmployee("Software Engineering");
		System.out.println("Updated Salary:"+emp1.getEmpSalary());
		System.out.println("Updated Desg:"+emp1.getEmpDesg());

	}

}
