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
	
	    //�� ���� ���ڿ� �����ڸ� ������ ����
//		String num1 = request.getParameter("num1");
//		String num2 = request.getParameter("num2");
     	String op = request.getParameter("op");
		// �������� ����ڿ��� ������ �� �ִ� ���α׷��� �����Ͻÿ�.
     	response.setContentType("text/html; charset=euc-kr");
		 PrintWriter out = response.getWriter();
		   
		 
		 int n1 = Integer.parseInt(request.getParameter("num1"));
		 int n2 = Integer.parseInt(request.getParameter("num2"));
		 int result =0;
		//- �����ڿ� ���� ����� �޶��� �� ����
	   if(op.equals("+")) {
		
		  result = n1+n2;
	   }else if(op.equals("-")) {
		   result = n1-n2;
		   
	   }else if(op.equals("*")) {
		  result=n1*n2;
		   
	   }else if(op.equals("/")) {
		result=n1/n2;
		   
	   }
	   
	  out.print("<h1>������: "+result+"</h1>") ;
	}

}
