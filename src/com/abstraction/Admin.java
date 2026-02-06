package com.abstraction;

public class Admin extends User{
	String siteAnalytics , userManagementTools;

	public Admin(String username, String email, String role, String siteAnalytics, String userManagementTools) {
		super(username, email, role);
		this.siteAnalytics = siteAnalytics;
		this.userManagementTools = userManagementTools;
	}
	public void accessDashboard() {
		System.out.println("SiteAnalytics:"+siteAnalytics);
		System.out.println("UserManagementTools:"+userManagementTools);
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
