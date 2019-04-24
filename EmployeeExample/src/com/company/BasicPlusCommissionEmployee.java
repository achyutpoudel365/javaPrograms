package com.company;

public class BasicPlusCommissionEmployee extends CommissionEmployee {

    private double basicSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override

    public double totalSalary() {
        return super.totalSalary() + getBasicSalary();
    }

    @Override

    public String toString() {

        return super.toString() + "\nBasic Salary::" + getBasicSalary();
    }

}
