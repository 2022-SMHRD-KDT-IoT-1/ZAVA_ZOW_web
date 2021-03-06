package org.zavazow.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zavazow.model.BoardDAO;
import org.zavazow.model.BoardVO;



@WebServlet("/goBoardMain")
public class goBoardMain extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// DAO 메소드 사용 -> 모든 게시글 가져오기
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.selectBoard();

		// request scope에 list 담기
		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("boardMain.jsp");
		rd.forward(request, response);

	}

}
