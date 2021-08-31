<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
      <!-- 클릭하지 않아도 경로만 설정하면 이동 할 수 있다. -->
      <!-- 요청이 두 번 일어난다. 두 번의 요청은 서로 다른 요청이다 (기억)-->
      <!-- 요청과 응답에 관한 정보를 유지를 시킬 수 없다. -->
      <% response.sendRedirect("https://www.naver.com"); %>
</body>
</html>