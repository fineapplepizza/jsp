package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/tototo")
public class Ex05mini extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   String mini = request.getParameter("mini");
	   
	   response.setContentType("text/html;" );
	   PrintWriter out = response.getWriter();
	   
	   //one,two,three 이미지를 전송할 수 있도록 로직을 구현하시오!
	   if(mini.equals("one")) {
		  //mini1.jpg를 사용자에게 응답
		   
		   //한글로 되어있는 파일을 응답할 때 
		   //URLEncoder.encode(변환할 문자열 데이터, 인코딩방식)
			/* out.print("<img src='images/>"+("미니","euc-kr")+"1.png'>"); */
	   }
	   else if(mini.equals("two")) {
		   out.print("<img src='images/mini2.jpg'>");
	   }
	   else if(mini.equals("three")) {
		   out.print("<img src='images/mini3.jpg'>");
	   }
	
	
	}

}
