package com.bridgelabz;

public class EmployeeWage {
	
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	
	void calculateEmployeeWage(String company, int wage, int numberOfWorkingDays, int workingHrsPerMonth) {
		System.out.println("**** Calculating Employee wage for " + company + " ****");
		int wagePerHour = wage;
		int maxWorkingDays = numberOfWorkingDays;
		int maxWorkingHour = workingHrsPerMonth;
		
		int totalWorkingDays = 1;
		int totalWage = 0;
		int empWorkingDays=0;
		int totalEmpHrs = 0;
		
		while (totalEmpHrs <= maxWorkingHour && totalWorkingDays <= maxWorkingDays) {
			int empCheck=(int) (Math.random()*3);
			int dailyWage = 0;

			switch (empCheck) {
			case IS_FULL_TIME: {
				System.out.println("Employee is Present full time on day " + totalWorkingDays);
				dailyWage  = wagePerHour * FULL_DAY_HOUR;
				totalWage += dailyWage;
				System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
				totalEmpHrs = totalEmpHrs + FULL_DAY_HOUR;
				empWorkingDays += 1;
				break;
			}
			case IS_PART_TIME: {
				System.out.println("Employee is Present part time on day " + totalWorkingDays);
				dailyWage = wagePerHour * PART_TIME_HOUR;
				totalWage += dailyWage;
				System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
				totalEmpHrs = totalEmpHrs + PART_TIME_HOUR;
				empWorkingDays +=1;
				break;
			}
			default:
				System.out.println("Employee is absent.");
				System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
			}
			totalWorkingDays++;
		}
		System.out.println("*******************************************");
		System.out.println("Employee work for total of " + empWorkingDays + " days.");
		System.out.println("Employee works for total of " + totalEmpHrs + "hours.");
		System.out.println("Total salary of the employee after " + maxWorkingDays + " days is : " + totalWage);

	}
	
	

	public static void main(String[] args) {
		System.out.println("********Welcome to employee wage computation problem.**********\n");
		
		EmployeeWage obj = new EmployeeWage();
		obj.calculateEmployeeWage("Company1", 20, 30, 100);
	}

}
