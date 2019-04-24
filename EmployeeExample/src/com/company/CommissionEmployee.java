package com.company;

public class CommissionEmployee extends Employee {


    private double rate;

    private double totalSales;


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double totalSalary() {
        return getTotalSales() * getRate();
    }

    @Override
    public String toString() {

        return super.toString() + "\nTotal Sales::" + getTotalSales() + "\nRate::" + getRate();
    }
}
