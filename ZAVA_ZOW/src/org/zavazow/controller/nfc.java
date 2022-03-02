package org.zavazow.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zavazow.model.CardDAO;
import org.zavazow.model.CardVO;

@WebServlet("/nfc")
public class nfc extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cardnum = request.getParameter("cardnum"); // nfc : 아두이노에서 받은 카드값
		
		CardDAO dao = new CardDAO();		
		CardVO vo = dao.selectCard(cardnum);
		
		System.out.println(vo);
		
//		System.out.println(vo);
		
		
		
//		if(cardnum != null) {
//			System.out.println(vo.getCardnum());
//			System.out.println(vo.getStatus());
//		}
		
//		vo.setStatus("0");
		
		
//		if(cardnum == null) {
//			System.out.println("No Card!");
//		} else {
//			System.out.println(cardnum);
//						
//			CardDAO dao = new CardDAO();
//			CardVO vo = dao.selectCard(cardnum);
//			
//			System.out.println(vo);
			
//			int cnt = dao.updateCard(vo);
			
			
//			System.out.println(vo);
			
//			if(vo.getStatus().equals("1")) {
//				dao.updateCard(vo);
//				System.out.println(vo.getStatus());
//			} else {
//				System.out.println("왜 안되죠?");
//			}
			
//		}

	}

}
