<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>

.input{
   align :center;
   text-align: center;
   align-items: center;
   align-content: center;
   
}
fieldset{
margin:auto;
}
talbe{
margin:auto;
}
</style>
</head>
<body>

<form  action ="JoinCon" method="post">
        <fieldset dotted=black style="width:400px
        ">
            
            <legend>회원가입</legend>
            <table>
            <tr>
            <td>
                ID<input type="text" class="input" name="id"></td></tr>
       
       
         <tr><td>PW<input type="text" class="input" name="pw"></td></tr>
        <tr><td> NickName<input type="text" class="input" name="nick"><input type="submit"value="제출"></td></tr>
        <tr><td> Email<input type="text" class="input" name="email"></td></tr>
         <tr><td>tel<input type="text" class="input" name="tel"></td></tr>
        </table>
        </fieldset>
        
        
    </form>
</body>
</html>