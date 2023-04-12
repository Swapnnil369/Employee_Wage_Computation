package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK = 2;
    public static final int FULL_TIME_WORK = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAY = 20;

    public static void main(String[] args) {
        int empHour = 0, empWage = 0, totalWage = 0;
        int day=0;
        for (int i = 0; i < NUM_OF_WORKING_DAY; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case FULL_TIME_WORK:
                    empHour = 8;
                    break;

                case PART_TIME_WORK:
                    empHour = 4;
                    break;

                default:
                    empHour = 0;
            }

            empWage = empHour * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            day++;
            System.out.println("Employee wages are : " + empWage);
        }

        System.out.println("Day :"+day+" total employee wages are : " + totalWage);
    }

}
