package com.company;

import java.util.Scanner;

public class SalaryEmployee extends Employee {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double totalSalary() {
        if (monthlySalary <= 0) {
            throw new IllegalArgumentException("Salary can't be zero");
        }
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMonthly Salary::" + getMonthlySalary();
    }
}
