package com.bridgelabz;

public class EmployeeWage {
    static final int FULL_TIME_Work = 1;
    static final int PART_TIME_Work = 2;

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {

            case FULL_TIME_Work:
                System.out.println("Full time work");
                empHrs = 8;
                break;
            case PART_TIME_Work:
                System.out.println("Part time work");
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("The total employeeWage are : " + empWage);

    }


}
