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
	
	//����ڰ� �Է��� �����͸� ������ �� ������ ����
		//request.getParameter(input�±��� name�Ӽ���)���ڿ���ȯ
		String data = request.getParameter("data");
		System.out.println(data);
	}

}
