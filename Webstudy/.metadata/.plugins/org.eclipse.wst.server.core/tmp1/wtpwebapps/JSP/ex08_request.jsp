<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <!-- JSP -서버에 데이터를 넘긴다. -->
    <!-- 사용자가 요청한 데이터는 request에 담긴다. -->
    <%
       String data = request.getParameter("data");
       out.print(data);
    %>
    
    <%=data %>
</body>
</html>