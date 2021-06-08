package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpWageBuilder implements ICompanyEmpWage {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	private List<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyEmpWageMap;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		companyEmpWageMap = new HashMap<>();
	}

	public static void main(String args[]) {
		ICompanyEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("relaince", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for dmart company: " + empWageBuilder.getTotalWage("dmart"));
	}

	public void addCompanyEmpWage(String company, int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, EMP_RATE_PER_HR, NUM_OF_WORKING_DAYS,
				MAX_HRS_PER_MONTH);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.MAX_HRS_PER_MONTH
				&& totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME: {
				empHrs = 8;
				break;
			}
			case IS_PART_TIME: {
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

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);

		}

	}

	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
	}
}
