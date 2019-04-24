package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        int choice;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("**************************");
            System.out.println("Enter 1 - Add Employee::");
            System.out.println("Enter 2 - View Employee::");
            System.out.println("Enter 3 - Search Employee::");
            System.out.println("Enter 4 - Edit Employee::");
            System.out.println("Enter 5 - Remove Employee::");
            System.out.println("Enter 6 - Exit Program::");
            System.out.println("**************************");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    //Add Employee....
                    AddEmployee addEmployee = new AddEmployee();
                    employeeList.addAll(addEmployee.addEmployee());
                    break;

                case 2:
                    //View Employee....
                    ViewEmployee viewEmployee = new ViewEmployee();
                    viewEmployee.viewEmployee(employeeList);
                    break;

                case 3:
                    //Search Employee....
                    SearchEmployee searchEmployee = new SearchEmployee();
                    searchEmployee.searchEmployee(employeeList);
                    break;

                case 4:
                    //Edit Employee....
                    EditEmployee editEmployee = new EditEmployee();
                    editEmployee.editEmployee(employeeList);
                    break;

                case 5:
                    //Remove Employee....
                    RemoveEmployee removeEmployee = new RemoveEmployee();
                    removeEmployee.removeEmployee(employeeList);
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);


    }
}
