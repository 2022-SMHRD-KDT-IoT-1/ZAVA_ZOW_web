package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zavazow.model.AdminDAO;
import org.zavazow.model.AdminVO;


@WebServlet("/loginACon")
public class loginACon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a_id = request.getParameter("a_id");
		String a_pw = request.getParameter("a_pw");
		
		AdminVO avo = new AdminVO(a_id, a_pw);
		
		AdminDAO dao = new AdminDAO();
		AdminVO uvo = dao.login(avo);
		
		if(uvo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("avo", uvo);
		}else {
			
		}
		
		response.sendRedirect("Main.jsp");
		
		
	}

}
