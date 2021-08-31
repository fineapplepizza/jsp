package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberDTO;

/**
 * Servlet implementation class UpdateCon
 */
@WebServlet("/UpdateCon")
public class UpdateCon extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	request.setCharacterEncoding("EUC-KR");
	
	//세션에 저장되어 있는 MemberDTO객체에 접근 -> 이메일 정보
	HttpSession session = request.getSession();
	MemberDTO member = (MemberDTO)session.getAttribute("member");//기준이 되는 값이 있어야 DB에 넘겨서 수정하는 작업을 할 수 있다.

	
	String pw = request.getParameter("pw");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	//정보들을 하나로 묶어서 보내는게 MemberDTO
	MemberDTO member2 = new MemberDTO(member.getEmail(), pw, tel, address);
	MemberDAO dao = new MemberDAO();
   int cnt = dao.update(member2);//update메소드에  member객체 전달
	
   
   if(cnt > 0 ) {
	   //세션에도 수정된 정보를 저장
	   //DB에 변경된다고 해도 서버에 세션이 변경되는 건 아니다 서로다른 기술이기 때문이다.
	   session.setAttribute("member", member2);
	   response.sendRedirect("main.jsp");
   }else {
	   response.sendRedirect("update.jsp");
   }
	
	}

}
