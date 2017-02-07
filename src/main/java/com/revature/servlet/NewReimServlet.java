package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.Reim;
import com.revature.pojo.UserPOJO;
@WebServlet("/newReim")

public class NewReimServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2812742552456220234L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("NewReimServlet - GET");		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("NewReimServlet - POST");
		HttpSession session = req.getSession();
		UserPOJO user = (UserPOJO) session.getAttribute("user");
		Reim reim = new Reim();
		ObjectMapper mapper = new ObjectMapper(); 
		String johnJSON = mapper.writeValueAsString(user);
		
		resp.setContentType("application/json");
		
		PrintWriter out = resp.getWriter();
		out.write(johnJSON);
		reim.createNewReim(user, Double.parseDouble(req.getAttribute("theAmt").toString()), req.getAttribute("theDesc").toString(), Integer.parseInt(req.getAttribute("theType").toString()));
//		UserPOJO user = (UserPOJO) req.getAttribute("currentUser");
		 RequestDispatcher view = req.getRequestDispatcher("home");
	        view.forward(req, resp);
	}

}
