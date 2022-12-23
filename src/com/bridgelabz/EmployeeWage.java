package com.bridgelabz;

public class EmployeeWage {

	static final int WAGE_PER_HOUR = 20;
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4; 

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage calculation problem.");

		int dailyWage = 0;
		int empCheck = (int) (Math.random()*3);
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present full time.");
			dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Wage of the employee is: " + dailyWage);
		}else if(empCheck == IS_PART_TIME){
			System.out.println("Employee is Present part time.");
			dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
			System.out.println("Wage of the employee is: " + dailyWage);
		}else {
			System.out.println("Employee is absent.");
			System.out.println("Wage of the employee is: " + dailyWage);
		}
	}
}
