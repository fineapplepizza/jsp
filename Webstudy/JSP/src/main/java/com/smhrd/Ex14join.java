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
      //DB에 저장
		//ID,PW,Nickname 3개의 정보를 변수에 저장
		
		request.setCharacterEncoding("euc-kr");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String nick=request.getParameter("nick");
		
		//데이터베이스 연동
		//동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url= "jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
		//데이터베이스 연결
	     Connection conn=DriverManager.getConnection(url,user,pass);
		
//	     if(conn != null) {
//	    	 System.out.println("DB연결성공!");
//	     }else {
//	    	 System.out.println("DB연결실패..");
//	     }
//	     
	     //쿼리 실행
	    String sql = "insert into member values(?,?,?)";
		//java와 DB사이에 sql문을 실행시키게 해주는 역할
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
			//클래스를 찾지 못했을 경우 발생하는 예외처리
			
			e.printStackTrace();
		} catch (SQLException e) {
			//DB관련오류 발생시 실행되는 catch문
			response.sendRedirect("ex14joinFalse.jsp");
			e.printStackTrace();
		}
		
	}

}
