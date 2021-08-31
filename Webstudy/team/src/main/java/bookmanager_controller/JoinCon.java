package bookmanager_controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookDAO;
import model.BookDTO;

@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
	
		BookDAO dao = new BookDAO();
		BookDTO book = new BookDTO(id, pw, nick, email,tel);
		int cnt = dao.insert_member(book);

		if (cnt > 0) {
			
			request.setAttribute("nick", nick);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Question4_login.jsp");
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("Question4_login.jsp");
		}
		
	}

}
