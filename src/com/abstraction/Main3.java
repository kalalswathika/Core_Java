package com.abstraction;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new Student("student1", "student1@example.com","User","Math,Science","90-80");
		user.accessDashboard();
		user.login();
		user.logout();
		user.updateProfie();
		System.out.println("**************");
		User user1=new Instructor("Instructor1", "instructor@example.com", "Instructor", "math-101","Submitted");	
        user1.accessDashboard();
        user1.login();
        user1.logout();
        user.updateProfie();
        System.out.println("*********************");
        User user2=new Admin("Admin1","Admin@example", "Admin", "SiteAnalitytics", "Add User,Remove User");
        user2.accessDashboard();
        user2.login();
        user2.logout();
        user2.updateProfie();
	}

}
