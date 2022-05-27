package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class requestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public requestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		System.out.println("Dopost called");
		response.setContentType("text/html");  // we need give content type
		PrintWriter out=response.getWriter();
		out.println("inside do post");
		HttpSession ses = request.getSession(true);
		String str_name = (String)request.getParameter("name"); //request scope
//		out.println(str_name);
		out.println("</div>"+str_name+"</div>");
		String company = (String)request.getParameter("company");
		out.println(company);
//		out.println("</div>"+company+"</div>");
		Enumeration enu = getInitParameterNames(); //Enumeration is like iterator  vector only can support by Enumeration
//		  while(enu.hasMoreElements())
//		    {
//		  		String init = (String)enu.nextElement();
//		  		out.println(init+" : " +getInitParameter(init)+"<br>");
//		  	}
	}

}
