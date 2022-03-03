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


@WebServlet("/deleteACon")
public class deleteACon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("avo");
		
		AdminDAO dao = new AdminDAO();
		int cnt = dao.delete(avo.getA_id());
		
		if(cnt >0 ) {
			session.removeAttribute("avo");
			response.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("JoinA_update.jsp");
		}
		
		
	}

}
