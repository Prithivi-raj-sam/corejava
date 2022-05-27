package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String id =session.getId();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
	    PrintWriter out =response.getWriter();
	    String url="Welcome";
	    String encodedUrl = response.encodeURL(url);// session id gets appended to the URL.
	    System.out.println(encodedUrl);
	    StringBuffer htmloutput=new StringBuffer();
	    htmloutput.append("<html>"
	    		+ "<head>"
	    		+ "<meta charset=\"ISO-8859-1\">"
	    		+ "<title>Insert title here</title>"
	    		+ "</head>"
	    		+ "<body><form action='"+encodedUrl+"' method='get'>");
	    htmloutput.append("<h1>Welcome</h1>"+id);
	    htmloutput.append("<input type='submit' name='submit' value='click' />");
	    htmloutput.append("</form></body></html>");
	    out.println(htmloutput);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
