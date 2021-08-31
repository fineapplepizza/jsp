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
			
			//localhost: Oracle DB�� ��ġ�� PC�� ip�ּ� ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";//localhost
			String user = "hr";
			String pass="hr";
			//DB����
			conn = DriverManager.getConnection(url,user,pass);
			
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar���� �Ǵ� driver��� Ȯ��!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB�������..");
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
			//DB���� ����
		connection();
			//���� ����
			String sql = "select * from WEB_MEMBER where email=? and pw=?";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
			psmt.setString(2, pw);
            
			//�ڡڡڡڡ�
			//insert,update,delete: executeUpdate() --> DB�� ������ ������ ��
			//select: executeQuery() --> DB�� ������ �˻��� ��
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				//�÷��ε����� 1���� ����
				String getemail = rs.getString(1);
				String gettel = rs.getString(3);
				String getaddress = rs.getString(4);
				
				member = new MemberDTO(getemail,null,gettel,getaddress);
				

				//���ǿ� �����ϰ� �̵��ϴ� �� controller�� �ϴ� ��
			//�� �޼ҵ带 ������ �����ؾߵ�
				//DAOŬ������ �����ͺ��̽��� �����ؼ� ������� �������� �ͱ����� �� ��
		
				
			}
		
		}  catch( SQLException e) {
		
			System.out.println("sql�� ������.");
			e.printStackTrace();
		} finally {
		
		close();
		
		
		}//end
		
		return member;
	
	}

	public int join(MemberDTO member) {
		int cnt = 0;
		
		try {
			//DB����
			connection();
			
			String sql = "insert into WEB_MEMBER values(?,?,?,?)";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getEmail());
			psmt.setString(2, member.getPw());
            psmt.setString(3, member.getTel());
            psmt.setString(4, member.getAddress());
			
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql�� ������.");
			e.printStackTrace();
		} 
		//���Ḧ ��Ű�� ������ ����� ���¿��� �����Ǽ� DB�� �߾ȵȴ�.
		finally {
			//������ �����ϴ� ����
			//�����ͺ��̽� ������ ����
			close();
				
	
		}
	
		return cnt;
	}

	public int update(MemberDTO member2) {
		
		
		int cnt = 0;
		
		try {
			//DB����
			connection();
			String sql = "update WEB_MEMBER set pw=?, tel=?, address=? where email=?";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member2.getPw());
            psmt.setString(2, member2.getTel());
            psmt.setString(3, member2.getAddress());
            psmt.setString(4, member2.getEmail());
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql�� ������.");
			e.printStackTrace();
		} finally {
			//������ �����ϴ� ����
			//�����ͺ��̽� ������ ����
			
			close();
				
	
		}
	
		return cnt;
		
	}

    public ArrayList<MemberDTO> select() {
    	
    	    //ArrayList ����
    	    ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
    	    
    		MemberDTO member = null;
    		try {
    			//DB���� ����
    		    connection();
    			//���� ����
    			String sql = "select * from dog_info ";
    			
    			//�ڹ� �� DB�� sql���� ��������ִ� ����
    			psmt = conn.prepareStatement(sql);
    			
                
    			//�ڡڡڡڡ�
    			//insert,update,delete: executeUpdate() --> DB�� ������ ������ ��
    			//select: executeQuery() --> DB�� ������ �˻��� ��
    			rs = psmt.executeQuery();
    			
    			//������ Ȯ���ؾ� �ϱ� ������ while
    			while(rs.next()) {
    				//�÷��ε����� 1���� ����
    				String getemail = rs.getString(1);
    				String gettel = rs.getString(3);
    				String getaddress = rs.getString(4);
    				
    				member = new MemberDTO(getemail,null,gettel,getaddress);
    				//list�ȿ� ������ ȸ������ ������ ����ִ� member�� �߰�
    				list.add(member);

    				//���ǿ� �����ϰ� �̵��ϴ� �� controller�� �ϴ� ��
    			//�� �޼ҵ带 ������ �����ؾߵ�
    				//DAOŬ������ �����ͺ��̽��� �����ؼ� ������� �������� �ͱ����� �� ��
    		
    				
    			}
    		
    		}  catch( SQLException e) {
    		
    			System.out.println("sql�� ������.");
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
			//DB����
			connection();
			String sql = "delete from web_member where email = ?";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
           
			cnt = psmt.executeUpdate();
			
			
		} catch( SQLException e) {
		
			System.out.println("sql�� ������.");
			e.printStackTrace();
		} finally {
			//������ �����ϴ� ����
			//�����ͺ��̽� ������ ����
			
			close();
				
	
		}
	
		return cnt;
		
	}

    public boolean idCheck(String email) {

		boolean check = false;
    	
		try {
			//DB���� ����
		connection();
			//���� ����
			String sql = "select * from WEB_MEMBER where email=? ";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
            
			//�ڡڡڡڡ�
			//insert,update,delete: executeUpdate() --> DB�� ������ ������ ��
			//select: executeQuery() --> DB�� ������ �˻��� ��
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				check = true; //����� �� ���� ���̵�
			}else {
				check = false; //����� �� �ִ� ���̵�
			}
		
		}  catch( SQLException e) {
		
			System.out.println("sql�� ������.");
			e.printStackTrace();
		} finally {
		
		close();
		
		
		}//end
		
		return check;
	
	}
}
	