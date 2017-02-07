package com.revature.pojo;

public class UserPOJO {
	
	private int userID;
	private String username;
	private String password;
	private String fName;
	private String lname;
	private String email;
	private int roleID;
	public UserPOJO() {
		super();
		this.userID = 1;
		this.username = "Hello";
		this.password = "World";
		this.fName = "bob";
		this.lname = "crachet";
		this.email = "lkdajsf;lkjds";
		this.roleID = 2;
	}
	public UserPOJO(int userID, String username, String password, String fName, String lname, String email,
			int roleID) {
		//super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.fName = fName;
		this.lname = lname;
		this.email = email;
		this.roleID = roleID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	@Override
	public String toString() {
		return "Employee [userID=" + userID + ", username=" + username + ", password=" + password + ", fName=" + fName
				+ ", lname=" + lname + ", email=" + email + ", roleID=" + roleID + "]";
	}

}
