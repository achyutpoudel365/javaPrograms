package com.company;

import java.util.List;
import java.util.Scanner;

public class RemoveEmployee {

    public void removeEmployee(List<Employee> employeeList) {

        System.out.println("1.Remove Employee by ID::");
        System.out.println("2.Remove Employee by Name::");
        System.out.println("3.Remove Employee by Address::");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                //Delete Employee by ID.....
                int id;
                System.out.println("Enter employee ID which you want to Remove::");
                id = scanner.nextInt();

                if (!employeeList.isEmpty()) {
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getEmployeeId() == id) {
                            employeeList.remove(i);
                        }
                    }
                }
                break;

            case 2:
                String name;
                System.out.println("Enter employee Name which you want to Remove::");
                name = scanner.next();

                if (!employeeList.isEmpty()) {
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getName().equals(name)) {
                            employeeList.remove(i);
                        }
                    }
                }
                break;

            case 3:

                String address;
                System.out.println("Enter employee Address which you want to Remove::");
                address = scanner.next();

                if (!employeeList.isEmpty()) {
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getAddress().equals(address)) {
                            employeeList.remove(i);
                        }
                    }
                }

                break;
        }

    }
}