package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;


@WebServlet("/EmailCheckCon")
public class EmailCheckCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    String email = request.getParameter("email");
	    
	    System.out.println(email);
	    
	   MemberDAO dao = new MemberDAO();
	   boolean check = dao.idCheck(email);
	   
	   //out객체를 사용해서 check가 가지고 있는 값을 보내줄것
	   PrintWriter out = response.getWriter();
	   
	   out.print(check);
	
	
	}

}
