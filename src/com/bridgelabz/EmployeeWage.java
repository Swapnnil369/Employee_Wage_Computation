package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int FULL_TIME_Work = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME_Work) {
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("The total employeeWage are : " + empWage);

    }


}
