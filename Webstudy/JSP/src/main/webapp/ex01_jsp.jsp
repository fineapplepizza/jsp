<!-- ������ -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- %@�����ڿ�� ���Ͽ����� ȯ�漳������ ���� �����ϴ� ��� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ����: ��� �Ǵ� �޼ҵ带 �ۼ��� �� �ִ� ���� -->
<%!
   public String show(){
	return "Hello JSP!";
}
%>

<!-- ��ũ��Ʋ��:java�� �ۼ��� �� �ִ� ����->Servlet���� ��ȯ�� �� 
service()�ȿ� �ۼ�
��������,���� -->
<%
   String data = "Hello JSP!";


%>

<!-- ǥ����: ������� �� �������� ����ϴ� ���� -->
<!-- ���갡�� -->

<h1><%=data %></h1>
<h1><%=data+5 %></h1>
<h1><%=show() %></h1> <!--  ��ȯ���� ������ �ִ� �޼ҵ� ȣ��! -->

</body>
</html>