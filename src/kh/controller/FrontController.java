package kh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		request.setCharacterEncoding("utf8");		
		boolean isRedirect=true;
		String dst = null;
		
		MessageDAO mdao = new MessageDAO();
		
		if(command.equals("/input.do")) {
			String name = request.getParameter("name");
			String message = request.getParameter("message");		
			MessageDTO dto = new MessageDTO(name, message);
			
			int result = mdao.insertMessage(dto);
			isRedirect = false;
			dst = "inputview.jsp";		
		}
		
		if(isRedirect) {
			response.sendRedirect(dst);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(dst);
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
