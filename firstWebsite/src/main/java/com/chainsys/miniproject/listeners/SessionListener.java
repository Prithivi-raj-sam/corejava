package com.chainsys.miniproject.listeners;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("session created");
//		HttpSession session = arg0.getSession();
//		System.out.println("session id:"+session.getId());
//		session.setMaxInactiveInterval(60);
		
	} 

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("session destroyed");
		HttpSession session = arg0.getSession();
		System.out.println("session id:"+session.getId());
	}
	
}
