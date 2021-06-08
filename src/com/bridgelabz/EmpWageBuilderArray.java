package com.bridgelabz;

public class EmpWageBuilderArray {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addEmpWageComputation(String company, int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS,
			int MAX_HRS_PER_MONTH) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EMP_RATE_PER_HR, NUM_OF_WORKING_DAYS,
				MAX_HRS_PER_MONTH);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	/**
	 * this method is computing employee wage
	 * @param companyEmpWage
	 * @return
	 */
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.MAX_HRS_PER_MONTH
				&& totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Full_Time: {
				empHrs = 8;
				break;
			}
			case Is_Part_Time: {
				empHrs = 4;
				break;
			}
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day# :" + totalWorkingDays + " Emp Hr " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HR;
	}

	public static void main(String args[]) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addEmpWageComputation("dmart", 20, 2, 10);
		empWageBuilder.addEmpWageComputation("relaince", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}
}
