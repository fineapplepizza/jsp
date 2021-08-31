package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//localhost: Oracle DB가 설치된 PC의 ip주소 설정
			String url="jdbc:oracle:thin:@localhost:1521:xe";//localhost
			String user = "hr";
			String pass="hr";
			//DB연결
			conn = DriverManager.getConnection(url,user,pass);
			
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar파일 또는 driver경로 확인!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결실패..");
			e.printStackTrace();
		}

		
	}
    public void close() {
		
		try {
			
			if(rs != null) {rs.close();}
			if(psmt != null) {psmt.close();}
			if(conn != null) {conn.close();}
			
		} catch(SQLException e) { e.printStackTrace(); } 
			

	}
	
    public int insertMessage(MessageDTO message) {
		
    	int cnt = 0;
		
		try {
			//DB연결
			connection();
			//시퀀스 사용해서 순서대로 값을 적용
			String sql = "insert into web_message values(num_message.nextval,?,?,?,sysdate)";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, message.getSendName());
			psmt.setString(2, message.getReceiveEmail());
            psmt.setString(3, message.getMessage());
          
			
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql문 오류다.");
			e.printStackTrace();
		} 
		//종료를 시키지 않으면 연결된 상태에서 누적되서 DB가 잘안된다.
		finally {
			//무조건 실행하는 구문
			//데이터베이스 종료기능 구현
			close();
				
	
		}
	
		return cnt;
	}
	
    public ArrayList<MessageDTO> showMessage(String email) { //한명의 회원에게 도착한 메시지 반환
    	
	    //ArrayList 생성
	    ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
		MessageDTO message = null;
		
		try {
			//DB연결 가능
		    connection();
			//쿼리 실행
			String sql = "select * from web_message where receiveEmail = ? ";//받는 사람의 이메일
			                                                                 //현재 로그인한 사람들것만 가지고 오기 위해서
		
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
            
			//★★★★★
			//insert,update,delete: executeUpdate() --> DB에 내용을 변경할 때
			//select: executeQuery() --> DB에 내용을 검색할 때
			rs = psmt.executeQuery();
			
			//여러번 확인해야 하기 때문에 while
			while(rs.next()) {
				//컬럼인덱스는 1부터 시작
				int getNum=rs.getInt(1);
				String sendName = rs.getString(2);
				String receiveEmail = rs.getString(3);
				String getMessage = rs.getString(4);
				String date = rs.getString(5);
				
				message = new MessageDTO(getNum,sendName,receiveEmail,getMessage,date);
				//list안에 각각의 회원들의 정보가 담겨있는 member를 추가
				list.add(message);

				//세션에 저장하고 이동하는 건 controller에 하는 것
			//이 메소드를 서블릿에 전달해야됨
				//DAO클래스는 데이터베이스에 접근해서 결과값을 가져오는 것까지가 할 일
		
				
			}
		
		}  catch( SQLException e) {
		
			System.out.println("sql문 오류다.");
			e.printStackTrace();
		} finally {
		
		close();
		
		
		}//end
		
		return list;
	
}
}
