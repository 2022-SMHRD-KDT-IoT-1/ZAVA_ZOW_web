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
import org.zavazow.model.PassengerDAO;
import org.zavazow.model.PassengerVO;


@WebServlet("/loginDCon")
public class loginDCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String d_id = request.getParameter("d_id");
		String d_pw = request.getParameter("d_pw");
		

		DriverVO dvo = new DriverVO(d_id, d_pw);

		
		DriverDAO dao = new DriverDAO();
		DriverVO uvo = dao.login(dvo);

		if(uvo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("dvo", uvo);
		}else {
			
		}
		
		response.sendRedirect("Main.jsp");
		
	}
	

}
