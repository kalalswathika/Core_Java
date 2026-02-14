package com.oops;

import java.util.Scanner;

public class Employe {

    String empName;
    int empId;
    String empDep;

    public Employe(String empName, int empId, String empDep) {
        this.empName = empName;
        this.empId = empId;
        this.empDep = empDep;
    }

    public void employeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Department: " + empDep);
    }
    public static class ProjectEmploye extends Employe {

        String projectName;
        String projectRole;
        int[] performanceScores;
        public ProjectEmploye(String empName, int empId, String empDep,
                               String projectName, String projectRole,
                               int[] performanceScores) {

            super(empName, empId, empDep);
            this.projectName = projectName;
            this.projectRole = projectRole;
            this.performanceScores = performanceScores;
        }

        public void updateProjectRole(String newRole) {
            if (newRole == null || newRole.isEmpty()) {
                System.out.println("Invalid Role.");
            } else {
                projectRole = newRole;
                System.out.println("Project Role updated successfully.");
            }
        }

        public void updateProjectName(String newName) {
            if (newName == null || newName.isEmpty()) {
                System.out.println("Invalid Project Name.");
            } else {
                projectName = newName;
                System.out.println("Project Name updated successfully.");
            }
        }

        public void viewProfile() {
            System.out.println("--- Employee Profile ---");
            employeeDetails();
            System.out.println("Project Name: " + projectName);
            System.out.println("Project Role: " + projectRole);
            System.out.print("Performance Scores: ");
            for (int score : performanceScores) {
                System.out.print(score + " ");
            }
            System.out.println();
        }

        public void viewAveragePerformance() {
            int sum = 0;
            for (int score : performanceScores) {
                sum += score;
            }
            double avg = (double) sum / performanceScores.length;
            System.out.println("Average Performance Score: " + avg);
        }
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scr.nextLine();

        System.out.println("Enter Employee Id:");
        int id = scr.nextInt();
        scr.nextLine();

        System.out.println("Enter Employee Department:");
        String dep = scr.nextLine();

        System.out.println("Enter Project Name:");
        String pname = scr.nextLine();

        System.out.println("Enter Project Role:");
        String prole = scr.nextLine();

        System.out.println("Enter 3 Monthly Performance Scores:");
        int[] scores = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            scores[i] = scr.nextInt();

            if (scores[i] < 0 || scores[i] > 100) {
                System.out.println("Invalid Score!");
                scr.close();
                return;
            }
        }

        ProjectEmploye emp = new ProjectEmploye(name, id, dep, pname, prole, scores);

        System.out.println("Profile Created Successfully!");

        int choice;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Update Project Role");
            System.out.println("2. Update Project Name");
            System.out.println("3. View Employee Profile");
            System.out.println("4. View Average Performance Score");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scr.nextInt();
            scr.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter new Project Role: ");
                    String newRole = scr.nextLine();
                    emp.updateProjectRole(newRole);
                    break;

                case 2:
                    System.out.print("Enter new Project Name: ");
                    String newProject = scr.nextLine();
                    emp.updateProjectName(newProject);
                    break;

                case 3:
                    emp.viewProfile();
                    break;

                case 4:
                    emp.viewAveragePerformance();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid .");
            }

        } while (choice != 5);

        scr.close();
    }
}
