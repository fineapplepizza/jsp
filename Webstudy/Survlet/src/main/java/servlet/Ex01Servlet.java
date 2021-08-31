package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL Mapping: ���� ServletŬ������ ���ڿ���ο� �����ϴ� ���
//             �ܺο����� ������ ���ڿ���ηθ� ��û�� �� ����(���蹮��)
@WebServlet("/Servlet")
public class Ex01Servlet extends HttpServlet {
      
	//Java => main()�� ���� ����
	//������� ��û�� ������ �� request, response ��ü�� �������� ����ȴ�!
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//�ڵ带 ���� �� ���� ---> Tomcat���� �����
	System.out.println("���� ����..!");
	
	//IPv4: 192.168.0.1(�� PC�� �ּ�: 127.0.0.1 or localhost)
	//IPv6: 0:0:0:0:0:0:1(�� PC�� �ּ�)
	//�� PC�� IPȮ�ι��: WinŰ +R -> ����â cmd�ۼ� �� ���� ->'ipconfig'��ɾ� �Է� �� Enter
	
	
	//request��ü: ����ڰ� ��û���� �� ������� ������ ��� �ִ� ��ü(header����,����ڰ� �Է��� ����,..);
	//������ ������� IP���� ������ �� ������ ����
	//�����͸� ������ �� �ִµ� ���ڿ��� ��ȯ
	String ip = request.getRemoteAddr();
	System.out.println(ip);
	
	//¦���� IP�� ���, ¦�� �̿��� IP�� ���
	//¦���̸� �ȳ�! ���, �մ� �ȳ��ϼ���! ���
	
	if(ip.equals("172.30.1.38")) {
		System.out.println("����� �ȳ�!");
	}else {
		System.out.println("�մ� �ȳ��ϼ���!");
	}
	
	
	
	}

}
