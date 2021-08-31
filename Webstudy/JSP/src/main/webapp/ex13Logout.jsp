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
/*      Cookie cookie = new Cookie("nick","");
     
     cookie.setMaxAge(0);
     
     response.addCookie(cookie); */
     
    
     session.invalidate();
     
     //로그아웃이 진행된 후 ex13Login.html이동
     response.sendRedirect("ex13Login.html");
     
     %>

</body>
</html>