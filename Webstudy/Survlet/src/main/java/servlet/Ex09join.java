package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class Ex09join extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	    //�ѱ۱������ʰ� ���ڵ�-post��İ��� ������ ���ڵ��ؾߵ�
		//�����͸� ������������ ���ڵ��ؾ���
	   request.setCharacterEncoding("EUC-KR");
	   
	   //�����͸� ��������
	  String id= request.getParameter("id");
	  String pw=request.getParameter("pw");
	 String name= request.getParameter("name");
	 String tel = request.getParameter("tel");
	 String gender = request.getParameter("gender");
	 String [] hobby = request.getParameterValues("hobby");
	 String date = request.getParameter("date");
	 String color = request.getParameter("color");
	 String country =request.getParameter("country");
	 String talk = request.getParameter("talk");
	 
	 //�ܼ�â�� ����
	 System.out.println("ID:"+id+"\n"+"NAME:"+name+"\n"+"TEL:"+tel+"\n"+"GENDER:"+gender);
	 for(int i=0;i<hobby.length;i++) {
		 System.out.println("HOBBY:"+hobby[i]);
	 }
	 System.out.println("BIRTHDAY:"+date);
	 System.out.println("COLOR:"+color);
	 System.out.println("COUNTRY:"+country);
	 System.out.println("TALK:"+talk);
	}

}
