package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/plus")
public class Ex04plus extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          
		//ex04_plus���������� �Է��� �� ���� ������ �� ������ ����
		String num1 = request.getParameter("num1");//input�±׿� �ִ� name�Ӽ���
		String num2 = request.getParameter("num2");
		
		//���ڿ� -> ������ȯ
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		System.out.println("�� ���� ��: "+(n1+n2));
		
		//����ڿ��� ������ ������ ����
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>�� ���� ������</h1>");
		out.print("���: "+(n1+n2));
       
	}

}
