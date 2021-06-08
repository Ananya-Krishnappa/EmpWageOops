package com.bridgelabz;

public class EmpWageComputation {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;
	private final String company;
	private static int EMP_RATE_PER_HR;
	private static int NO_WORKING_DAYS;
	private static int MAX_HRS_PER_MONTH;
	private static int totalEmpWage;

	public EmpWageComputation(String company, int EMP_RATE_PER_HR, int NO_WORKING_DAYS, int MAX_HRS_PER_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.NO_WORKING_DAYS = NO_WORKING_DAYS;
		this.MAX_HRS_PER_MONTH = MAX_HRS_PER_MONTH;
	}

	/**
	 * This method is calculating wages till a condition of total working hours or
	 * days is reached for a month
	 * 
	 * @param emp
	 */
	private static void calculateWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < NO_WORKING_DAYS) {
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
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
	}

	public String toString() {
		return "Total emp wage for company: " + company + " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageComputation dmart = new EmpWageComputation("dmart", 20, 20, 100);
		EmpWageComputation kmart = new EmpWageComputation("kmart", 5, 15, 100);
		dmart.calculateWage();
		System.out.println(dmart);
		kmart.calculateWage();
		System.out.println(kmart);

	}

}
