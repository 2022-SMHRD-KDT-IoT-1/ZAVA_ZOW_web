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


@WebServlet("/updateDCon")
public class updateDCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		DriverVO d_dvo = (DriverVO)session.getAttribute("dvo");
		String d_id = d_dvo.getD_id();
		
		String d_pw = request.getParameter("d_pw");
		String d_name = request.getParameter("d_name");
		String d_nick = request.getParameter("d_nick");
		String dbirth_yy = request.getParameter("dbirth_yy");
		String dbirth_mm = request.getParameter("dbirth_mm");
		String dbirth_dd = request.getParameter("dbirth_dd");
		String d_gender = request.getParameter("d_gender");
		String d_company = request.getParameter("d_company");
		String d_tel = request.getParameter("d_tel");
		String d_joindate = request.getParameter("d_joindate");
		
		DriverVO dvo = new DriverVO(d_id, d_pw, d_name, d_nick, dbirth_yy, dbirth_mm, dbirth_dd, d_gender, d_company, d_tel, d_joindate);
		
		DriverDAO dao = new DriverDAO();
		
		int cnt = dao.update(dvo);
		
		if(cnt > 0) {
			session.setAttribute("dvo", dvo);
			response.sendRedirect("Main.jsp");
			System.out.println("succees");
		}else {
			response.sendRedirect("JoinD_update.jsp");
			System.out.println("false");
		}
		
		
	}

}
