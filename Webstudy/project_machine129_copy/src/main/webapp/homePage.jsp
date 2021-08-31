<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@page import="model.memberDTO"%>
	<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>�ӽ� 129 (����߸�Ī)</title>
<meta name="description"
	content="An open collection of menu styles that use the line as a creative design element" />
<meta name="keywords"
	content="web design, styles, inspiration, line, pseudo-element, SVG, animation" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<link rel="stylesheet" type="text/css" href="css/homepage.css" />

<!--[if IE]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

</head>

<body>
	<!-- ���ΰ��� -->
	<div id="top">
		<a href="#Login">Top</a>
	</div>
	<div class="container">


		<section class="section section--menu" id="Alonso">
			<h3>
				<a id="Login" href="loginPage.jsp">�α���</a>
			</h3>


			<!-- Ÿ��Ʋ -->
			<a href="homePage.jsp"><h1 class="section__title">�ӽ�129</h1></a>


			<nav class="menu menu--alonso">
				<ul class="menu__list">
					<!--  �������� -->

					<li class="menu__item"><a href="" class="menu__link">����</a>
					<ul class=menu__menu>
							<li><a href="">���񽺼Ұ�</a></li>
						</ul>
						</li>
					<li class="menu__item"><a href="#" class="menu__link">����ã��</a>
					<ul class=menu__menu>
							<li><a href="">������ ã��</a></li>
						</ul>
					</li>	

					<!-- �������� ��ũ -->
					<li class="menu__item menu__item--current"><a href="votePage.jsp" id="vote_link" class="menu__link">�������� </a></li>

					<li class="menu__item"><a href="dogSearch.jsp" class="menu__link">���� ����</a>
					<ul class=menu__menu>
							<!-- ���� ���̺� �Ἥ �̸�,����������,�ֿ����������ִ� ������ -->
							<li><a href="dogSearch.jsp">�������</a></li>
						</ul>
						</li>
					<li class="menu__item"><a href="#" class="menu__link">��ǰ��õ</a>
						<ul class=menu__menu>
							
							<li><a href="food.jsp">�����õ</a></li>
							<li><a href="">�̿���õ</a></li>
						</ul>
					</li>
				</ul>
			</nav>
		</section>

	
</body>
</html>