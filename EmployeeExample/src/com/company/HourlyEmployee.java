package com.company;

public class HourlyEmployee extends Employee {

    private int totalHour;

    private double hourlyRate;

    public int getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(int totalHour) {
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double totalSalary() {

        if (getTotalHour() > 40 || getTotalHour() <= 0)
            throw new IllegalArgumentException("Can't work more than 40 hours a week!!!!!");
        if (getTotalHour() <= 40) {
            return getTotalHour() * getHourlyRate();
        } else {
            return getHourlyRate() * 40 + (getTotalHour() - 40) * getHourlyRate() * 1.5;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Hour::" + getTotalHour() + "\nHourly Rate::" + getHourlyRate();
    }
}
