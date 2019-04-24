package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EditEmployee {

    Scanner scanner = new Scanner(System.in);

    public List<Employee> editEmployee(List<Employee> employeeList) {

        System.out.println("******************");
        System.out.println("1.Edit by ID::");
        System.out.println("2.Edit by Name::");
        System.out.println("3.Edit by Address::");
        System.out.println("******************");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter ID of employee to be edited::");
                int id = scanner.nextInt();

                Employee newEmployee = null;
                Employee oldEmployee = null;
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {
                        if (employee.getEmployeeId() == id) {
                            oldEmployee = employee;
                            newEmployee = editIndividualEmployee(employee);
                        }
                    }
                }
                Collections.replaceAll(employeeList, oldEmployee, newEmployee);
                break;

            case 2:
                System.out.println("Enter Name of employee to be edited::");
                String name = scanner.next();

                Employee newEmployee1 = null;
                Employee oldEmployee1 = null;
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {
                        if (employee.getName().equals(name)) {
                            oldEmployee1 = employee;
                            newEmployee1 = editIndividualEmployee(employee);
                        }
                    }
                }
                Collections.replaceAll(employeeList, oldEmployee1, newEmployee1);

                break;
            case 3:
                System.out.println("Enter Address of employee to be edited::");
                String address = scanner.next();

                Employee newEmployee2 = null;
                Employee oldEmployee2 = null;
                if (!employeeList.isEmpty()) {
                    for (Employee employee : employeeList) {
                        if (employee.getAddress().equals(address)) {
                            oldEmployee2 = employee;
                            newEmployee2 = editIndividualEmployee(employee);
                        }
                    }
                }
                Collections.replaceAll(employeeList, oldEmployee2, newEmployee2);

                break;
        }
        return employeeList;
    }

    private Employee editIndividualEmployee(Employee employee) {

        switch (employee.getEmployeeType()) {
            case SALARY:
                employee = editSalaryEmployee(employee);
                break;
            case COMMISSION:
                employee = editCommissionEmployee(employee);
                break;
            case BASIC_PLUS_COMMISSION:
                employee = editBasicPlusCommissionEmployee(employee);
                break;
            case HOURLY:
                employee = ediHourlyEmployee(employee);
                break;
        }

        return employee;
    }

    private Employee editSalaryEmployee(Employee employee) {

        //New Input for Salary Employee....
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
        employee = salaryEmployee;
        return employee;
    }

    private Employee editCommissionEmployee(Employee employee) {

        //New Input for Commission Employee....
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
        employee = commissionEmployee;
        return commissionEmployee;
    }

    private Employee editBasicPlusCommissionEmployee(Employee employee) {

        //New Input for BasicPlus Commission Employee....
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
        employee = basicPlusCommissionEmployee;
        return basicPlusCommissionEmployee;
    }

    private Employee ediHourlyEmployee(Employee employee) {
        //New Input for Hourly Employee.....
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
        employee = hourlyEmployee;
        return hourlyEmployee;
    }
}
