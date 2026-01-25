package com.Exam;
import java.util.Scanner;
class SalesEmployee {
 String employeeName;
 int employeeId;
 SalesEmployee(String employeeName, int employeeId) {
     this.employeeName = employeeName;
     this.employeeId = employeeId;
 }
}

class PerformanceEmployee extends SalesEmployee {
double totalSales;
int salesCount;
double averageSales;
String performanceGrade;
 PerformanceEmployee(String name, int id) {
     super(name, id);
     totalSales = 0;
     salesCount = 0;
     performanceGrade = "Not Calculated";
 }
 void addSales(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid Sales Amount. Entry rejected.");
     } else {
         totalSales += amount;
         salesCount++;
         System.out.println("Sales entry added successfully.");
     }
 }
 void calculatePerformance() {
     if (salesCount == 0) {
         System.out.println("No sales data available to calculate performance.");
         return;
     }
     averageSales = totalSales / salesCount;
     if (averageSales >= 20000) {
         performanceGrade = "Excellent";
     } else if (averageSales >= 12000) {
         performanceGrade = "Good";
     } else {
         performanceGrade = "Needs Improvement";
     }
     System.out.println("\nPerformance Profile Created");
 }
 void viewSummary() {
     System.out.println("Performance Summary");
     System.out.println("Employee: " + employeeName);
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Total Sales: " + totalSales);
     System.out.println("Average Sales: " + averageSales);
     System.out.println("Performance Grade: " + performanceGrade);
 }
}
public class EmployeePerformanceApp {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter Employee Name: ");
     String name = scr.nextLine();
     System.out.print("Enter Employee ID: ");
     int id = scr.nextInt();
     PerformanceEmployee emp = new PerformanceEmployee(name, id);
     int choice;
     do {
         System.out.println("--- Menu ---");
         System.out.println("1. Add Sales");
         System.out.println("2. Recalculate Result");
         System.out.println("3. View Summary");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = scr.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter Sales Amount: ");
                 emp.addSales(scr.nextDouble());
                 break;
             case 2:
                 emp.calculatePerformance();
                 break;
             case 3:
                 emp.viewSummary();
                 break;
             case 4:
                 System.out.println("Exiting program...");
                 break;
             default:
                 System.out.println("Invalid choice. Try again.");
         }

     } while (choice != 4);
     scr.close();
 }
}

