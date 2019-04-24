package com.company;

import java.util.List;
import java.util.Scanner;

public class ViewEmployee {

    public void viewEmployee(List<Employee> employeeList) {

        System.out.println("*************************************");
        System.out.println("1.View All Employee::");
        System.out.println("2.View Salary Employee::");
        System.out.println("3.View Commission Employee::");
        System.out.println("4.View BasicPlus Commission Employee::");
        System.out.println("5.View Hourly Employee::");
        System.out.println("6.Back to main Menu::");
        System.out.println("**************************************");

        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (!employeeList.isEmpty()) {

                    for (Employee employee : employeeList) {
                        System.out.println(employee.toString());
                    }
                }

                break;

            case 2:
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {

                        if (employee instanceof SalaryEmployee) {
                            System.out.println(employee.toString());
                        }
                    }
                }
                break;

            case 3:
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {

                        if (employee instanceof CommissionEmployee) {
                            System.out.println(employee.toString());
                        }
                    }
                }
                break;

            case 4:
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {

                        if (employee instanceof BasicPlusCommissionEmployee) {
                            System.out.println(employee.toString());
                        }
                    }
                }
                break;

            case 5:
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {

                        if (employee instanceof HourlyEmployee) {
                            System.out.println(employee.toString());
                        }
                    }
                }
                break;

            case 6:
                break;
        }
    }
}
