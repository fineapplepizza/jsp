<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="css/loginpage.css" />
</head>
<body>
	<form action="Logincon" method="post">
		<div id="box" class="login-box">
			<br> <br> <br> <br> <br> <br>
			<h3>
				<a class="login_link" href="homePage.jsp">�α���</a>
			</h3>

			<input type="text" placeholder="���̵�" name="id" class="input"><br>
			<input type="password" placeholder="��й�ȣ" name="pw" class="input">
			<br>
			
				<input type="submit" id="input_btn" value="�� �� ��">
				<a href="joinPage.jsp"><input type="button" id="input_btn"
						value="ȸ �� �� ��"></a>
			
			</div>
	</form>

</body>
</html>