<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<%
  String name= request.getParameter("name");
String apple= request.getParameter("apple");
String melon= request.getParameter("melon");
String water= request.getParameter("water");
  
   
%>
             <tr>
                <td>�̸�</td>
                <td><%=name %></td>
             </tr>
             <tr>
                <td>�����ϴ� ����</td>
                <td>
               
               <%=apple %><%=melon %><%=water %>
              
                </td>
                
               
               
     
         </table>
</body>
</html>