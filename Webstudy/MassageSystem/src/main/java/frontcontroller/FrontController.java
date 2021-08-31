package frontcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import controller_command.LoginServiceCon;
import controller_command.MessageServiceCon;
import controller_command.joinServiceCon;
@WebServlet("*.do") //*�� ������ ��̸��̵� .do�γ����� ���Եȴ�.
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	             
		//�ѱ����ڵ�
	   request.setCharacterEncoding("euc-kr");
	   
	   //���� ��û�� ���Դ��� ��θ� �� �� ����
	   String reqURI = request.getRequestURI();
	   System.out.println("��ûURI  : "+ reqURI);
	   
	   //������Ʈ�̸��� ����
	   String path = request.getContextPath();
	   System.out.println("������Ʈ �̸� : "+path);
	   
	   //substring()
	   //���� �ΰ��� �༭ �߰��� ���� ¥���°�
	   //�ϳ��� ���� �༭ ¥���°�(�����ϴ� �ε����������ϰ� ������)
	   String resultURI=reqURI.substring(path.length()+1);
	   System.out.println("��û : "+ resultURI);
	   
	   Command command = null; //CommandŸ���� ���� ����
	   
	   
	   if(resultURI.equals("LoginServiceCon.do")) {//�α��� ��� ȣ��
	      command = new LoginServiceCon(); //�α��μ��񽺰�ü ���� //��ĳ����(�ڵ�����ȯ)-command�� ���������̶� �ڵ����� ����ȯ 	   
		  //String moveURL =  command.execute(request,response);//execute�޼ҵ� ȣ���ؼ� request,response�� �Ѱ��ش�.
		 // response.sendRedirect(moveURL);//moveURL�� �̵�
	   }else if(resultURI.equals("JoinServiceCon.do")) {//ȸ������ ��� ȣ��
		  command =  new joinServiceCon();
		
	   }else if(resultURI.equals("MessageCon.do")) {
		 command = new MessageServiceCon();
	   }
	   //��� �����̵� moveURL�� �̵��ϰڲ�
	   String moveURL = command.execute(request, response);//execute�� ó���� �ٰ�
	     response.sendRedirect(moveURL); //main.jsp�� �̵��ϰڲ�
	}

}
