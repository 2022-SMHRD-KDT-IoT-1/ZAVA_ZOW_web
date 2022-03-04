package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.ButtonDAO;
import org.zavazow.model.ButtonVO;


@WebServlet("/button")
public class button extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String buttonnum = request.getParameter("buttonnum");
		 
		 ButtonDAO dao = new ButtonDAO();
		 ButtonVO vo = dao.selectButton(buttonnum);
		 
		 int cnt = dao.updateButton(vo);
		 
		 System.out.println(vo);
		 
		 
		 
		 
	}

}
