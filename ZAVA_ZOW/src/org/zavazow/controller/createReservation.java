package org.zavazow.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.ReservationDAO;
import org.zavazow.model.ReservationVO;

@WebServlet("/createReservation")
public class createReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String lineId = request.getParameter("lineId");
		String busId = request.getParameter("busId");
		String busStopId = request.getParameter("busStopId");
		int reservationYN = 1;
		
//		System.out.println(lineId);
//		System.out.println(busId);
//		System.out.println(busStopId);
		
		ReservationVO vo = new ReservationVO(busStopId, lineId, busId, reservationYN);
		ReservationDAO dao = new ReservationDAO();
		int cnt = dao.createReservation(vo);
		
		if (cnt > 0) {
			System.out.println("예약 완료!");
			response.sendRedirect("busStopSearch.html");
		}
		
		
		
	}

}
