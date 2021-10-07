package com.bridgelab.wagebuilder;

public class EmpWageBuilderUC11 implements IComputeWage {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	CompanyEmpWage[] companyArray = new CompanyEmpWage[5];
	int companyNo = 0;

	public static void main(String[] args) {

		EmpWageBuilderUC11 wageBuilder = new EmpWageBuilderUC11();
		wageBuilder.addNewCompany("Flipkart", 35, 120, 28);
		wageBuilder.addNewCompany("Amazone", 50, 140, 30);
		wageBuilder.calculateWage();
	}

	public void addNewCompany(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays) {

		companyArray[companyNo] = new CompanyEmpWage(companyName, perHrWage, maxWorkingHrs, maxWorkingDays);
		companyNo++;
	}

	public void calculateWage() {
		for (int i = 0; i < companyNo; i++) {
			calculateWage(companyArray[i]);
			System.out.println(companyArray[i]);
		}
	}

	public void calculateWage(CompanyEmpWage companyempwage) {

		int empHrs = 0, empWage = 0, totalEmpHr = 0, totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays < companyempwage.maxWorkingDays && totalEmpHr <= companyempwage.maxWorkingHrs) {
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
			empWage = empHrs * companyempwage.perHrWage;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		companyempwage.totalEmpWage = totalEmpHr * companyempwage.perHrWage;
	}
}
