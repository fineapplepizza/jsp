<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
      <h1>Cookie 생성</h1>
      <%
         // Cookie생성
         Cookie cookie = new Cookie("data","smart");
         
         //Cookie를 사용자PC에 저장
         //response 사용자가 요청을 했으면 그에 맞는 응답을 해주는 것
         response.addCookie(cookie);//cookie정보를 사용자에게 응답해주겠다.
         
         
      %>

</body>
</html>