<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<fieldset align="center">
<legend>도서관리프로그램</legend>
<form  action ="LoginCon" method="post">
   <table>
      <tr>
         <td>ID</td>
         <td><input type="text"><td>
         <td rowspan="2"><input type="submit" value="로그인"></td>
      </tr>
      <tr>
         <td>PW</td>
         <td><input type="text"><td>
      </tr>
      <tr>
      <td colspan="3">아이디가 없다면 <a href="Question4_join.jsp">회원가입</a> 클릭</td>
      </tr>
      
   </table>
</form>
</fieldset>
</body>
</html>