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
		 * String buttonnum = request.getParameter("buttonnum"); // �Ƶ��̳뿡�� ���� ��ư��
		 * 
		 * System.out.println(buttonnum); // 0 : ������û, 1 : ��û ����
		 * 
		 * ButtonDAO dao = new ButtonDAO(); ButtonVO vo = dao.selectButton(buttonnum);
		 * 
		 * System.out.println(vo.getBus_stop()); // 0�϶� ��ʱ��Ա�, 1�϶� �°�����
		 * 
		 * String bus_stop = vo.getBus_stop();
		 * 
		 * System.out.println(bus_stop); // 0�϶� ��ʱ��Ա�, 1�϶� �°�����
		 * 
		 * HttpSession session = request.getSession(); session.setAttribute("bus_stop",
		 * bus_stop); response.sendRedirect("DriverInterface.jsp");
		 */
	}

}
