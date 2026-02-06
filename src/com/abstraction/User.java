package com.abstraction;

public abstract class User {
	String username , email , role;

	public User(String username, String email, String role) {
		super();
		this.username = username;
		this.email = email;
		this.role = role;
	}
	abstract void accessDashboard();
	public void login() {
		System.out.println("All users can log in");
	}
    public void logout() {
    	System.out.println("All users can log out");
    }
    public void updateProfie() {
    	System.out.println("All users can update their profiles");
    }

}
