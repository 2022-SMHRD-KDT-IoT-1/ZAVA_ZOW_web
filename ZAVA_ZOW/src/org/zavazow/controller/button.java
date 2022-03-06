package org.zavazow.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zavazow.model.ButtonDAO;
import org.zavazow.model.ButtonVO;


@WebServlet("/button")
public class button extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * String buttonnum = request.getParameter("buttonnum"); // 아두이노에서 받은 버튼값
		 * 
		 * System.out.println(buttonnum); // 0 : 승차요청, 1 : 요청 없음
		 * 
		 * ButtonDAO dao = new ButtonDAO(); ButtonVO vo = dao.selectButton(buttonnum);
		 * 
		 * System.out.println(vo.getBus_stop()); // 0일때 운리초교입구, 1일때 승객없음
		 * 
		 * String bus_stop = vo.getBus_stop();
		 * 
		 * System.out.println(bus_stop); // 0일때 운리초교입구, 1일때 승객없음
		 * 
		 * HttpSession session = request.getSession(); session.setAttribute("bus_stop",
		 * bus_stop); response.sendRedirect("DriverInterface.jsp");
		 */
	}

}
