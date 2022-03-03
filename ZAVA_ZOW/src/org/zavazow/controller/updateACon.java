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


@WebServlet("/updateACon")
public class updateACon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		AdminVO a_avo = (AdminVO)session.getAttribute("avo");
		String a_id = a_avo.getA_id();
		
		String a_pw = request.getParameter("a_pw");
		String a_code = request.getParameter("a_code");
		
		AdminVO avo = new AdminVO(a_id, a_pw, a_code);
		
		AdminDAO dao = new AdminDAO();
		
		int cnt = dao.update(avo);
		
		if(cnt > 0) {
			session.setAttribute("avo", avo);
			response.sendRedirect("Main.jsp");
			System.out.println("succees");
		}else {
			response.sendRedirect("JoinA_update.jsp");
			System.out.println("false");
		}
		
		
	}

}
