<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<style>
fieldset{
 margin:auto;
 border-style: dotted;
 border-color: blue;
 
}
table{
margin:auto;
}

</style>
<body>
<%
      String id= (String)session.getAttribute("nick");
%>    
<form>
        <fieldset style="width:400px;height:100px">
            
            <legend><%=id %>��ȯ���մϴ�!</legend>
            <table>
        <tr><td><input type="button" value="�����˻�" style="margin-right:10px;">
        <input type="button" value="����å��"style="margin-right:10px;">
        <input type="button" value="���ã��"style="margin-right:10px;">
        <input type="button" value="ȸ������"></td></tr>
            </table>
        </fieldset>
        
        
    </form>
</body>
</html>