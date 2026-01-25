package com.Exam;
import java.util.Scanner;
class SubscriptionPlan {
    String subscriberName;
    String planType;
    double planCost;
    double paidAmount;
    String subscriptionStatus;
    SubscriptionPlan() {
        paidAmount = 0.0;
        subscriptionStatus = "Active";
    }
 public SubscriptionPlan(String subscriberName, String planType) {
        this();
        this.subscriberName = subscriberName;
        this.planType = planType;
    }
public SubscriptionPlan(String subscriberName, String planType, double planCost) {
        this(subscriberName, planType);
        if (planCost > 0) {
            this.planCost = planCost;
        } else {
            System.out.println("Invalid Plan Cost. Set to 0.");
            this.planCost = 0;
        }
        System.out.println("\nSubscription Profile Created");
    }
public void updatePaidAmount(double amount) {
        if (amount < 0 || amount > planCost) {
            System.out.println("Invalid Paid Amount. Update failed.");
        } else {
            paidAmount = amount;
            System.out.println("Payment updated successfully.");
        }
    }
public void changeStatus(String status) {
        if (status == null || status.equals("")) {
            System.out.println("Invalid Subscription Status. Update failed.");
        } else {
            subscriptionStatus = status;
            System.out.println("Subscription Status updated successfully.");
        }
    }
  public void viewSummary() {
        System.out.println("\nSubscription Summary");
        System.out.println("Subscriber: " + subscriberName);
        System.out.println("Plan Type: " + planType);
        System.out.println("Plan Cost: " + planCost);
        System.out.println("Paid Amount: " + paidAmount);
        System.out.println("Subscription Status: " + subscriptionStatus);
    }
}

public class SubscriptionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subscriber Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Plan Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Plan Cost: ");
        double cost = sc.nextDouble();

        SubscriptionPlan sub = new SubscriptionPlan(name, type, cost);

        int choice;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Update Payment");
            System.out.println("2. Change Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Paid Amount: ");
                    sub.updatePaidAmount(sc.nextDouble());
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Subscription Status: ");
                    sub.changeStatus(sc.nextLine());
                    break;
                case 3:
                    sub.viewSummary();
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

