package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GlobalState
 */
public class GlobalState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalState() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title><Attributes</title></head><body>");
		Enumeration<String> names=request.getParameterNames();
//		while(names.hasMoreElements()) {
//			String parameterName=names.nextElement();
//			System.out.println(parameterName);
//			String []values =request.getParameterValues(parameterName);
//			int length= values.length;
//			for(int i=0;i<length;i++) {
//				System.out.println("value: "+values[i]);
//			}
//		}
		String submit_value = request.getParameter("submit");
		ServletContext ctx=this.getServletContext();  // get handle to servletcontext maintain by Tomcat server
		if (submit_value.equals("set")) {
			String salary_input = request.getParameter("salary"); 
			ctx.setAttribute("ctxsalary", salary_input);//storing data in Servlet context for all users 
			out.println("<h1>value set :</h1>"+salary_input);
			// session.setAttribute stores the data in a collection using key and value
			// "salary" is key
		} else if (submit_value.equals("fetch")) {
			String ctx_Salary=(String)ctx.getAttribute("ctxsalary");
//			String ctx_Salary=ctx.getAttribute("ctxsalary").toString();
			if(ctx_Salary == null) {
				out.println("<h1>GLOBAL CONTEXT NOT SET<h1>");
			}else			
			out.println("<h1>value fetch :</h1>" + ctx_Salary); //returning value from servlet context to html page
		} 
		out.println("<input type='hidden' value='set' name='submit'/>");
		out.println("</body></html>");
		//data stored in servlet context in multiuser, and can be
		// read or modify from all other servlets.
	}
	

}
