package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int employee=1;
        int empCheck=(int)Math.floor(Math.random()*10)%2;

        if (empCheck==employee){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
