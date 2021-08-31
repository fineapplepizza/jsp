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
        out객체: 웹 페이지에 결과를 출력할 때 사용하는 내장객체
        
        표현식의 경우, 하나의 결과값만 출력할 때 활용
        out객체의 경우, 반복적으로 데이터를 Tag와 같이 출력해야할 때 활용
     -->
     
     <%
        out.print("Hello JSP!");
     
        for(int i=1;i<11;i++){
        	out.print("<h1>"+i+"</h1>");
        }
     %>
</body>
</html>