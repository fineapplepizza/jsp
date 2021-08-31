package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalResult")
public class Ex07CalResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    //두 개의 숫자와 연산자를 변수에 저장
//		String num1 = request.getParameter("num1");
//		String num2 = request.getParameter("num2");
     	String op = request.getParameter("op");
		// 연산결과를 사용자에게 응답할 수 있는 프로그램을 구현하시오.
     	response.setContentType("text/html; charset=euc-kr");
		 PrintWriter out = response.getWriter();
		   
		 
		 int n1 = Integer.parseInt(request.getParameter("num1"));
		 int n2 = Integer.parseInt(request.getParameter("num2"));
		 int result =0;
		//- 연산자에 따라 결과가 달라질 수 있음
	   if(op.equals("+")) {
		
		  result = n1+n2;
	   }else if(op.equals("-")) {
		   result = n1-n2;
		   
	   }else if(op.equals("*")) {
		  result=n1*n2;
		   
	   }else if(op.equals("/")) {
		result=n1/n2;
		   
	   }
	   
	  out.print("<h1>연산결과: "+result+"</h1>") ;
	}

}
