package command;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	
	//�߻�޼ҵ�(abstract)
	public String execute(HttpServletRequest request,HttpServletResponse response);//Ŭ���� �ȿ� request��response��ü�� ����ϱ� ���� �Ű����ڸ� �־���
	

}
