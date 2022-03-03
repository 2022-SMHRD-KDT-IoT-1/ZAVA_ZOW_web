package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zavazow.model.DriverDAO;
import org.zavazow.model.DriverVO;


@WebServlet("/deleteDCon")
public class deleteDCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		DriverVO dvo = (DriverVO)session.getAttribute("dvo");
		
		DriverDAO dao = new DriverDAO();
		int cnt = dao.delete(dvo.getD_id());
		
		if(cnt > 0) {
			session.removeAttribute("dvo");
			response.sendRedirect("Main.jsp");
		}else {
			response.sendRedirect("JoinD_update.jsp");
		}
	}

}
