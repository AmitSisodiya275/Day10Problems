package com.bridgelab.wagebuilder;

public class EmpWageBuilderUC8 {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	public static void main(String[] args) {

		EmpWageBuilderUC8 reliance = new EmpWageBuilderUC8();
		reliance.calculateWage("Reliance", 120, 24, 30);
		EmpWageBuilderUC8 dmart = new EmpWageBuilderUC8();
		dmart.calculateWage("dMart", 130, 28, 28);
	}

	public void calculateWage(String companyName, int MAX_WORKING_HRS, int MAX_WORKING_DAYS, int PER_HR_WAGE) {
		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHr = 0;
		int totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays < MAX_WORKING_DAYS && totalEmpHr <= MAX_WORKING_HRS) {
			int empCheck = (int) Math.floor(Math.random() * 10 % 3);
			totalEmpWorkingDays++;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHr += empHrs;
			empWage = empHrs * PER_HR_WAGE;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		totalEmpWage = totalEmpHr * PER_HR_WAGE;
		System.out.println("Total wage = " + totalEmpWage + " for company " + companyName);
	}
}
