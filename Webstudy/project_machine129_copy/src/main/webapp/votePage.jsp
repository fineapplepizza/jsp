<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="css/votepage.css" />
</head>

<body background="img/back_ground1.png">
<%@ include file = "newHome.jsp" %>


	<form action="voteResult.jsp">
	 <div>
	 
		<fieldset >
			<table style="align-contents: center;">
				<legend>
					<h1>��������</h1>
					<tr>
						<td>
							<!-- �������� ���� -->1. �ݷ����� ũ�⸦ �������ּ���.
						</td>
						<!-- ��������� radio��ư ���� ���ݼ��� ���� -->
						<td></td>
						<td>
							<!-- �� �ƴϿ� üũ *name�� value�� �־���� --> 
							������<input type="radio" value="check" name=""> 
							������<input type="radio" value="check" name="">
							������<input type="radio" value="check" name="">
						</td>
					</tr>
					<tr>
						<td>
							<!-- �������� ���� --> 2. ���� �ݷ��߰� �Բ� ��Ȱ�ϴ� �ְ�ȯ���� �������ּ���. 
						</td>
						<!-- ��������� radio��ư ���� ���ݼ��� ���� -->
						<td></td>
						<td>
							<!-- �� �ƴϿ� üũ *name�� value�� �־���� --> ��<input type="radio"
							value="check" name=""> �ƴϿ�<input type="radio"
							value="check" name="">
						</td>
					</tr>
					<tr>
						<td>
							<!-- �������� ���� --> 1. ���뼳������ ����
						</td>
						<!-- ��������� radio��ư ���� ���ݼ��� ���� -->
						<td></td>
						<td>
							<!-- �� �ƴϿ� üũ *name�� value�� �־���� --> ��<input type="radio"
							value="check" name=""> �ƴϿ�<input type="radio"
							value="check" name="">
						</td>
					</tr>
				</legend>
			</table>
			<div>
				<input type="submit" value="�����Ϸ�" class="submit">
			</div>
			
		</fieldset>
		</div>
	</form>
</body>
</html>