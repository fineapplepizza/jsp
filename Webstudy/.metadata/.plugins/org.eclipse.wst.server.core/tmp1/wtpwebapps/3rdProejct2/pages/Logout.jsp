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
      //session ������ �ִ� �����͸� ������ �� , main.jsp�� �̵��Ͻÿ�.
      session.invalidate(); 
    
      response.sendRedirect("Login.jsp");
    
    %>

</body>
</html>