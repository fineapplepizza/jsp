<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body> 

     <h1>ex02_scope페이지</h1>
     
     <!-- 4개의 영역에 저장된 데이터 출력 -->
     <%=pageContext.getAttribute("page") %><br>
     <%=request.getAttribute("request") %><br>
     <%=session.getAttribute("session") %><br>
     <%=application.getAttribute("application")%><br>
  

</body>
</html>