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
	   
	   //one,two,three �̹����� ������ �� �ֵ��� ������ �����Ͻÿ�!
	   if(mini.equals("one")) {
		  //mini1.jpg�� ����ڿ��� ����
		   
		   //�ѱ۷� �Ǿ��ִ� ������ ������ �� 
		   //URLEncoder.encode(��ȯ�� ���ڿ� ������, ���ڵ����)
			/* out.print("<img src='images/>"+("�̴�","euc-kr")+"1.png'>"); */
	   }
	   else if(mini.equals("two")) {
		   out.print("<img src='images/mini2.jpg'>");
	   }
	   else if(mini.equals("three")) {
		   out.print("<img src='images/mini3.jpg'>");
	   }
	
	
	}

}
