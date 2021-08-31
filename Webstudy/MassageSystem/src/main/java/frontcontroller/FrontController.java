package frontcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import controller_command.LoginServiceCon;
import controller_command.MessageServiceCon;
import controller_command.joinServiceCon;
@WebServlet("*.do") //*가 붙으면 어떤이름이든 .do로끝나면 오게된다.
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	             
		//한글인코딩
	   request.setCharacterEncoding("euc-kr");
	   
	   //어디로 요청이 들어왔는지 경로를 알 수 있음
	   String reqURI = request.getRequestURI();
	   System.out.println("요청URI  : "+ reqURI);
	   
	   //프로젝트이름만 나옴
	   String path = request.getContextPath();
	   System.out.println("프로젝트 이름 : "+path);
	   
	   //substring()
	   //값을 두개를 줘서 중간에 값을 짜르는것
	   //하나의 값을 줘서 짜르는것(시작하는 인덱스만지정하고 끝까지)
	   String resultURI=reqURI.substring(path.length()+1);
	   System.out.println("요청 : "+ resultURI);
	   
	   Command command = null; //Command타입의 변수 선언
	   
	   
	   if(resultURI.equals("LoginServiceCon.do")) {//로그인 기능 호출
	      command = new LoginServiceCon(); //로그인서비스객체 생성 //업캐스팅(자동형변환)-command가 상위개념이라서 자동으로 형변환 	   
		  //String moveURL =  command.execute(request,response);//execute메소드 호출해서 request,response를 넘겨준다.
		 // response.sendRedirect(moveURL);//moveURL로 이동
	   }else if(resultURI.equals("JoinServiceCon.do")) {//회원가입 기능 호출
		  command =  new joinServiceCon();
		
	   }else if(resultURI.equals("MessageCon.do")) {
		 command = new MessageServiceCon();
	   }
	   //어떠한 조건이든 moveURL로 이동하겠끔
	   String moveURL = command.execute(request, response);//execute가 처리해 줄것
	     response.sendRedirect(moveURL); //main.jsp로 이동하겠끔
	}

}
