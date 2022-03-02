package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.AdminDAO;
import org.zavazow.model.AdminVO;


@WebServlet("/joinACon")
public class joinACon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a_id = request.getParameter("a_id");
		String a_pw = request.getParameter("a_pw");
		String a_code = request.getParameter("a_code");
		
		AdminVO avo = new AdminVO(a_id, a_pw, a_code);
		
		AdminDAO dao = new AdminDAO();
		
		int cnt = dao.join(avo);
		
		if (cnt >0) {
			 System.out.println("succees");
			response.sendRedirect("join_success.jsp");
		}else {
			System.out.println("false");
			response.sendRedirect("Join_admin.jsp");
		}
		
		
	}

}
