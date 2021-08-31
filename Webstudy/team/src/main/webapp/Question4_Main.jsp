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
            
            <legend><%=id %>님환영합니다!</legend>
            <table>
        <tr><td><input type="button" value="도서검색" style="margin-right:10px;">
        <input type="button" value="나의책방"style="margin-right:10px;">
        <input type="button" value="즐겨찾기"style="margin-right:10px;">
        <input type="button" value="회원정보"></td></tr>
            </table>
        </fieldset>
        
        
    </form>
</body>
</html>