package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FUll_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
        int empHrs=0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FUll_TIME:
                    empHrs = 8;
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day "+totalWorkingDays+" Emp Hr"+empHrs);

        }
        totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
        System.out.println("Day "+totalWorkingDays+" Hrs "+totalEmpHrs+" Total employee wage : " + totalEmpWage);
    }

}
