<%@page import="model.MessageDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MessageDAO"%>
<%@page import="model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% MemberDTO member = (MemberDTO)session.getAttribute("member"); 

   MessageDAO dao = new MessageDAO();
   ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
   if(member!=null){
         list = dao.showMessage(member.getEmail());
   }
%>

<html>
<head>
<title>Forty by HTML5 UP</title>
<meta charset="EUC-KR" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header" class="alt"> <a href="index.html"
			class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a> <nav>
		<!-- 이메일 : admin --> <!-- admin(관리자 계정): 회원삭제, 로그아웃 --> <!-- 일반계정: 개인정보수정, 로그아웃 -->



		<%if(member != null){ 
                                     if(member.getEmail().equals("admin")){
                                    	 
                        
								%> <a href="select.jsp">회원삭제</a> 
								<%}else{ %> 
								<a href="update.jsp">개인정보수정</a>
		<%} %> <a href="Logout.jsp">로그아웃</a> 
		<%}else{ %> <!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. -->
		<a href="#menu">로그인</a> <%} %> </nav> </header>

		<!-- Menu -->
		<nav id="menu">
		<ul class="links">
			<li><h5>로그인</h5></li>
			<form action="LoginServiceCon.do" method="post">
				<li><input type="text" name="email" placeholder="Email을 입력하세요"></li>
				<li><input type="password" name="pw" placeholder="PW를 입력하세요"></li>
				<li><input type="submit" value="LogIn" class="button fit"></li>
			</form>
		</ul>
		<ul class="actions vertical">
			<li><h5>회원가입</h5></li>
			<form action="JoinServiceCon.do" method="post">
				<li><input type="text" name="email" placeholder="Email을 입력하세요"
					id="input_id"> <input type="button" value="ID중복체크"
					onclick="idCheck()"> <span id="sp"></span></li>
				<!-- 함수호출 onclick -->
				<li><input type="password" placeholder="PW를 입력하세요" name="pw"></li>
				<li><input type="text" placeholder="전화번호를 입력하세요" name="tel"></li>
				<li><input type="text" placeholder="집주소를 입력하세요" name="address"></li>
				<li><input type="submit" value="JoinUs" class="button fit"></li>
			</form>
		</ul>
		</nav>
		<!-- Banner -->
		<section id="banner" class="major">
		<div class="inner">
			<header class="major"> <%if(member != null){ %>
			<h1><%=member.getEmail() %>님 환영합니다.
			</h1>
			<%}else{ %>
			<h1>로그인 한 세션아이디를 출력해주세요</h1>
			<%} %> <!-- 로그인 후 로그인 한 사용자의 세션아이디로 바꾸시오.
									 ex)smart님 환영합니다 --> </header>
			<div class="content">
				<p>
					아래는 지금까지 배운 웹 기술들입니다.<br>
				</p>
				<ul class="actions">
					<li><a href="#one" class="button next scrolly">확인하기</a></li>
				</ul>
			</div>
		</div>
		</section>

		<!-- Main -->
		<div id="main">

			<!-- One -->
			<section id="one" class="tiles"> <article> <span
				class="image"> <img src="images/pic01.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">HTML</a>
			</h3>
			<p>홈페이지를 만드는 기초 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic02.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">CSS</a>
			</h3>
			<p>HTML을 디자인해주는 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic03.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Servlet/JSP</a>
			</h3>
			<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic04.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">JavaScript</a>
			</h3>
			<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic05.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">MVC</a>
			</h3>
			<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>
			</header> </article> <article> <span class="image"> <img
				src="images/pic06.jpg" alt="" />
			</span> <header class="major">
			<h3>
				<a href="#" class="link">Web Project</a>
			</h3>
			<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>
			</header> </article> </section>
			<!-- Two -->
			<section id="two">
			<div class="inner">
				<header class="major">
				<h2>나에게 온 메세지 확인하기</h2>
				</header>
				<p></p>
				<ul class="actions">
					<%
									  if(member !=null){
									%>
					<!-- 로그인이 되어 있는 경우: email님에게 온 메세지입니다. -->
					<li><%=member.getEmail() %>님에게 온 메세지입니다.</li>
					<%}else{ %>
					<li>로그인을 하세요.</li>
					<!-- 로그인을 하지 않은 경우 -->
					<%} %>
					<li><a href="#" class="button next scrolly">전체삭제하기</a></li>
				</ul>

				<table>
					<tr>
						<th>번호</th>
						<th>보내는 사람</th>
						<th>내용</th>
						<th>시간</th>
						<th>삭제</th>
					</tr>
					<%
                        for(int i=0;i<list.size();i++){
                            %>
					<tr>
						<td><%=i+1 %></td>
						<td><%=list.get(i).getSendName() %></td>
						<td><%=list.get(i).getMessage() %></td>
						<td><%=list.get(i).getM_date() %></td>
						<td><a
							href="MessageDeleteCon?messageNum=<%=list.get(i).getNum()%>">삭제</a></td>

					</tr>
					<%} %>

				</table>



			</div>
			</section>

		</div>

		<!-- Contact -->
		<section id="contact">
		<div class="inner">
			<section>
			<form action="MessageCon.do" method="post" id="MForm">
				<div class="field half first">
					<label for="name">Name</label> <input type="text" id="name"
						placeholder="보내는 사람 이름" name="sendName" />
				</div>
				<div class="field half">
					<label for="receiveEmail">Email</label> <input type="text"
						id="receiveEmail" placeholder="보낼 사람 이메일" name="receiveEmail" />
				</div>

				<div class="field">
					<label for="message">Message</label>
					<textarea id="message" rows="6" name="message"></textarea>
				</div>
				<ul class="actions">
					<li><input type="submit" value="Send Message" class="special" />
						<span id="sp1"></span></li>
						
					<li><input type="reset" value="Clear" /></li>
				</ul>
			</form>
			</section>

			<section class="split"> <section>
			<div class="contact-method">
				<span class="icon alt fa-envelope"></span>
				<h3>Email</h3>
				<%-- 		<%if(member != null){%>
										  <a href="#"><%=member.getEmail() %></a> 
										<%} else{%>
										<a href="#">로그인한 사람의 이메일을 출력</a>
										<%} %> --%>
				<%
										   if(member != null){
											   out.print("<a href = '#'>"+member.getEmail()+"</a>");
										   }else{
											   out.print("<a href='#'>로그인 한 사람의 이메일을 출력</a>");
										   }
										
										%>

				<!-- 로그인 한 사용자의 이메일을 출력하시오 -->
			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-phone"></span>
				<h3>Phone</h3>
				<%-- 										<%if(member != null){ %>
										<span><%=member.getTel() %></span>
										<%}else{ %>
										<span>로그인 한 사람의 전화번호를 출력</span> 
										<%} %>
										--%>
				<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->
				<%
										   if(member != null){
											   out.print("<sapn>"+member.getTel()+"</span>");
										   }else{
											   out.print("<span>로그인 한 사람의 전화번호를 출력</span>");
										   }
										
										%>

			</div>
			</section> <section>
			<div class="contact-method">
				<span class="icon alt fa-home"></span>
				<h3>Address</h3>
				<%-- 										<%if(member != null){ %>
										<span><%=member.getAddress() %></span>
							
										<%}else{ %>
										<span>로그인 한 사람의 집주소를 출력</span>
										<%} %>
										 --%>
				<!-- 로그인 한 사용자의 집주소를 출력하시오 -->
				<%
										   if(member != null){
											   out.print("<sapn>"+member.getAddress()+"</span>");
										   }else{
											   out.print("<span>로그인 한 사람의 주소 출력</span>");
										   }
										
										%>

			</div>
			</section> </section>
		</div>
		</section>

		<!-- Footer -->
		<footer id="footer">
		<div class="inner">
			<ul class="icons">
				<li><a href="#" class="icon alt fa-twitter"><span
						class="label">Twitter</span></a></li>
				<li><a href="#" class="icon alt fa-facebook"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon alt fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="#" class="icon alt fa-github"><span
						class="label">GitHub</span></a></li>
				<li><a href="#" class="icon alt fa-linkedin"><span
						class="label">LinkedIn</span></a></li>
			</ul>
			<ul class="copyright">
				<li>&copy; Untitled</li>
				<li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
			</ul>
		</div>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>
     
     <script>
        function idCheck(){
           var input = document.getElementById("input_id");
          /*inner.HTML html 태그에 적어진 텍스트를 가지고 올때 */
          /* input.value input태그에 값을 가지고 올때 */
          //alert(input.value);
          
          //Ajax는 제이쿼리로 사용하는게 좀 더 편안함 
          //제이쿼리를 사용하겠다는 코드가 작성이 되어야함(제이쿼리가 없으면 꼭 프로젝트파일에 넣어줘야함)
          $.ajax({
        	  type : "post",   //데이터 전송방식
        	  data : {'email':input.value},//서버로 보낼 데이터
        	 //input태그에 작성한 텍스트 가져올때 .value사용
        	  url :  "IdCheckCon",             //데이터를 보낼 서버페이지
        	  dataType:  "text",               //응답데이터 타입,키와값형태로 받을려면 json형태
        	  //요청에 성공시 실행할 함수 정의    //true / false
        	  success : function(data){
        		  //alert(data);
        		 var sp= document.getElementById("sp");
        		 if(data=="true"){
        			 //태그사이에 텍스트 요소 추가할 때 : innerHTML(텍스트,태그 추가),innerText(텍스트만 추가)
        			 sp.innerHTML="불가능한 ID입니다.";
        		 }else{
        			 sp.innerHTML="가능한 ID입니다.";
        		 }
        	  },
        	  //요청에 실패시 실행할 함수 정의 
        	  error : function(){
        		  alert("요청 실패!");
        	  }
          });
      }
     
        var isSubmit = false;
        //event객체 : DOM 과 관련된 이벤트(click,submit) 발생하면 관련 정보를 가지고 있는 객체
     $('#MForm').submit(function(event){
       //SUBMIT 처리 되는것을 막아야함
       event.preventDefault();
       
       //span,p태그사이의 값을 가지고 올때 inner.html,inner.text
       //제이쿼리 사용해서 태그사이의 값을 가지고 올때는 html(),text()
       //input태그에 적어진 값을 가지고 올때는 val()
       var rEmail = $('#receiveEmail').val();
       
       
        $.ajax({
        	  type : "post",   //데이터 전송방식
        	  data : {'email':rEmail},//서버로 보낼 데이터
        	 //input태그에 작성한 텍스트 가져올때 .value사용
        	  url :  "EmailCheckCon",             //데이터를 보낼 서버페이지
        	  dataType:  "text",               //응답데이터 타입
        	  //요청에 성공시 실행할 함수 정의    //true / false
        	  success : function(data){
        		 // alert(data);
        		if(data=="true"){ //메세지를 보낼 수 있다.
        			isSubmit = true;
        		}else{//메세지를 전송할 수 없다.
        			isSubmit = false;
        		    $('#sp1').html("이메일을 확인하시오");
        		}
        		
        	  },
        	  //요청에 실패시 실행할 함수 정의 
        	  error : function(){
        		  alert("요청 실패!");
        	  }
        	  
          });
     
        //isSubmit이 true인 경우에만 submit할 수 있도록
        if(isSubmit){
         	alert(isSubmit);
         	this.submit();
       
        }
       
     })
      
      
     </script>
</body>
</html>

