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
@WebServlet("/empHome")

public class EmpHomeServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8227816943127241549L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EmpHomeServlet - POST");
		HttpSession session = req.getSession();
		UserPOJO user = (UserPOJO) req.getAttribute("user");
		Reim reim = new Reim();
		System.out.println(user);
		List<ReimPOJO> reimTable = reim.getEmpReimTable(user.getUserID());
		session.setAttribute("userTable", reimTable);
		req.setAttribute("empTableReim", reimTable);
		for(ReimPOJO x : reimTable){
			System.out.println(x);
		}
		RequestDispatcher view = req.getRequestDispatcher("employeeHP.jsp");
        view.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EmpHomeServlet - GET");
		HttpSession session = req.getSession();
		UserPOJO user = (UserPOJO) session.getAttribute("user");
		Reim reim = new Reim();
		System.out.println(user);
		List<ReimPOJO> reimTable = reim.getEmpReimTable(user.getUserID());
		session.setAttribute("userTable", reimTable);
		req.setAttribute("empTableReim", reimTable);
		for(ReimPOJO x : reimTable){
			System.out.println(x);
		}
		RequestDispatcher view = req.getRequestDispatcher("employeeHP.jsp");
        view.forward(req, resp);
	}
}
