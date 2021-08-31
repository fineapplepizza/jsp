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
   //application영역: 
   //-모든 사람들에게 공유할 정보를 저장
   //-서버가 종료되기 전까지 유지해야 할 정보를 저장
   //Object로 반환되기 때문에 다운 캐스팅해줘야한다.
   //session과 application의 차이 - 이 정보를 모든 사람들에게 다공유할건지 차이
   //정보1,정보2 웹페이지에 보여줄거고 이 정보들을 어디까지 유지시켜서 공유할지 고려해야함
   //무조건 session에만 저장하면 안됨
   Integer visit = (Integer)application.getAttribute("visit");
// (visit ==null? 1 : visit+=1)

  if(visit == null){
	  visit =1;
	
  }else{
	  visit +=1;
	
	
	
  }
  application.setAttribute("visit", visit);
  out.print("<h1>방문자 수: "+visit+"</h1>");
%>

</body>
</html>