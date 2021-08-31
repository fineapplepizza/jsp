<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id")!= null){ %>
     <%=session.getAttribute("id") %>님 로그인중<br>
     
     <!-- 
     1.로그아웃 링크 생성  -> 
     2.클릭 시 ex03_logout.jsp로 이동
     3.ex03_logout.jsp에도 세션정보 삭제
     4.ex03_main.jsp로 이동-->
     <a href="ex03_Logout.jsp">로그아웃</a>
<% }else{ %>
	<!-- 크흠.. 왜 폼인데 프롬이죠? 아 착각했어요 -->
      <form action="LoginService" method="post">
        ID: <input type="text" name="id"><br>
        PW: <input type="password" name="pw"><br>
        <input type="submit" value="로그인">
        
    </form>
     <%} %>
</body>
</html>