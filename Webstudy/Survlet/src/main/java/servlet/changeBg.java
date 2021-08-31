package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/changeBg")
public class changeBg extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	       String color = request.getParameter("color");
	       
	       
	       response.setContentType("text/html; charset=euc-kr");
	       PrintWriter out =  response.getWriter();
	       
	       out.print("<style>body{background-color:"+color+"}</style>");
	}

}
