package com.smhrd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/LoginCheck")
public class Ex13LoginCheck extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
        1.����ڰ� �Է��� id,pw�� ������ ����
        2.����� id,pw�� ���� "smart","1234"���� �Ǻ�
          ��ġ�� ���: ex13LoginS.jsp
          ����ġ�� ���: ex13LoginF.jsp
     */
     
     String id = request.getParameter("id");
     String pw = request.getParameter("pw");
     
     //�����ͺ��̽� ����
   
     try {
    	  //�����ͺ��̽��� �����ϱ� ���� Ŭ���������� �����ε�
         //�����ε�: ���α׷��� ������ �� �ε��ϴ� ���
         //(���࿡ ���������� �� ��ġ�� �����̾����� ����ϰڳ�? ����ó��)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//localhost: Oracle DB�� ��ġ�� PC�� ip�ּ� ����
		//localhost: �ٸ� pc�� ip�ּҷ� �Է��Ѵٸ� ��pc�� db�� ���������Ѵ�.
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; //����Ŭ ��θ� �ۼ��ϴ� �κ�
		//�� ������ pc�� db�� ���ڴ� �ϸ� localhost�� �������ּҷ� ���ָ��
		String user="hr";
		String pass="hr";
		
		//�����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		if(conn != null) {
			System.out.println("DB���Ἲ��!");
		}else {
			System.out.println("DB�������..");
		}
		
		//���� ����
		String sql = "select * from member where id=? and pw=?";
		
		//java��db���̿� sql���� �����Ű�� ���ִ� ����
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1,id);
		psmt.setString(2,pw);
		
		//�ڡڡڡڡ�
		//insert,update,delete: executeUpdate() --> DB�� ������ ������ ��
		//select : executeQuery() --> DB�� ������ �˻��� ��
		
		ResultSet rs = psmt.executeQuery();

		//next(): ���� ������ �Ѿ�� ������ ���� ���� �Ǵ�(true/false)
		if(rs.next()) { //select�� �����Ͱ� �ִٸ� 
			//Resultset -cursor�� �����Ͱ� �ƴ� �÷���� �ְ� �Ʒ��� �����Ͱ� �ִ��� ������ �Ǵ��� ������ �� �մ� ���
			//�����Ͱ� �ִٸ� getString���� ������ �´�.
			String getId = rs.getString(1); //�÷��� �ε����� ������ ���� ����� �̸��� ������ ���� ��� �� ������ �ִ� ���� �ε����� ����.
			String getPw = rs.getString(2);
			String getNick = rs.getString(3);
		//�������� ������ �ͼ� �α��� �������� �̵��Ѵ�.
		
			//�ڡ�������Ʈ��������� LoginS.jsp�������� �г��� ����
			//����: ?�̸�=��&�̸�=��
			//response.sendRedirect("ex13LoginS.jsp?nick="+getNick);
			
			//Cookie cookie = new Cookie("nick",getNick);
			//��Ű������ ��Ƽ� ����ڿ��� ������ ���� �����pc�� ����
			//response.addCookie(cookie); //��Ű����
			
			//�ڡڡڼ����� Ȱ���� �α��� ��� ����
			//1.���ǰ�ü ����(���������� ���尴ü�� ����)(��Servlet���� ��������)
			//2.���ǿ� �г����� ����
			HttpSession session = request.getSession();
			session.setAttribute("nick", getNick);
			
			response.sendRedirect("ex13LoginS.jsp");
		}else {
			response.sendRedirect("ex13LoginF.jsp");
		}
		
	} catch (ClassNotFoundException e) {
		//Ŭ������ ã�� ������ ��� �߻��ϴ� ����ó��
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
     
//     if(id.equals("smart") && pw.equals("1234")){
//   	  response.sendRedirect("ex13LoginS.jsp");
//     }else{
//   	  response.sendRedirect("ex13LoginF.jsp");
//     }
     
    
     
     
	
	}

}
