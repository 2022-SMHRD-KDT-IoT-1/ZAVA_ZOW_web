package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.DriverDAO;
import org.zavazow.model.DriverVO;

@WebServlet("/joinDCon")
public class joinDCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String d_id = request.getParameter("d_id");
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
		
		int cnt = dao.join(dvo);
		
		if (cnt >0) {
			 System.out.println("succees");
			response.sendRedirect("join_success.jsp");
		}else {
			System.out.println("false");
			response.sendRedirect("Join_driver.jsp");
		}
		
		
		

	}

}
