package com.Exam;
import java.util.Scanner;
class Staff {
  String staffName;
  String staffId;
  String baseShift;
 public Staff(String staffName, String staffId, String baseShift) {
     this.staffName = staffName;
     this.staffId = staffId;
     this.baseShift = baseShift;
 }
}
class DepartmentStaff extends Staff {
 private String departmentName;
 private String responsibilityLevel;
 DepartmentStaff(String name, String id, String shift,
                 String department, String responsibility) {
     super(name, id, shift);
     this.departmentName = department;
     this.responsibilityLevel = responsibility;
     System.out.println("\nStaff Profile Created");
 }
 void updateResponsibility(String responsibility) {
     if (responsibility == null || responsibility.equals("")) {
         System.out.println("Invalid Responsibility Level. Update failed.");
     } else {
         responsibilityLevel = responsibility;
         System.out.println("Responsibility Level updated successfully.");
     }
 }
 void updateDepartment(String department) {
     if (department == null || department.equals("")) {
         System.out.println("Invalid Department Name. Update failed.");
     } else {
         departmentName = department;
         System.out.println("Department Name updated successfully.");
     }
 }
 void viewProfile() {
     System.out.println("\nStaff Details");
     System.out.println("Name: " + staffName);
     System.out.println("Staff ID: " + staffId);
     System.out.println("Department: " + departmentName);
     System.out.println("Responsibility: " + responsibilityLevel);
     System.out.println("Shift: " + baseShift);
 }
}
public class HotelStaffApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Staff Name: ");
     String name = sc.nextLine();
     System.out.print("Enter Staff ID: ");
     String id = sc.nextLine();
     System.out.print("Enter Base Shift: ");
     String shift = sc.nextLine();
     System.out.print("Enter Department Name: ");
     String dept = sc.nextLine();
     System.out.print("Enter Responsibility Level: ");
     String resp = sc.nextLine();
     DepartmentStaff staff =
             new DepartmentStaff(name, id, shift, dept, resp);

     int choice;
     do {
         System.out.println("--- Menu ---");
         System.out.println("1. Update Responsibility");
         System.out.println("2. Update Department");
         System.out.println("3. View Profile");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine();
         switch (choice) {
             case 1:
                 System.out.print("Enter new Responsibility Level: ");
                 staff.updateResponsibility(sc.nextLine());
                 break;

             case 2:
                 System.out.print("Enter new Department Name: ");
                 staff.updateDepartment(sc.nextLine());
                 break;

             case 3:
                 staff.viewProfile();
                 break;

             case 4:
                 System.out.println("Exiting program...");
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
         }

     } while (choice != 4);

     sc.close();
 }
}

