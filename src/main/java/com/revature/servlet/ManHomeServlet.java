package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.Reim;
import com.revature.pojo.ReimPOJO;
import com.revature.pojo.UserPOJO;
@WebServlet("/manHome")
public class ManHomeServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 958261419027918646L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ManHomeServlet - POST");
		HttpSession session = req.getSession();
		UserPOJO user = (UserPOJO) session.getAttribute("user");
		Reim reim = new Reim();
		List<ReimPOJO> reimTable = reim.getManReimTable(user.getUserID());
		System.out.println(reimTable);
		session.setAttribute("userTable", reimTable);
		req.setAttribute("manTableReim", reimTable);
		for(ReimPOJO x : reimTable){
			System.out.println(x);
		}
		RequestDispatcher view = req.getRequestDispatcher("managerHP.jsp");
        view.forward(req, resp);
	}
}
