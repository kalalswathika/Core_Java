package com.college.app;
import java.util.Scanner;
import com.college.model.Person;
import com.college.model.Student;
import com.college.service.StudentService;
public class MainApp {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=scr.nextLine();
		System.out.println("Enter Age:");
		int age=scr.nextInt();
		System.out.println("Enter ContactNumber:");
		long contactNumber=scr.nextLong();
		System.out.println("Enter StudentId:");
		int studentId=scr.nextInt();
		System.out.println("Department:");
		String department=scr.next();
		System.out.println("CourseName:");
		String courseName=scr.next();
		System.out.println("Enter Course Fee:");
		double fee=scr.nextDouble();
		Student Std=new Student(studentId,department,courseName);
		Std.setName("Swathika");
		Std.setAge(22);
		Std.setContactNumber(5646165);
		/////
		StudentService service=new StudentService();
		double FinalFee=service.calculateDiscountedFee(fee, department);
		double discount=fee-FinalFee;
		Std.studentDetails();
		System.out.println("Original Fee:"+fee);
		System.out.println("Discount Applied:"+discount);
		System.out.println("Final Payable Fee:"+FinalFee);
   scr.close();
	}

}
