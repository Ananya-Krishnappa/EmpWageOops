package com.bridgelabz;

public class CompanyEmpWage {

	public final String company;
	public final int EMP_RATE_PER_HR;
	public final int NUM_OF_WORKING_DAYS;
	public final int MAX_HRS_PER_MONTH;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_PER_MONTH = MAX_HRS_PER_MONTH;
		totalEmpWage = 0;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total emp wage for company: " + company + " is: " + totalEmpWage;
	}

}
