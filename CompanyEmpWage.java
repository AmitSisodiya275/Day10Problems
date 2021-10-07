package com.bridgelab.wagebuilder;

public class CompanyEmpWage {
	
	public String companyName;
	public int perHrWage, maxWorkingHrs, maxWorkingDays, totalEmpWage;

	public CompanyEmpWage(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays) {
		this.companyName = companyName;
		this.perHrWage = perHrWage;
		this.maxWorkingHrs = maxWorkingHrs;
		this.maxWorkingDays = maxWorkingDays;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage [companyName=" + companyName + ", perHrWage=" + perHrWage + ", maxWorkingHrs="
				+ maxWorkingHrs + ", maxWorkingDays=" + maxWorkingDays + ", totalEmpWage=" + totalEmpWage + "]";
	}
}
