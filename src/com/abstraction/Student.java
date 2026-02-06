package com.abstraction;

public class Student extends User{
	String enrolledCourses , grades;

	public Student(String username, String email, String role, String enrolledCourses, String grades) {
		super(username, email, role);
		this.enrolledCourses = enrolledCourses;
		this.grades = grades;
	}
	public void accessDashboard() {
		System.out.println("EnrolledCourse:"+ enrolledCourses);
		System.out.println("Grades:"+grades);
	}
	public void login() {
		System.out.println("login Sucessfull");
	}
    public void logout() {
    	System.out.println("logout Sucessfull");
    }
    public void updateProfie() {
    	System.out.println("Profile updated successfully");
    }
}
