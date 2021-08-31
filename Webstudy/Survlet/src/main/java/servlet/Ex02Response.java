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
	
		//response객체: 사용자에게 정보를 응답해줄 때 사용하는 객체
		//ex) HTML문서, Text, 페이지 이동, 이미지,...
		
		//사용자에게 어떤 형식의 데이터를 응답할건지 지정 setContentType()
		//문자인코딩방식: euc-kr, utf-8
		response.setContentType("text/html; charset=euc-kr");
		//html형식으로 응답을 해줄꺼야 
		//인코딩-컴퓨터가 이해할 수 있게 변환해주는 것
		//plain-일반텍스트로 보내겠다.
		
		//사용자에게 데이터를 전달 할 수 있는 통로역할
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Hello Servlet!</h1>");
		// ;빠진문제였음 감사합니다!
		
		//out객체: Text,HTML,Tag를 혼합해서 사용자에게 전송
		out.print("<ul>");
		out.print("<li>HTML</li>");
		out.print("<li>CSS</li>");
		out.print("<li>JS</li>");
		out.print("</ul>");
	}

}
