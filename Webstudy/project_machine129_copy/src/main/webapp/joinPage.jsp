<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="css/joinpage.css" />
</head>
<body>



	<form action="Joincon" method="post">
		<div id="JoinBox" align="center">
			
				<div>
					<h1>
						<a href="homePage.jsp">ȸ������</a>
					</h1>
				</div>

				<h4>���̵�</h4>
				<input type="text" name="id"  id="input_id" placeholder="���̵�" class="input">
				<br>
				 <input type="button" value="ID�ߺ�üũ"
              						 onclick="idCheck()" > <span id="sp"></span>
				<br>
				<h4>�̸�</h4>
				<input type="text" name="name" placeholder="�̸�" class="input">
				<br>
				<h4>��й�ȣ</h4>
				<input type="password" name="pw" placeholder="��й�ȣ" class="input">
				<br>
				<h4>�̸���</h4>
				<input type="text" name="email" placeholder="�̸���" class="input">
				<br>
				<h4>��ȭ��ȣ</h4>
				<input type="text" name="tel" placeholder="��ȭ��ȣ" class="input">
				<br>
				<h4>�ּ�</h4>
				<select name="address" class="input"
					style="width: 360px; height: 35px">
					<option value="gg">��⵵</option>
					<option value="gw">������</option>
					<option value="gss">��󳲵�</option>
					<option value="gsn">���ϵ�</option>
					<option value="jrn">����ϵ�</option>
					<option value="jrs">���󳲵�</option>
					<option value="ccn">��û�ϵ�</option>
					<option value="ccs">��û����</option>
					
				</select> <!-- <input type="text"name="gender"placeholder="����"class="input"> -->
				<br>
				<input type="submit" value="�����ϱ�" class="join_btn">
			</div>
			
	</form>
	
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>


			
	
	
	<script>
			function idCheck(){
				var input_id = document.getElementById("input_id");
				$.ajax({
					type : "post", //������ ���� ���
					data : {'id' : input_id.value}, //������ ���� ������
					url : "Idcheckcon", //������ ���� ���� ������
					dataType : "text", //������ Ÿ��
					//��û������ ������ �Լ� ���� ture / false
					success : function(data){
						alert(data);
						var sp = document.getElementById("sp");
						if (data == "true"){
							sp.innerHTML = "�Ұ����� ID�Դϴ�.";
						}else{
							sp.innerHTML = "������ ID�Դϴ�.";
						}
						
					},
					error : function(){
						alert("���۽���");
						
					}	
				});
			}//��ǳ�
			</script>
	

</body>
</html>