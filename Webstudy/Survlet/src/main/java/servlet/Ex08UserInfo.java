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
	
		//POST방식으로 한글데이터 전송 시 깨지지않도록 인코딩 설정
		request.setCharacterEncoding("EUC-KR");
	  //직업,성별, 취미 데이터를 가져온 후 변수에 저장
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
//		String hobby = request.getParameter("hobby");
		
		//동일한 name속성을 사용한 여러 개의 input태그값을 가져올 때 
        String[]hobby=request.getParameterValues("hobby"); 
		
		
		System.out.println(job);
		System.out.println(gender);
//		System.out.println(hobby[0]+","+hobby[1]+","+hobby[2]);
	for(int i=0;i<hobby.length;i++) {
		System.out.println(hobby[i]);
	}
	
	
	}

}
