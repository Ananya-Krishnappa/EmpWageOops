package com.bridgelabz;

public class EmpWageComputation {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;
	static final int NO_OF_WORKING_DAYS = 20;
	static final int MAX_HOURS_IN_MONTH = 100;
	static int totalEmpWage = 0;
	static int empRatePerHr = 20;
	static int totalWorkingdays = 0;
	static int empHrs = 0;
	static int empWage = 0;
	static int totalEmpHrs = 0;

	public static void main(String[] args) {
		EmpWageComputation emp = new EmpWageComputation();
		checkCondition(emp);
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
		System.out.println("daily wage of an employee " + empWage);
	}

	/**
	 * This method is to add part time employee and calculating wage
	 * 
	 * @param emp
	 */
	private static void addPartTime(EmpWageComputation emp) {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == Is_Part_Time)
			empHrs = 4;
		empWage = empHrs * empRatePerHr;
	}

	/**
	 * This method is used to use switch cases
	 * 
	 * @param emp
	 */
	private static void useSwitchCase(EmpWageComputation emp) {
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
		empWage = empHrs * empRatePerHr;
		System.out.println("daily wage of an employee " + empWage);
	}

	/**
	 * This method is calculating wages for month
	 * 
	 * @param emp
	 */
	private static void calculateMonthlyWages(EmpWageComputation emp) {
		for (int day = 1; day < NO_OF_WORKING_DAYS; day++) {
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
			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;
			System.out.println("daily wage of an employee" + empWage);
		}
		System.out.println("total wage of an employee" + totalEmpWage);
	}

	/**
	 * This method is calculating wages till a condition of total working hours or
	 * days is reached for a month
	 * 
	 * @param emp
	 */
	private static void checkCondition(EmpWageComputation emp) {
		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingdays < NO_OF_WORKING_DAYS) {
			int empHrs = 0;
			totalWorkingdays++;
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
			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;

			System.out.println("daily wage of an employee" + empWage);
		}
		System.out.println("total wage of an employee" + totalEmpWage);
	}
}
