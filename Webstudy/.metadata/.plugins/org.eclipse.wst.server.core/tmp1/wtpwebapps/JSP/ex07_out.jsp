<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <!-- 
        out��ü: �� �������� ����� ����� �� ����ϴ� ���尴ü
        
        ǥ������ ���, �ϳ��� ������� ����� �� Ȱ��
        out��ü�� ���, �ݺ������� �����͸� Tag�� ���� ����ؾ��� �� Ȱ��
     -->
     
     <%
        out.print("Hello JSP!");
     
        for(int i=1;i<11;i++){
        	out.print("<h1>"+i+"</h1>");
        }
     %>
</body>
</html>