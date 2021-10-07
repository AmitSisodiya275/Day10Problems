package com.bridgelab.wagebuilder;

public interface IComputeWage {

	void addNewCompany(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays);
	void calculateWage();
}
