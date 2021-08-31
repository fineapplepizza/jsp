package com.smhrd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class Ex14join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //DB�� ����
		//ID,PW,Nickname 3���� ������ ������ ����
		
		request.setCharacterEncoding("euc-kr");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String nick=request.getParameter("nick");
		
		//�����ͺ��̽� ����
		//�����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url= "jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
		//�����ͺ��̽� ����
	     Connection conn=DriverManager.getConnection(url,user,pass);
		
//	     if(conn != null) {
//	    	 System.out.println("DB���Ἲ��!");
//	     }else {
//	    	 System.out.println("DB�������..");
//	     }
//	     
	     //���� ����
	    String sql = "insert into member values(?,?,?)";
		//java�� DB���̿� sql���� �����Ű�� ���ִ� ����
	     PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, nick);
		
		int cnt = psmt.executeUpdate();
		
		if(cnt > 0) {
			response.sendRedirect("ex14jointrue.jsp?nick="+nick);
			
		}else {
			response.sendRedirect("ex14joinFalse.jsp");
		}
		
		} catch (ClassNotFoundException e) {
			//Ŭ������ ã�� ������ ��� �߻��ϴ� ����ó��
			
			e.printStackTrace();
		} catch (SQLException e) {
			//DB���ÿ��� �߻��� ����Ǵ� catch��
			response.sendRedirect("ex14joinFalse.jsp");
			e.printStackTrace();
		}
		
	}

}
