package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.PassengerDAO;
import org.zavazow.model.PassengerVO;

@WebServlet("/joinCon")
public class joinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
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
		
		int cnt = dao.join(vo);
		
		if (cnt >0) {
			 System.out.println("succees");
			response.sendRedirect("join_success.jsp");
		}else {
			System.out.println("false");
			response.sendRedirect("Join_psg.jsp");
		}
		
	}
	

}
