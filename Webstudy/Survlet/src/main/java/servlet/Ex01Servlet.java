package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL Mapping: 실제 Servlet클래스를 문자열경로와 연결하는 기술
//             외부에서는 지정한 문자열경로로만 요청할 수 있음(시험문제)
@WebServlet("/Servlet")
public class Ex01Servlet extends HttpServlet {
      
	//Java => main()과 같은 역할
	//사용자의 요청이 들어왔을 때 request, response 객체에 정보들이 저장된다!
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//코드를 수정 후 저장 ---> Tomcat서버 재실행
	System.out.println("서버 실행..!");
	
	//IPv4: 192.168.0.1(내 PC의 주소: 127.0.0.1 or localhost)
	//IPv6: 0:0:0:0:0:0:1(내 PC의 주소)
	//내 PC의 IP확인방법: Win키 +R -> 실행창 cmd작성 후 실행 ->'ipconfig'명령어 입력 후 Enter
	
	
	//request객체: 사용자가 요청했을 때 사용자의 정보를 담고 있는 객체(header정보,사용자가 입력한 정보,..);
	//접속한 사용자의 IP정보 가져온 후 변수에 저장
	//데이터를 꺼내올 수 있는데 문자열을 반환
	String ip = request.getRemoteAddr();
	System.out.println(ip);
	
	//짝꿍의 IP인 경우, 짝꿍 이외의 IP인 경우
	//짝꿍이름 안녕! 출력, 손님 안녕하세요! 출력
	
	if(ip.equals("172.30.1.38")) {
		System.out.println("명수야 안녕!");
	}else {
		System.out.println("손님 안녕하세요!");
	}
	
	
	
	}

}
