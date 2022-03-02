package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.zavazow.model.PassengerDAO;
import org.zavazow.model.PassengerVO;


@WebServlet("/updateCon")
public class updateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		PassengerVO uvo = (PassengerVO)session.getAttribute("vo");
		String id = uvo.getId();
		
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nick = request.getParameter("nick");
		String birth_yy = request.getParameter("birth_yy");
		String birth_mm = request.getParameter("birth_mm");
		String birth_dd = request.getParameter("birth_dd");
		String gender = request.getParameter("gender");
		String cardNum = request.getParameter("cardNum");
		String tel = request.getParameter("tel");
		String handi = request.getParameter("handi");
		
		PassengerVO vo = new PassengerVO(id, pw, name, nick, birth_yy, birth_mm, birth_dd, gender, cardNum, tel, handi);
		
		PassengerDAO dao = new PassengerDAO();
		
		int cnt = dao.update(vo);
		
		if (cnt >0) {
			session.setAttribute("vo", vo);
			response.sendRedirect("Main.jsp");
			System.out.println("succees");
		}else {
			response.sendRedirect("Join_update.jsp");
			System.out.println("false");
		}
		
	}

	
	
}
