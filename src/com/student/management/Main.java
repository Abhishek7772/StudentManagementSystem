package com.student.management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Delete Students");
            System.out.println("5. Exit");
            System.out.println("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Course: ");
                    String course = sc.nextLine();

                    service.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                service.viewStudents();
                break;

                case 3:
                    System.out.println("Enter Student ID: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter Student ID: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
