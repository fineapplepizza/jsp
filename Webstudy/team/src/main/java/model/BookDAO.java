package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {

	private Connection conn = null;
	   private PreparedStatement psmt = null;
	   private ResultSet rs = null;
	   
	   public void connection() {
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String user = "hr";
	         String pass = "hr";
	         
	         conn = DriverManager.getConnection(url, user, pass);
	         
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
	         if(rs != null){
	            rs.close();
	         }if(psmt != null) {
	            psmt.close();
	         }if(conn != null) {
	            conn.close();
	         }
	      }catch(SQLException e) {
	         e.printStackTrace();
	         
	      }
	   }
	   
	   public int insert_member(BookDTO book) {
	      
	      int cnt = 0;
	      
	      try {
	         connection();

	         String sql = "INSERT INTO book_member VALUES(?, ?, ?, ?, ?)";
	         
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, book.getId());
	         psmt.setString(2, book.getPw());
	         psmt.setString(3, book.getNick());
	         psmt.setString(4, book.getEmail());
	         psmt.setString(4, book.getTel());
	         
	         cnt = psmt.executeUpdate();
	         
	      } catch (SQLException e) {
	         System.out.println("sql 오류");
	         e.printStackTrace();
	      } finally {
	         close();
	      }   //   end
	      
	      return cnt;
	   }
	   
	   public BookDTO login_member(String id, String pw) {
		      
		      BookDTO book = null;
		      
		      try {
		         connection();
		         
		         String sql = "SELECT * FROM web_member WHERE id= ? AND pw= ?" ;
		         
		         psmt = conn.prepareStatement(sql);
		         psmt.setString(1, id);
		         psmt.setString(2, pw);
		         
		         rs = psmt.executeQuery();
		         
		         while(rs.next()) {
		            //   컬럼 인덱스는 1부터 시작
		            String getId = rs.getString(1);
		            String getPw = rs.getString(2);
		            String getNick = rs.getString(3);
		            String getEmail= rs.getString(4);
		            String getTel = rs.getString(5);
		            
		            book = new BookDTO(getId, getPw, getNick, getEmail, getTel);
		            
		         }
		         
		      } catch (SQLException e) {
		         System.out.println("sql 오류");
		         e.printStackTrace();
		      } finally {
		         close();
		      }   //   end
		      
		      return book;
		   }

	   
	
}
