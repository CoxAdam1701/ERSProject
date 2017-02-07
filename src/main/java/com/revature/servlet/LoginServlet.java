package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.User;
import com.revature.pojo.UserPOJO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet - GET");
		RequestDispatcher view = req.getRequestDispatcher("login.jsp");
      view.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// start session
		System.out.println("LoginServlet - POST");
		HttpSession session = req.getSession();
		// get username and password and send to dao
		User user = new User();
		UserPOJO currentUser = user.checkUsername(req.getParameter("username"));
		System.out.println(currentUser);
		if (currentUser != null && req.getParameter("username").equals(currentUser.getUsername())
				&& req.getParameter("password").equals(currentUser.getPassword())) {
			session.setAttribute("authState", new Object());
			session.setAttribute("user", currentUser);
			if (currentUser.getRoleID() == 1) {
				resp.sendRedirect("empHome");
//				view.forward(req, resp);
			} else {
				resp.sendRedirect("manHome");
//				view.forward(req, resp);
			}
		} else {
			session.setAttribute("authState", null);
			System.out.println("Redirecting to login.jsp");
			resp.sendRedirect("login");
		}
	}

}
