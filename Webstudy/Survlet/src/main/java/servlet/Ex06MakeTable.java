package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class Ex06MakeTable extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   String data = request.getParameter("room");
	   
	   response.setContentType("text/html;");
	   PrintWriter out = response.getWriter();
	   
	   int room = Integer.parseInt(data);
	   
	   out.print("<table border='1'>");
	   out.print("<tr>");
	   //입력받은 방의 개수 만큼 td태그를 생성하시오 
	   for(int i =0; i<room;i++) {
	   out.print("<td>"+(i+1)+"</td>");
	   }
	   
	   out.print("</tr>");
	   out.print("</table>");
	
	}

}
