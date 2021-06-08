package com.bridgelabz;

public interface ICompanyEmpWage {
	/**
	 * This method is used to add a company for the employee wage calculation
	 * 
	 * @param company
	 * @param EMP_RATE_PER_HR
	 * @param NUM_OF_WORKING_DAYS
	 * @param MAX_HRS_PER_MONTH
	 */
	public void addCompanyEmpWage(String company, int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_PER_MONTH);

	/**
	 * This method calculates total employee wage for all the companies added
	 */
	public void computeEmpWage();

	/**
	 * This method returns the total wage for a given company
	 * 
	 * @param company
	 * @return
	 */
	public int getTotalWage(String company);

}
