<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <h1>���� ������ȸ</h1>
    <%
       //���� ������ȸ
       //�ٿ�ĳ���� - ��objectŸ���� String���� ��ȯ
      // -�θ�Ŭ���� --> �ڽ�Ŭ����Ÿ������ ��ȯ
      //�ڡڡ� why? ���ǿ����� ����� ������ Ÿ���� object�̱� ������
       String nick =(String)session.getAttribute("nick");
       out.print(nick);
    %>
    
</body>
</html>