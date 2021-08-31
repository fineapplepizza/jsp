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
        1.사용자가 입력한 id,pw를 변수에 저장
        2.저장된 id,pw가 각각 "smart","1234"인지 판별
          일치한 경우: ex13LoginS.jsp
          불일치한 경우: ex13LoginF.jsp
     */
     
     String id = request.getParameter("id");
     String pw = request.getParameter("pw");
     
     //데이터베이스 연동
   
     try {
    	  //데이터베이스를 연결하기 위한 클래스파일을 동적로딩
         //동적로딩: 프로그램을 실행할 때 로드하는 방법
         //(만약에 실행했을때 그 위치에 파일이없으면 어떻게하겠냐? 예외처리)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//localhost: Oracle DB가 설치된 PC의 ip주소 설정
		//localhost: 다른 pc의 ip주소로 입력한다면 그pc를 db로 공유가능한다.
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 경로를 작성하는 부분
		//한 팀원의 pc를 db로 쓰겠다 하면 localhost를 아이피주소로 해주면됨
		String user="hr";
		String pass="hr";
		
		//데이터베이스 연결
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		if(conn != null) {
			System.out.println("DB연결성공!");
		}else {
			System.out.println("DB연결실패..");
		}
		
		//쿼리 실행
		String sql = "select * from member where id=? and pw=?";
		
		//java와db사이에 sql문을 실행시키게 해주는 역할
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1,id);
		psmt.setString(2,pw);
		
		//★★★★★
		//insert,update,delete: executeUpdate() --> DB에 내용을 변경할 때
		//select : executeQuery() --> DB에 내용을 검색할 때
		
		ResultSet rs = psmt.executeQuery();

		//next(): 다음 행으로 넘어가서 데이터 존재 여부 판단(true/false)
		if(rs.next()) { //select한 데이터가 있다면 
			//Resultset -cursor가 데이터가 아닌 컬럼들로 있고 아래에 데이터가 있는지 없는지 판단을 내려줄 수 잇는 기능
			//데이터가 있다면 getString으로 가지고 온다.
			String getId = rs.getString(1); //컬럼의 인덱스를 가지고 오는 방법과 이름을 가지고 오는 방법 두 가지가 있다 보통 인덱스를 쓴다.
			String getPw = rs.getString(2);
			String getNick = rs.getString(3);
		//정보들을 가지고 와서 로그인 페이지로 이동한다.
		
			//★★쿼리스트링방식으로 LoginS.jsp페이지에 닉네임 전송
			//형식: ?이름=값&이름=값
			//response.sendRedirect("ex13LoginS.jsp?nick="+getNick);
			
			//Cookie cookie = new Cookie("nick",getNick);
			//쿠키정보를 담아서 사용자에게 정보를 전달 사용자pc에 저장
			//response.addCookie(cookie); //쿠키전달
			
			//★★★세션을 활용한 로그인 기능 구현
			//1.세션객체 생성(서블릿에서는 내장객체가 없다)(★Servlet파일 내에서만)
			//2.세션에 닉네임을 저장
			HttpSession session = request.getSession();
			session.setAttribute("nick", getNick);
			
			response.sendRedirect("ex13LoginS.jsp");
		}else {
			response.sendRedirect("ex13LoginF.jsp");
		}
		
	} catch (ClassNotFoundException e) {
		//클래스를 찾지 못했을 경우 발생하는 예외처리
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
