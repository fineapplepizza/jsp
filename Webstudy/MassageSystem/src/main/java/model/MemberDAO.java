package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

public class MemberDAO {
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
		
	
  	public MemberDTO loginCheck(String email,String pw) {

		MemberDTO member = null;
		try {
			//DB연결 가능
		connection();
			//쿼리 실행
			String sql = "select * from WEB_MEMBER where email=? and pw=?";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
			psmt.setString(2, pw);
            
			//★★★★★
			//insert,update,delete: executeUpdate() --> DB에 내용을 변경할 때
			//select: executeQuery() --> DB에 내용을 검색할 때
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				//컬럼인덱스는 1부터 시작
				String getemail = rs.getString(1);
				String gettel = rs.getString(3);
				String getaddress = rs.getString(4);
				
				member = new MemberDTO(getemail,null,gettel,getaddress);
				

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
		
		return member;
	
	}

	public int join(MemberDTO member) {
		int cnt = 0;
		
		try {
			//DB연결
			connection();
			
			String sql = "insert into WEB_MEMBER values(?,?,?,?)";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getEmail());
			psmt.setString(2, member.getPw());
            psmt.setString(3, member.getTel());
            psmt.setString(4, member.getAddress());
			
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

	public int update(MemberDTO member2) {
		
		
		int cnt = 0;
		
		try {
			//DB연결
			connection();
			String sql = "update WEB_MEMBER set pw=?, tel=?, address=? where email=?";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member2.getPw());
            psmt.setString(2, member2.getTel());
            psmt.setString(3, member2.getAddress());
            psmt.setString(4, member2.getEmail());
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql문 오류다.");
			e.printStackTrace();
		} finally {
			//무조건 실행하는 구문
			//데이터베이스 종료기능 구현
			
			close();
				
	
		}
	
		return cnt;
		
	}

    public ArrayList<MemberDTO> select() {
    	
    	    //ArrayList 생성
    	    ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
    	    
    		MemberDTO member = null;
    		try {
    			//DB연결 가능
    		    connection();
    			//쿼리 실행
    			String sql = "select * from dog_info ";
    			
    			//자바 와 DB에 sql문을 실행시켜주는 역할
    			psmt = conn.prepareStatement(sql);
    			
                
    			//★★★★★
    			//insert,update,delete: executeUpdate() --> DB에 내용을 변경할 때
    			//select: executeQuery() --> DB에 내용을 검색할 때
    			rs = psmt.executeQuery();
    			
    			//여러번 확인해야 하기 때문에 while
    			while(rs.next()) {
    				//컬럼인덱스는 1부터 시작
    				String getemail = rs.getString(1);
    				String gettel = rs.getString(3);
    				String getaddress = rs.getString(4);
    				
    				member = new MemberDTO(getemail,null,gettel,getaddress);
    				//list안에 각각의 회원들의 정보가 담겨있는 member를 추가
    				list.add(member);

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

    public int delete(String email) {
		
		
		int cnt = 0;
		//
		
		try {
			//DB연결
			connection();
			String sql = "delete from web_member where email = ?";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
           
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql문 오류다.");
			e.printStackTrace();
		} finally {
			//무조건 실행하는 구문
			//데이터베이스 종료기능 구현
			
			close();
				
	
		}
	
		return cnt;
		
	}

    public boolean idCheck(String email) {

		boolean check = false;
    	
		try {
			//DB연결 가능
		connection();
			//쿼리 실행
			String sql = "select * from WEB_MEMBER where email=? ";
			
			//자바 와 DB에 sql문을 실행시켜주는 역할
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
            
			//★★★★★
			//insert,update,delete: executeUpdate() --> DB에 내용을 변경할 때
			//select: executeQuery() --> DB에 내용을 검색할 때
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				check = true; //사용할 수 없는 아이디
			}else {
				check = false; //사용할 수 있는 아이디
			}
		
		}  catch( SQLException e) {
		
			System.out.println("sql문 오류다.");
			e.printStackTrace();
		} finally {
		
		close();
		
		
		}//end
		
		return check;
	
	}
}
	