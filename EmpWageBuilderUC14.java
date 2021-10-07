package com.bridgelab.wagebuilder;

import java.util.ArrayList;

public class EmpWageBuilderUC14 implements IComputeWage {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

	public static void main(String[] args) {

		EmpWageBuilderUC14 wageBuilder = new EmpWageBuilderUC14();
		wageBuilder.addNewCompany("Flipkart", 35, 120, 28);
		wageBuilder.addNewCompany("Amazon", 50, 140, 30);
		wageBuilder.addNewCompany("Gizmo", 28, 216, 26);
		wageBuilder.calculateWage();
		wageBuilder.getCompanyDetails("Amazon");
	}

	public void addNewCompany(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays) {

		companyList.add(new CompanyEmpWage(companyName, perHrWage, maxWorkingHrs, maxWorkingDays));
	}

	public void calculateWage() {
		for (int i = 0; i < companyList.size(); i++) {
			calculateWage(companyList.get(i));
			System.out.println(companyList.get(i));
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

	public void getCompanyDetails(String companyName) {
		for (int i = 0; i < companyList.size(); i++) {
			if (companyList.get(i).getCompanyName().equalsIgnoreCase(companyName)) {
				System.out.println("Total Wage for " + companyName + " is : " + companyList.get(i).getTotalEmpWage());
			}
		}
	}
}
