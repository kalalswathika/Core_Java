package com.Exam;
import java.util.Scanner;
class InsurancePolicy {
     String customerName;
     String policyType;
     double policyAmount;
     double approvedAmount;
     String policyStatus;
public InsurancePolicy() {
        this.approvedAmount = 0.0;
        this.policyStatus = "Pending";
    }
public InsurancePolicy(String customerName, String policyType) {
        this();
        this.customerName = customerName;
        this.policyType = policyType;
    }
public InsurancePolicy(String customerName, String policyType, double policyAmount) {
        this(customerName, policyType);
        if (policyAmount > 0) {
            this.policyAmount = policyAmount;
        } else {
            System.out.println("Invalid Policy Amount. Set to 0.");
            this.policyAmount = 0;
        }
        System.out.println("\nPolicy Profile Created");
    }
  public void updateApprovedAmount(double amount) {
        if (amount < 0 || amount > policyAmount) {
            System.out.println("Invalid Approved Amount. Update failed.");
        } else {
            approvedAmount = amount;
            System.out.println("Approved Amount updated successfully.");
        }
    }
public void changePolicyStatus(String status) {
        if (status == null || status.equals("")) {
            System.out.println("Invalid Policy Status. Update failed.");
        } else {
            policyStatus = status;
            System.out.println("Policy Status updated successfully.");
        }
    }
public  void viewSummary() {
        System.out.println("\nPolicy Summary");
        System.out.println("Customer: " + customerName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Policy Amount: " + policyAmount);
        System.out.println("Approved Amount: " + approvedAmount);
        System.out.println("Policy Status: " + policyStatus);
    }
}
public class InsurancePolicyApp {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = scr.nextLine();
        System.out.print("Enter Policy Type: ");
        String type = scr.nextLine();
        System.out.print("Enter Policy Amount: ");
        double amount = scr.nextDouble();
        InsurancePolicy policy =new InsurancePolicy(name, type, amount);
        int choice;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scr.nextInt();
            scr.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Approved Amount: ");
                    policy.updateApprovedAmount(scr.nextDouble());
                    break;
                case 2:
                    scr.nextLine(); 
                    System.out.print("Enter Policy Status: ");
                    policy.changePolicyStatus(scr.nextLine());
                    break;
                case 3:
                    policy.viewSummary();
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
