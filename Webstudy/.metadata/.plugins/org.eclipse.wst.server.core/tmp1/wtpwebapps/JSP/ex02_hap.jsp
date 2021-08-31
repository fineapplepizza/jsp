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
      int sum = 0;
      for(int i=1;i<101;i++){
          sum += i;
      %>
      <%=i %>
      <% } %>  <!-- 숫자를 출력할건데 표현식으로 출력할거라서 분리 -->
          
      <h1><%=sum %></h1>

</body>
</html>