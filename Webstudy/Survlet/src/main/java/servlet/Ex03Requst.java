package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03Requst")
public class Ex03Requst extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//사용자가 입력한 데이터를 가져온 후 변수에 저장
		//request.getParameter(input태그의 name속성값)문자열변환
		String data = request.getParameter("data");
		System.out.println(data);
	}

}
