package com.Scanner;

public class StudentResult {
	private String StudentName;
	private int StudentId;
	private String CourseName;
	private double totalMarks;
public StudentResult(String StudentName,int StudentId,String CourseName,double totalMarks) {
	this.StudentName=StudentName;
	this.StudentId=StudentId;
	this.CourseName=CourseName;
	this.totalMarks=totalMarks;
}
public void addMarks(double marks) {
	totalMarks=totalMarks+marks;
	System.out.println("Marks Added Sucessfully:"+totalMarks);
	if(marks<=0) {
		System.out.println("Invalid Marks Entered");
	}
}
public void CalGrade(double totalMarks) {
	if(totalMarks>=90) {
		System.out.println("Grade A");
	}
	else if(totalMarks>80 && totalMarks<=89) {
		System.out.println("Grade B");
	}
	else if(totalMarks>70 && totalMarks<=79)
	{
		System.out.println("Grade C");
	}
	else if(totalMarks>60 && totalMarks<=69) {
		System.out.println("Grade D");
	}
	else if(totalMarks<=60){
		System.out.println("Fail");
	}
}
public void Marks()
{
	System.out.println("Your total marks:"+totalMarks);
}
public void exit()
{
	System.out.println("Thank you!");
}

}
