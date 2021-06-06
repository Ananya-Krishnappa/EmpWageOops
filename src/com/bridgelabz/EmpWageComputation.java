package com.bridgelabz;

public class EmpWageComputation {
	static final int Is_Full_Time = 1;

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
		} else
			System.out.println("employee is not present");
		return false;
	}
}
