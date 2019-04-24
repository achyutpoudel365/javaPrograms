package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddEmployee {

    public List<Employee> addEmployee() {
        System.out.println("************************************");
        System.out.println("1.Add Salary Employee::");
        System.out.println("2.Add Commission Employee::");
        System.out.println("3.Add BasicPlus Commission Employee::");
        System.out.println("4.Add Hourly Employee::");
        System.out.println("5.Back to main Menu::");
        System.out.println("************************************");

        List<Employee> employeeList = new ArrayList<>();

        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {

            case 1:
                //Add Salary Employee....
                SalaryEmployee salaryEmployee = new SalaryEmployee();
                System.out.println("Enter Employee ID::");
                salaryEmployee.setEmployeeId(scanner.nextInt());
                System.out.println("Enter Employee Name::");
                salaryEmployee.setName(scanner.next());
                System.out.println("Enter Employee Address::");
                salaryEmployee.setAddress(scanner.next());
                System.out.println("Enter Monthly Salary of Employee");
                salaryEmployee.setMonthlySalary(scanner.nextDouble());
                salaryEmployee.setEmployeeType(EmployeeType.SALARY);
                employeeList.add(salaryEmployee);
                break;

            case 2:
                //Add Commission Employee....
                CommissionEmployee commissionEmployee = new CommissionEmployee();
                System.out.println("Enter Employee ID::");
                commissionEmployee.setEmployeeId(scanner.nextInt());
                System.out.println("Enter Employee Name::");
                commissionEmployee.setName(scanner.next());
                System.out.println("Enter Employee Address::");
                commissionEmployee.setAddress(scanner.next());
                System.out.println("Enter Commission Rate::");
                commissionEmployee.setRate(scanner.nextDouble());
                System.out.println("Enter Total Sales::");
                commissionEmployee.setTotalSales(scanner.nextDouble());
                commissionEmployee.setEmployeeType(EmployeeType.COMMISSION);
                employeeList.add(commissionEmployee);
                break;

            case 3:
                //Add BasicPlusCommission Employee....
                BasicPlusCommissionEmployee basicPlusCommissionEmployee = new BasicPlusCommissionEmployee();
                System.out.println("Enter Employee ID::");
                basicPlusCommissionEmployee.setEmployeeId(scanner.nextInt());
                System.out.println("Enter Employee Name::");
                basicPlusCommissionEmployee.setName(scanner.next());
                System.out.println("Enter Employee Address::");
                basicPlusCommissionEmployee.setAddress(scanner.next());
                System.out.println("Enter Basic Salary of Employee::");
                basicPlusCommissionEmployee.setBasicSalary(scanner.nextDouble());
                basicPlusCommissionEmployee.setEmployeeType(EmployeeType.BASIC_PLUS_COMMISSION);
                employeeList.add(basicPlusCommissionEmployee);
                break;

            case 4:
                //Add Hourly Employee....
                HourlyEmployee hourlyEmployee = new HourlyEmployee();
                System.out.println("Enter Employee ID::");
                hourlyEmployee.setEmployeeId(scanner.nextInt());
                System.out.println("Enter Employee Name::");
                hourlyEmployee.setName(scanner.next());
                System.out.println("Enter Employee Address::");
                hourlyEmployee.setAddress(scanner.next());
                System.out.println("Enter Total hours of Employee::");
                hourlyEmployee.setTotalHour(scanner.nextInt());
                System.out.println("Enter Hourly Rate of Employee::");
                hourlyEmployee.setHourlyRate(scanner.nextDouble());
                hourlyEmployee.setEmployeeType(EmployeeType.HOURLY);
                employeeList.add(hourlyEmployee);
                break;
            case 5:
                break;
        }
        return employeeList;

    }

}

