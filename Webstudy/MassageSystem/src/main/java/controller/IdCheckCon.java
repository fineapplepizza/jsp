package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

@WebServlet("/IdCheckCon")
public class IdCheckCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 String email = request.getParameter("email");
	 
	 MemberDAO dao = new MemberDAO();
	 boolean check = dao.idCheck(email);
	 
	 //text로 받음  응답해주는 메소드 
	 PrintWriter out = response.getWriter(); 
	 out.print(check);
	 
	}

}
