package com.bridgelab.wagebuilder;

public class EmpWageBuilderUC9 {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	private String companyName;
	private int perHrWage, maxWorkingHrs, maxWorkingDays, totalEmpWage;

	public EmpWageBuilderUC9(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays) {
		this.companyName = companyName;
		this.perHrWage = perHrWage;
		this.maxWorkingHrs = maxWorkingHrs;
		this.maxWorkingDays = maxWorkingDays;
	}

	public static void main(String[] args) {

		EmpWageBuilderUC9 reliance = new EmpWageBuilderUC9("Reliance", 25, 120, 26);
		EmpWageBuilderUC9 fbb = new EmpWageBuilderUC9("Fashion at Big Bazar", 22, 140, 28);
		reliance.calculateWage();
		System.out.println(reliance);
		fbb.calculateWage();
		System.out.println(fbb);
	}

	public void calculateWage() {
		// Variables
		int empHrs = 0, empWage = 0, totalEmpHr = 0, totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays < maxWorkingDays && totalEmpHr <= maxWorkingHrs) {
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
			empWage = empHrs * perHrWage;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		totalEmpWage = totalEmpHr * perHrWage;
	}

	public String toString() {
		return "Total Wage for company " + this.companyName + " is : " + totalEmpWage;
	}
}
