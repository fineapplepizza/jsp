package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberDTO;



@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //POST방식일 때 인코딩 설정!
		request.setCharacterEncoding("EUC-KR");
		
		
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
				
				//forward방식
				//forward방식은 데이터를 페이지이동할때 넘겨줄수 있는 기능이 탑제되있다
				//리다이렉트는 요청을 두번해야함
				RequestDispatcher dispatcher 
				= request.getRequestDispatcher("join_success.jsp");
				dispatcher.forward(request, response);
				
			}else {
				response.sendRedirect("main.jsp");
			}
	
	}

}
