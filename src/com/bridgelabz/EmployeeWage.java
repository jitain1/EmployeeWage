package com.bridgelabz;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String companyName;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursInMonth;
	private int totalEmpWage;
	private int empWorkingDays;
	private int totalEmpHrs;

	public EmployeeWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void computeEmpWage() {
		System.out.println("*********  CALCULATING EMPWAGE FOR   " + getCompanyName() + "  *********");
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays = 1;

		while (totalEmpHrs <= maxHoursInMonth && totalWorkingDays <= numOfWorkingDays) {
			// for (totalWorkingDays = 1; totalEmpHrs <= maxHoursInMonth && totalWorkingDays
			// < numOfWorkingDays; totalWorkingDays++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee is present Full time on day " + totalWorkingDays);
				totalWorkingDays += 1;
				empWorkingDays += 1;
				break;

			case IS_PART_TIME:
				empHrs = 4;
				System.out.println("Employee is present on day " + totalWorkingDays);
				totalWorkingDays += 1;
				empWorkingDays += 1;
				break;

			default:
				empHrs = 0;
				System.out.println("Employee is absenton day " + totalWorkingDays);
			}
			empWage = empHrs * empRatePerHour;
			totalEmpHrs += empHrs;
			totalEmpWage += empWage;
			System.out
					.println("Day " + totalWorkingDays + "	Employee hours : " + empHrs + "	Wage = " + empWage + "\n");
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println();
	}

	public static void main(String args[]) {
		EmployeeWage google = new EmployeeWage("Google", 50, 15, 200);
		EmployeeWage amazon = new EmployeeWage("Amazon", 80, 20, 120);
		EmployeeWage netflix = new EmployeeWage("Netflix", 90, 18, 220);

		google.computeEmpWage();
		System.out.println(google);
		System.out.println(
				"*****************************************************************************************************");
		System.out.println(
				"*****************************************************************************************************\n");

		amazon.computeEmpWage();
		System.out.println(amazon);
		System.out.println(
				"*****************************************************************************************************");
		System.out.println(
				"*****************************************************************************************************\n");

		netflix.computeEmpWage();
		System.out.println(netflix);
	}

	@Override
	public String toString() {
		return "[companyName=" + companyName + ", empRatePerHour=" + empRatePerHour + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHoursInMonth=" + maxHoursInMonth + "]\n[Total wage of Employee ="
				+ totalEmpWage + ", Employee worked for total of " + empWorkingDays + " days(total " + totalEmpHrs
				+ " hours)]";
	}

}