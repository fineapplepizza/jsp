package controller_command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import model.MemberDAO;
import model.MemberDTO;

public class joinServiceCon implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String moveURL = null; //어디로 이동할 건지 저장하는 변수 선언

		
		
		//이메일, 비밀번호, 번호, 주소를 변수에 저장
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address=request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO(email,pw,tel,address);
		int cnt = dao.join(member);
		
		
			if(cnt>0) {
				
				//request영역에 email정보를 저장
				request.setAttribute("email", email);
				
				moveURL = "main.jsp";
				//frontcontroller로 사용할 때는 동일한 동작방식을 사용

				//forward방식
				//forward방식은 데이터를 페이지이동할때 넘겨줄수 있는 기능이 탑제되있다
				//리다이렉트는 요청을 두번해야함
				//RequestDispatcher dispatcher 
				//= request.getRequestDispatcher("join_success.jsp");
				//dispatcher.forward(request, response);
				
			}else {
				moveURL ="main.jsp";
				//response.sendRedirect("main.jsp");
			}
	
	return moveURL;
}

		
		

	

	
	
       
}
