package com.chainsys.webapp.second;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.getWriter().append("Served at: ").append(request.getContextPath());
	     Cookie []allCookie=request.getCookies();
	     if(allCookie==null) {
	    	 System.out.println("there is no cookies ");
	    	 }
	     int length=allCookie.length;
	     for(int i=0;i<length;i++) {
	    	 System.out.println(allCookie[i].getName()+"_"+allCookie[i].getValue());
	     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		System.out.println(session.getId());
		Cookie firstcookie= new Cookie("Captain","Dhoni");
		firstcookie.setMaxAge(-1);
		// cookies life span end after this session
		response.addCookie(firstcookie);
		Cookie secondcookie= new Cookie("opener","Rohit");
		secondcookie.setMaxAge(2*24*60*60);
		response.addCookie(secondcookie);
		Cookie thirdcookie= new Cookie("bowler","boombra");
		response.addCookie(thirdcookie);
		Cookie fourthcookie= new Cookie("wiseCaptain","Raina");
		response.addCookie(fourthcookie);
		doGet(request,response);
		
	}

}
