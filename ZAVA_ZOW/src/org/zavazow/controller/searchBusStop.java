package org.zavazow.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.BusStopDAO;
import org.zavazow.model.BusStopVO;

@WebServlet("/searchBusStop")
public class searchBusStop extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String stopName = request.getParameter("stopName");
//		System.out.println(stopName);

		BusStopDAO dao = new BusStopDAO();
		
		List<BusStopVO> list = dao.selectBusStop(stopName);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getBusStopId());
//			System.out.println(list.get(i).getBusStopName());
//			System.out.println(list.get(i).getNextBusStop());
//		}
		
		
		request.setAttribute("busStopInfo", list);
		
		response.setCharacterEncoding("utf-8");
		
		RequestDispatcher rd = request.getRequestDispatcher("busStopSelect.jsp");
		rd.forward(request, response);
		

	}

}
