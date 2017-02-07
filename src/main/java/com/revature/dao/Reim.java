package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.enums.StatusEnum;
import com.revature.pojo.ReimPOJO;
import com.revature.pojo.UserPOJO;

import oracle.jdbc.OracleTypes;

public class Reim implements DAOReim {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "ers";
	private static String password = "p4ssw0rd";
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ReimPOJO> getEmpReimTable(int empID) {
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			String query = "{call GET_REIM_TABLE_EMP(?, ?)}";
			CallableStatement cs = con.prepareCall(query);
			cs.setInt(1, empID);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			ResultSet rs = (ResultSet) cs.getObject(2);
			List<ReimPOJO> reimList = new ArrayList<ReimPOJO>();
			while (rs.next()) {
				StatusEnum status = null;
				if (rs.getInt(10) == 1) {
					status = StatusEnum.APPROVED;
				} else if (rs.getInt(10) == 2) {
					status = StatusEnum.PENDING;
				} else {
					status = StatusEnum.DENIED;
				}
				reimList.add(new ReimPOJO(rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getBlob(4), rs.getDate(5),
						rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), status.getName()));

				if (reimList.isEmpty()) {
					return null;
				}
				return reimList;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * tasks for this class 2. create procedure to add a new reimbursement for
	 * an employee 3. create procedure to return cursor to populate the manager
	 * table for all employees 4. create procedure to approve or deny(change
	 * status and add id for approval field) a reimbursement
	 */

	@Override
	public List<ReimPOJO> getManReimTable(int empID) {

		try (Connection con = DriverManager.getConnection(url, username, password)) {
			// String query = "{call get_reim_table_man(?, ?)}";
			// CallableStatement cs = con.prepareCall(query);
			// cs.setInt(1, empID);
			// cs.registerOutParameter(2, OracleTypes.CURSOR);
			// cs.executeQuery();
			Statement stmt = con.createStatement();
			String query = "select * from ers_reimbursements";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Id Name    Job");
			// ResultSet rs = (ResultSet) cs.getObject(2);
			List<ReimPOJO> reimList = new ArrayList<ReimPOJO>();
			while (rs.next()) {
				StatusEnum status = null;
				if (rs.getInt(10) == 1) {
					status = StatusEnum.APPROVED;
				} else if (rs.getInt(10) == 2) {
					status = StatusEnum.PENDING;
				} else {
					status = StatusEnum.DENIED;
				}
				reimList.add(new ReimPOJO(rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getBlob(4), rs.getDate(5),
						rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), status.getName()));

				if (reimList.isEmpty()) {
					return null;
				}
				return reimList;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void createNewReim(UserPOJO theUser, double theAmt, String theDesc, int reimType) {
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			String query = "{call make_new_reim(?, ?, ?, ?)}";
			CallableStatement cs = con.prepareCall(query);
			cs.setInt(1, theUser.getUserID());
			cs.setDouble(2, theAmt);
			cs.setString(3, theDesc);
			cs.setInt(4, reimType);
			cs.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
