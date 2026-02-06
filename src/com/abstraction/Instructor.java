package com.abstraction;

public class Instructor extends User{
	String createdCourses , studentSubmissions;

	public Instructor(String username, String email, String role, String createdCourses, String studentSubmissions) {
		super(username, email, role);
		this.createdCourses = createdCourses;
		this.studentSubmissions = studentSubmissions;
	}
	public void accessDashboard() {
	System.out.println("CreatedCourse:"+createdCourses);
	System.out.println("StudentSubmission:"+studentSubmissions);

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
