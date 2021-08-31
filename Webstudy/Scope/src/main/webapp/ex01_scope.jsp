<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body> 
     <%
         //���尴ü����: page, request, session, application
         //������ ������ ������ �� ����ϴ� ����
         //����: setAttribute()
         //����: getAttribute()
         //����: removeAttribute()
         
         pageContext.setAttribute("page", "page����");
         request.setAttribute("request","request����");
         session.setAttribute("session", "session����");
         application.setAttribute("application", "application����");
     
     %>
     
     <!-- 4���� ������ ����� ������ ��� -->
     <%=pageContext.getAttribute("page") %><br>
     <%=request.getAttribute("request") %><br>
     <%=session.getAttribute("session") %><br>
     <%=application.getAttribute("application")%><br>
  
      <%
         //redirect���
         // - ����/�ܺ� ������ �� �������� ���ٰ���
         // - url�ּ� ��ȯ
         // - ��û�� 2�� �߻��ϱ� ������ request, response ���� ���� X
         //ex02_scope.jsp�� �̵�
         // - �ý��� ������ �Ͼ�� �۾��� Ȱ��
         //������ �����ϰ� �Է��ϰ� ������ �� ����.
         //������ ������ų ������ ������(������ ���� �ʰ� �̵��ϱ⶧����)
         response.sendRedirect("ex02_scope.jsp");
      
         //forward���
         //-���� �� �� �������� ���ٰ���(�ܺ�x)
         // - url�ּҿ� ��ȭ�� ����
         // - request, response������ ������ �̵��� ����
         // - �ý��� ������ �Ͼ�� �ʴ� �۾��� Ȱ��
         //(�Խñ��ۼ��̳� �����ͺ��̽�������� ���� �ʴ� �ϵ�)
         //ex)forward������� �����ͺ��̽� �����Ǽ� �̵��ϰ� �Ǹ� �� �������� ���ΰ�ħ���� ��
          //�����Ͱ� ��� �����̵� �ý����� ��Ӻ�ȭ����
         //RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_scope.jsp");
         //dispatcher.forward(request,response);
          
         //session�� �������� �޶����� �Ǹ� ������ ������ų �� ����.
         //����Ǵ� ���������� ������ �ǰ� �ּҸ� �ٿ��ֱ�Ǹ� �ش���������� ������ �ȵƱ� ������ �̵��� �� ����.
 
      %>
      <!-- �ܺο��� ���� url�ּҰ� �ٲ��� �ʴ´�.
           
           
       -->
</body>
</html>