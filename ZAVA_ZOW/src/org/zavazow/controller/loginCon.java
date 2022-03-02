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

@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		

		PassengerVO vo = new PassengerVO(id, pw);

		
		PassengerDAO dao = new PassengerDAO();
		PassengerVO uvo = dao.login(vo);

		if(uvo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("vo", uvo);
		}else {
			
		}
		
		response.sendRedirect("Main.jsp");
		
	}

}
