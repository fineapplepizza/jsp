package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Response")
public class Ex02Response extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response��ü: ����ڿ��� ������ �������� �� ����ϴ� ��ü
		//ex) HTML����, Text, ������ �̵�, �̹���,...
		
		//����ڿ��� � ������ �����͸� �����Ұ��� ���� setContentType()
		//�������ڵ����: euc-kr, utf-8
		response.setContentType("text/html; charset=euc-kr");
		//html�������� ������ ���ٲ��� 
		//���ڵ�-��ǻ�Ͱ� ������ �� �ְ� ��ȯ���ִ� ��
		//plain-�Ϲ��ؽ�Ʈ�� �����ڴ�.
		
		//����ڿ��� �����͸� ���� �� �� �ִ� ��ο���
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Hello Servlet!</h1>");
		// ;������������ �����մϴ�!
		
		//out��ü: Text,HTML,Tag�� ȥ���ؼ� ����ڿ��� ����
		out.print("<ul>");
		out.print("<li>HTML</li>");
		out.print("<li>CSS</li>");
		out.print("<li>JS</li>");
		out.print("</ul>");
	}

}
