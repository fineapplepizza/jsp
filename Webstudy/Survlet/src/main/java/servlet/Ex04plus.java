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
	          
		//ex04_plus페이지에서 입력한 두 수를 가져온 후 변수에 저장
		String num1 = request.getParameter("num1");//input태그에 있는 name속성값
		String num2 = request.getParameter("num2");
		
		//문자열 -> 정수변환
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		System.out.println("두 수의 합: "+(n1+n2));
		
		//사용자에게 연산결과 데이터 전송
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>두 수의 연산결과</h1>");
		out.print("결과: "+(n1+n2));
       
	}

}
