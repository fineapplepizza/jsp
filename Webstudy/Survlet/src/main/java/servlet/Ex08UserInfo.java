package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserInfo")
public class Ex08UserInfo extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//POST������� �ѱ۵����� ���� �� �������ʵ��� ���ڵ� ����
		request.setCharacterEncoding("EUC-KR");
	  //����,����, ��� �����͸� ������ �� ������ ����
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
//		String hobby = request.getParameter("hobby");
		
		//������ name�Ӽ��� ����� ���� ���� input�±װ��� ������ �� 
        String[]hobby=request.getParameterValues("hobby"); 
		
		
		System.out.println(job);
		System.out.println(gender);
//		System.out.println(hobby[0]+","+hobby[1]+","+hobby[2]);
	for(int i=0;i<hobby.length;i++) {
		System.out.println(hobby[i]);
	}
	
	
	}

}
