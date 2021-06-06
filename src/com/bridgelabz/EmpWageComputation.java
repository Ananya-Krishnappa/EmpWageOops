package com.bridgelabz;

public class EmpWageComputation {
	static final int Is_Full_Time = 1;
	static int empRatePerHr = 20;
	static int empHrs = 0;
	static int empWage = 0;

	public static void main(String[] args) {
		EmpWageComputation emp = new EmpWageComputation();
		isEmployeePresent(emp);
	}

	/**
	 * This method is checking if employee is present or not
	 * 
	 * @param emp
	 * @return
	 */
	private static boolean isEmployeePresent(EmpWageComputation emp) {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time) {
			System.out.println("employee is present");
			calculateDailyWage(emp);
		} else
			System.out.println("employee is not present");
		return false;
	}

	/**
	 * This method is calculating daily wages
	 * 
	 * @param emp
	 */
	private static void calculateDailyWage(EmpWageComputation emp) {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time)
			empHrs = 8;
		empWage = empHrs * empRatePerHr;
		System.out.println("daily wage of an employee" + empWage);
	}
}
