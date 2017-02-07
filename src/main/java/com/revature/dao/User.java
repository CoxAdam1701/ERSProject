package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pojo.UserPOJO;

public class User implements DAOUser {

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
	public UserPOJO checkUsername(String theUsername) {

		try (Connection con = DriverManager.getConnection(url, username, password)) {
			String query = "SELECT * FROM ers_users WHERE u_username=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, theUsername);
			ResultSet rs = ps.executeQuery();
			UserPOJO user = null;
			while (rs.next()) {
				user = new UserPOJO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
			}
			if (user == null) {
				return null;
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
