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
		String moveURL = null; //���� �̵��� ���� �����ϴ� ���� ����

		
		
		//�̸���, ��й�ȣ, ��ȣ, �ּҸ� ������ ����
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address=request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO(email,pw,tel,address);
		int cnt = dao.join(member);
		
		
			if(cnt>0) {
				
				//request������ email������ ����
				request.setAttribute("email", email);
				
				moveURL = "main.jsp";
				//frontcontroller�� ����� ���� ������ ���۹���� ���

				//forward���
				//forward����� �����͸� �������̵��Ҷ� �Ѱ��ټ� �ִ� ����� ž�����ִ�
				//�����̷�Ʈ�� ��û�� �ι��ؾ���
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
