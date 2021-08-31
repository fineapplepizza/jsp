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
	
    public int insertMessage(MessageDTO message) {
		
    	int cnt = 0;
		
		try {
			//DB����
			connection();
			//������ ����ؼ� ������� ���� ����
			String sql = "insert into web_message values(num_message.nextval,?,?,?,sysdate)";
			
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, message.getSendName());
			psmt.setString(2, message.getReceiveEmail());
            psmt.setString(3, message.getMessage());
          
			
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
	
    public ArrayList<MessageDTO> showMessage(String email) { //�Ѹ��� ȸ������ ������ �޽��� ��ȯ
    	
	    //ArrayList ����
	    ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
		MessageDTO message = null;
		
		try {
			//DB���� ����
		    connection();
			//���� ����
			String sql = "select * from web_message where receiveEmail = ? ";//�޴� ����� �̸���
			                                                                 //���� �α����� �����͸� ������ ���� ���ؼ�
		
			//�ڹ� �� DB�� sql���� ��������ִ� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
            
			//�ڡڡڡڡ�
			//insert,update,delete: executeUpdate() --> DB�� ������ ������ ��
			//select: executeQuery() --> DB�� ������ �˻��� ��
			rs = psmt.executeQuery();
			
			//������ Ȯ���ؾ� �ϱ� ������ while
			while(rs.next()) {
				//�÷��ε����� 1���� ����
				int getNum=rs.getInt(1);
				String sendName = rs.getString(2);
				String receiveEmail = rs.getString(3);
				String getMessage = rs.getString(4);
				String date = rs.getString(5);
				
				message = new MessageDTO(getNum,sendName,receiveEmail,getMessage,date);
				//list�ȿ� ������ ȸ������ ������ ����ִ� member�� �߰�
				list.add(message);

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
}
