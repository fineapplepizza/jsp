<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	tr{
		height: 40px;
		text-align: center;
	}
	table{
		margin: 0 auto;
	}
</style>
</head>
<body>
	<% //�̸�,java,web,iot,android������ ������ ����
        String name = request.getParameter("name");
        int javascore = Integer.parseInt(request.getParameter("javascore"));
        int web = Integer.parseInt(request.getParameter("web"));
        int iot=Integer.parseInt(request.getParameter("iot"));
        int android = Integer.parseInt(request.getParameter("android"));
        
        //��ձ��ϱ�
        double avg = 0;
        String grade = "";
       
        avg= (javascore+web+iot+android)/4.0;
        
        //if���� ���� �������ϱ�
        if(avg>=95 && avg<=100){
        	grade = "A+";
        }else if(avg>=90){
        	grade= "A";
        }else if(avg>=85){
        	grade="B+";
        }else if(avg>=80){
        	grade="B";
        }else{
        	grade="F";
        }
     %>

	<fieldset>
		<legend>����Ȯ�����α׷�</legend>
		<table width="500">
			<tr>
				<td>�̸�</td>
				<td><%=name %></td>
			</tr>
			<tr>
				<td>JAVA����</td>
				<td><%=javascore %></td>
			</tr>
			<tr>
				<td>WEB����</td>
				<td><%=web %></td>
			</tr>
			<tr>
				<td>IOT����</td>
				<td><%=iot %></td>
			</tr>
			<tr>
				<td>ANDROID����</td>
				<td><%=android %></td>
			</tr>
			<tr>
				<td>���</td>
				<td><%=avg %></td>
			</tr>
			<tr>
				<td>����</td>
				<td><h3><%=grade %></h3></td>
			</tr>
	</fieldset>

</body>
</html>