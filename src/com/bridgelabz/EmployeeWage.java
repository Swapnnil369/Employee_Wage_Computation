package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_Work = 1;
    public static final int FUll_TIME_WORK = 2;
     int numOfCompany = 0;
     public CompanyEmpWage[] companyEmpWageArray=new CompanyEmpWage[2];

    public void addCompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empRatePerHr, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0, totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;


        while (totalWorkingDays <= companyEmpWage.getNumOfWorkingDays() && totalEmpHrs < companyEmpWage.getMaxHoursPerMonth()) {
            totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case FUll_TIME_WORK:
                    empHrs = 8;
                    break;
                case PART_TIME_Work:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyEmpWage.getEmpRatePerHour();
            totalEmpHrs += empHrs;
            totalEmpWage += empWage;

        }
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();

        employeeWage.addCompanyEmpWage("TCS", 20, 20, 100);
        employeeWage.addCompanyEmpWage("INFOSYS", 10, 15, 90);
        employeeWage.computeEmpWage();

    }
}
