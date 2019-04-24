package com.company;

import java.util.Scanner;

public abstract class Employee {

    private int employeeId;

    private String name;

    private String address;

    private EmployeeType employeeType;


    public abstract double totalSalary();

    @Override

    public String toString() {
        return "<<<<<<<<EMPLOYEE DETAILS>>>>>>>>"
                +"\nEmployee Name::" + getName()
                + "\nAddress::" + getAddress()
                + "\nEmployee ID::" + getEmployeeId();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
