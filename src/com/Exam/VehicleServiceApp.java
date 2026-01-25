package com.Exam;
import java.util.Scanner;
class Vehicle{
	String OwnerName;
	String  VehicleNumber;
	String VehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		super();
		OwnerName = ownerName;
		VehicleNumber = vehicleNumber;
		VehicleType = vehicleType;
	}
}
class ServiceVehicle extends Vehicle {
     String serviceCenterName;
     String serviceCategory;

public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType,
                   String serviceCenterName, String serviceCategory) {
        super(ownerName, vehicleNumber, vehicleType);
        this.serviceCenterName = serviceCenterName;
        this.serviceCategory = serviceCategory;
    }
public void updateServiceCategory(String category) {
    if (category == null || category.equals("")) {
        System.out.println("Invalid Service Category. Update failed.");
    } else {
        this.serviceCategory = category;
        System.out.println("Service Category updated successfully.");
    }
}
public void updateServiceCenter(String center) {
    if (center == null || center.equals("")) {
        System.out.println("Invalid Service Center Name. Update failed.");
    } else {
        this.serviceCenterName = center;
        System.out.println("Service Center updated successfully.");
    }
}
public void viewProfile() {
    System.out.println("Vehicle Profile Created");
    System.out.println("Vehicle Details");
    System.out.println("Owner: " + OwnerName);
    System.out.println("Vehicle Number: " + VehicleNumber);
    System.out.println("Vehicle Type: " + VehicleType);
    System.out.println("Service Center: " + serviceCenterName);
    System.out.println("Service Category: " + serviceCategory);
}
}
public class VehicleServiceApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        String name = scr.nextLine();
        System.out.print("Enter Vehicle Number: ");
        String number = scr.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = scr.nextLine();
        System.out.print("Enter Service Center Name: ");
        String center = scr.nextLine();
        System.out.print("Enter Service Category: ");
        String category = scr.nextLine();
        ServiceVehicle vehicle =new ServiceVehicle(name, number, type, center, category);
        int choice;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Update Service Category");
            System.out.println("2. Update Service Center");
            System.out.println("3. View Profile");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scr.nextInt();
            scr.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter new Service Category: ");
                    vehicle.updateServiceCategory(scr.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new Service Center Name: ");
                    vehicle.updateServiceCenter(scr.nextLine());
                    break;
                case 3:
                    vehicle.viewProfile();
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

