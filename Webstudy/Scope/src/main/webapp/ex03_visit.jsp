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
   //application����: 
   //-��� ����鿡�� ������ ������ ����
   //-������ ����Ǳ� ������ �����ؾ� �� ������ ����
   //Object�� ��ȯ�Ǳ� ������ �ٿ� ĳ����������Ѵ�.
   //session�� application�� ���� - �� ������ ��� ����鿡�� �ٰ����Ұ��� ����
   //����1,����2 ���������� �����ٰŰ� �� �������� ������ �������Ѽ� �������� ����ؾ���
   //������ session���� �����ϸ� �ȵ�
   Integer visit = (Integer)application.getAttribute("visit");
// (visit ==null? 1 : visit+=1)

  if(visit == null){
	  visit =1;
	
  }else{
	  visit +=1;
	
	
	
  }
  application.setAttribute("visit", visit);
  out.print("<h1>�湮�� ��: "+visit+"</h1>");
%>

</body>
</html>