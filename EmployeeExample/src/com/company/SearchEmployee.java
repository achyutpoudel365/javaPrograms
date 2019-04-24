package com.company;

import java.util.List;
import java.util.Scanner;

public class SearchEmployee {

    public void searchEmployee(List<Employee> employeeList) {

        System.out.println("********************");
        System.out.println("1.Search by ID::");
        System.out.println("2.Search by Name::");
        System.out.println("3.Search by Address::");
        System.out.println("4.Back to main Menu::");
        System.out.println("********************");

        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter ID to be searched::");
                int id = scanner.nextInt();
                for (Employee employee : employeeList) {
                    if (employee.getEmployeeId() == id) {
                        System.out.println(employee.toString());
                    }
                }
                break;

            case 2:
                System.out.println("Enter Name to be searched::");
                String name = scanner.next();
                for (Employee employee : employeeList) {
                    if (employee.getName().equals(name)) {
                        System.out.println(employee.toString());
                    }
                }
                break;
            case 3:
                System.out.println("Enter Address to be searched::");
                String address = scanner.next();
                for (Employee employee : employeeList) {
                    if (employee.getAddress().equals(address)) {
                        System.out.println(employee.toString());
                    }

                }
                break;
            case 4:
                break;


        }


    }
}

