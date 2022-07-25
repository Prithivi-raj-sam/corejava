package com.chainsys.webapp.second;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SigninServlet
 */
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String id =session.getId();
		System.out.println("id : "+id);
		String option = request.getParameter("submit");
		if(option.equals("logoff")){
			session.invalidate();
			// the session terminated. 
			return;
		}
		RequestDispatcher rd=request.getRequestDispatcher("UserServlet");
		rd.forward(request, response);
//		response.sendRedirect("UserServlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session =request.getSession();
//		String id =session.getId();
//		System.out.println("id : "+id);
//		String option = request.getParameter("submit");
//		if(option.equals("logoff")){
//			session.invalidate();
//			// the session terminated. 
//			return;
//		}
		// response.encodeUrl will append session id to the url
//		System.out.println(encodedUrl);
		
//		doGet(request,response);
//		response.sendRedirect("UserServlet");
	}

}
