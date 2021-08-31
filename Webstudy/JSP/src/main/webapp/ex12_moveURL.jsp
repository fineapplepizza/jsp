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
        String url = request.getParameter("url");
       //사용자가 입력한 페이지에 맞춰 이동하는 로직 구현
        if(url.equals("네이버")){
        	response.sendRedirect("https://www.naver.com");
        }else if(url.equals("다음")){
        	response.sendRedirect("https://www.daum.net");
        }else if(url.equals("구글")){
        	response.sendRedirect("https://www.google.com");
        }
     
     %>
     
</body>
</html>