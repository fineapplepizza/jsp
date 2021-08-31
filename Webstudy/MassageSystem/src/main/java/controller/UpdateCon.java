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
	
	//���ǿ� ����Ǿ� �ִ� MemberDTO��ü�� ���� -> �̸��� ����
	HttpSession session = request.getSession();
	MemberDTO member = (MemberDTO)session.getAttribute("member");//������ �Ǵ� ���� �־�� DB�� �Ѱܼ� �����ϴ� �۾��� �� �� �ִ�.

	
	String pw = request.getParameter("pw");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	//�������� �ϳ��� ��� �����°� MemberDTO
	MemberDTO member2 = new MemberDTO(member.getEmail(), pw, tel, address);
	MemberDAO dao = new MemberDAO();
   int cnt = dao.update(member2);//update�޼ҵ忡  member��ü ����
	
   
   if(cnt > 0 ) {
	   //���ǿ��� ������ ������ ����
	   //DB�� ����ȴٰ� �ص� ������ ������ ����Ǵ� �� �ƴϴ� ���δٸ� ����̱� �����̴�.
	   session.setAttribute("member", member2);
	   response.sendRedirect("main.jsp");
   }else {
	   response.sendRedirect("update.jsp");
   }
	
	}

}
