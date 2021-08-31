package bookmanager_controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookDAO;
import model.BookDTO;


@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		

	
		BookDAO dao =  new BookDAO();
		BookDTO member = dao.login_member(id, pw);
		
		
		
			if(member != null) {
				
				//技记规侥
				HttpSession session = request.getSession();
				session.setAttribute("nick", member.getNick());
				response.sendRedirect("Question4_Main.jsp");
			}else {
				System.out.println("干滚 澄");
				response.sendRedirect("Question4_login.jsp");
				
			}
		
		
	
		
	}

}
