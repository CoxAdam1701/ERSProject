package com.revature.dao;

import com.revature.pojo.UserPOJO;

public interface DAOUser {
	//this DAO will handle connections to get user object
	//depending on the r_id they will either be a manager or employee 
	public UserPOJO checkUsername(String username);

}
