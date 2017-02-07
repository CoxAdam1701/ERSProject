package com.revature.dao;

import java.util.List;

import com.revature.pojo.ReimPOJO;
import com.revature.pojo.UserPOJO;

public interface DAOReim {
	/*
	 * tasks for this class
	 * 1. create procedure to return cursor for reimbursements for employee id
	 * 2. create procedure to add a new reimbursement for an employee 
	 * 3. create procedure to return cursor to populate the manager table for all employees
	 * 4. create procedure to approve or deny(change status and add id for approval field) a reimbursement 
	 */
	public List<ReimPOJO> getEmpReimTable(int empID);
	public List<ReimPOJO> getManReimTable(int empID);
	public void createNewReim(UserPOJO theUser, double theAmt, String theDesc, int reimType);
}
