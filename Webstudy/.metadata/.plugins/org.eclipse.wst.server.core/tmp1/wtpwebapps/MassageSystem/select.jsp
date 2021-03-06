<%@page import="model.MessageDAO"%>
<%@page import="java.awt.print.Printable"%>
<%@page import="model.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- 1.request영역에 저장된 정보를 가져오시오. -->
<!-- 관리자만 들어갈 수 있는 페이지 -->
<%MemberDTO member = (MemberDTO)session.getAttribute("member");
 
 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="EUC-KR" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/main.css" />
		
	</head>
	<style>
	
	</style>
	<body style="text-align: center;">
	<%
        //DAO에 있는 기능 호출	    
	    MemberDAO dao = new MemberDAO();
	    ArrayList<MemberDTO>list = dao.select();
	%>
		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Menu -->
					<nav id="Update">	
						<table>
						<!-- 모든회원을 볼 수 있는 것
						     특정한 회원을 삭제 시킬 수 있는것 -->
							<caption><h2>회원관리페이지</h2></caption>
							
							<tr>
							
								<td>Email</td>
								<td>Tel</td>
								<td>Address</td>							
							</tr>
							<!-- 2.모든 회원의 이메일(email),전화번호(tel),주소(address)를 출력하시오. -->
							<%for(int i=0;i<list.size();i++){ %>
							<tr>
							    <td><%=list.get(i).getEmail() %></td>
							    <td><%=list.get(i).getTel() %></td>
							    <td><%=list.get(i).getAddress() %></td>
							    <!-- query String : key=value 쌍을 url 뒤에 붙여 추가적인 정보를 서버 측에 전달하는 방식 -->
							    <td><a href="DeleteCon?email=<%=list.get(i).getEmail() %>">삭제</a></td>
							</tr>
							<%} %>
							
							   
						
						</table> 
					</nav>		
					<a href="main.jsp" class="button next scrolly">되돌아가기</a>	
			</div>
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
	</body>
</html>

