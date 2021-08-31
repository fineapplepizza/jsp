/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-07 02:40:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.MessageDTO;
import java.util.ArrayList;
import model.MessageDAO;
import model.MemberDTO;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.MessageDAO");
    _jspx_imports_classes.add("model.MessageDTO");
    _jspx_imports_classes.add("model.MemberDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
 MemberDTO member = (MemberDTO)session.getAttribute("member"); 

   MessageDAO dao = new MessageDAO();
   ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
   if(member!=null){
         list = dao.showMessage(member.getEmail());
   }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forty by HTML5 UP</title>\r\n");
      out.write("<meta charset=\"EUC-KR\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- Wrapper -->\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Header -->\r\n");
      out.write("		<header id=\"header\" class=\"alt\"> <a href=\"index.html\"\r\n");
      out.write("			class=\"logo\"><strong>Forty</strong> <span>by HTML5 UP</span></a> <nav>\r\n");
      out.write("		<!-- 이메일 : admin --> <!-- admin(관리자 계정): 회원삭제, 로그아웃 --> <!-- 일반계정: 개인정보수정, 로그아웃 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
if(member != null){ 
                                     if(member.getEmail().equals("admin")){
                                    	 
                        
								
      out.write(" <a href=\"select.jsp\">회원삭제</a> \r\n");
      out.write("								");
}else{ 
      out.write(" \r\n");
      out.write("								<a href=\"update.jsp\">개인정보수정</a>\r\n");
      out.write("		");
} 
      out.write(" <a href=\"Logout.jsp\">로그아웃</a> \r\n");
      out.write("		");
}else{ 
      out.write(" <!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. -->\r\n");
      out.write("		<a href=\"#menu\">로그인</a> ");
} 
      out.write(" </nav> </header>\r\n");
      out.write("\r\n");
      out.write("		<!-- Menu -->\r\n");
      out.write("		<nav id=\"menu\">\r\n");
      out.write("		<ul class=\"links\">\r\n");
      out.write("			<li><h5>로그인</h5></li>\r\n");
      out.write("			<form action=\"LoginServiceCon.do\" method=\"post\">\r\n");
      out.write("				<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"password\" name=\"pw\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"LogIn\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<ul class=\"actions vertical\">\r\n");
      out.write("			<li><h5>회원가입</h5></li>\r\n");
      out.write("			<form action=\"JoinServiceCon.do\" method=\"post\">\r\n");
      out.write("				<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"\r\n");
      out.write("					id=\"input_id\"> <input type=\"button\" value=\"ID중복체크\"\r\n");
      out.write("					onclick=\"idCheck()\"> <span id=\"sp\"></span></li>\r\n");
      out.write("				<!-- 함수호출 onclick -->\r\n");
      out.write("				<li><input type=\"password\" placeholder=\"PW를 입력하세요\" name=\"pw\"></li>\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"전화번호를 입력하세요\" name=\"tel\"></li>\r\n");
      out.write("				<li><input type=\"text\" placeholder=\"집주소를 입력하세요\" name=\"address\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"JoinUs\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- Banner -->\r\n");
      out.write("		<section id=\"banner\" class=\"major\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<header class=\"major\"> ");
if(member != null){ 
      out.write("\r\n");
      out.write("			<h1>");
      out.print(member.getEmail() );
      out.write("님 환영합니다.\r\n");
      out.write("			</h1>\r\n");
      out.write("			");
}else{ 
      out.write("\r\n");
      out.write("			<h1>로그인 한 세션아이디를 출력해주세요</h1>\r\n");
      out.write("			");
} 
      out.write(" <!-- 로그인 후 로그인 한 사용자의 세션아이디로 바꾸시오.\r\n");
      out.write("									 ex)smart님 환영합니다 --> </header>\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<p>\r\n");
      out.write("					아래는 지금까지 배운 웹 기술들입니다.<br>\r\n");
      out.write("				</p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><a href=\"#one\" class=\"button next scrolly\">확인하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Main -->\r\n");
      out.write("		<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("			<!-- One -->\r\n");
      out.write("			<section id=\"one\" class=\"tiles\"> <article> <span\r\n");
      out.write("				class=\"image\"> <img src=\"images/pic01.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">HTML</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>홈페이지를 만드는 기초 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic02.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">CSS</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML을 디자인해주는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic03.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Servlet/JSP</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic04.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">JavaScript</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic05.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">MVC</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic06.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Web Project</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>\r\n");
      out.write("			</header> </article> </section>\r\n");
      out.write("			<!-- Two -->\r\n");
      out.write("			<section id=\"two\">\r\n");
      out.write("			<div class=\"inner\">\r\n");
      out.write("				<header class=\"major\">\r\n");
      out.write("				<h2>나에게 온 메세지 확인하기</h2>\r\n");
      out.write("				</header>\r\n");
      out.write("				<p></p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					");

									  if(member !=null){
									
      out.write("\r\n");
      out.write("					<!-- 로그인이 되어 있는 경우: email님에게 온 메세지입니다. -->\r\n");
      out.write("					<li>");
      out.print(member.getEmail() );
      out.write("님에게 온 메세지입니다.</li>\r\n");
      out.write("					");
}else{ 
      out.write("\r\n");
      out.write("					<li>로그인을 하세요.</li>\r\n");
      out.write("					<!-- 로그인을 하지 않은 경우 -->\r\n");
      out.write("					");
} 
      out.write("\r\n");
      out.write("					<li><a href=\"#\" class=\"button next scrolly\">전체삭제하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<table>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>번호</th>\r\n");
      out.write("						<th>보내는 사람</th>\r\n");
      out.write("						<th>내용</th>\r\n");
      out.write("						<th>시간</th>\r\n");
      out.write("						<th>삭제</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("					");

                        for(int i=0;i<list.size();i++){
                            
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>");
      out.print(i+1 );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(list.get(i).getSendName() );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(list.get(i).getMessage() );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(list.get(i).getM_date() );
      out.write("</td>\r\n");
      out.write("						<td><a\r\n");
      out.write("							href=\"MessageDeleteCon?messageNum=");
      out.print(list.get(i).getNum());
      out.write("\">삭제</a></td>\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("					");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Contact -->\r\n");
      out.write("		<section id=\"contact\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<section>\r\n");
      out.write("			<form action=\"MessageCon.do\" method=\"post\" id=\"MForm\">\r\n");
      out.write("				<div class=\"field half first\">\r\n");
      out.write("					<label for=\"name\">Name</label> <input type=\"text\" id=\"name\"\r\n");
      out.write("						placeholder=\"보내는 사람 이름\" name=\"sendName\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"field half\">\r\n");
      out.write("					<label for=\"receiveEmail\">Email</label> <input type=\"text\"\r\n");
      out.write("						id=\"receiveEmail\" placeholder=\"보낼 사람 이메일\" name=\"receiveEmail\" />\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"field\">\r\n");
      out.write("					<label for=\"message\">Message</label>\r\n");
      out.write("					<textarea id=\"message\" rows=\"6\" name=\"message\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><input type=\"submit\" value=\"Send Message\" class=\"special\" />\r\n");
      out.write("						<span id=\"sp1\"></span></li>\r\n");
      out.write("						\r\n");
      out.write("					<li><input type=\"reset\" value=\"Clear\" /></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</form>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("			<section class=\"split\"> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-envelope\"></span>\r\n");
      out.write("				<h3>Email</h3>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				");

										   if(member != null){
											   out.print("<a href = '#'>"+member.getEmail()+"</a>");
										   }else{
											   out.print("<a href='#'>로그인 한 사람의 이메일을 출력</a>");
										   }
										
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- 로그인 한 사용자의 이메일을 출력하시오 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-phone\"></span>\r\n");
      out.write("				<h3>Phone</h3>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->\r\n");
      out.write("				");

										   if(member != null){
											   out.print("<sapn>"+member.getTel()+"</span>");
										   }else{
											   out.print("<span>로그인 한 사람의 전화번호를 출력</span>");
										   }
										
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-home\"></span>\r\n");
      out.write("				<h3>Address</h3>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<!-- 로그인 한 사용자의 집주소를 출력하시오 -->\r\n");
      out.write("				");

										   if(member != null){
											   out.print("<sapn>"+member.getAddress()+"</span>");
										   }else{
											   out.print("<span>로그인 한 사람의 주소 출력</span>");
										   }
										
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> </section>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Footer -->\r\n");
      out.write("		<footer id=\"footer\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<ul class=\"icons\">\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-twitter\"><span\r\n");
      out.write("						class=\"label\">Twitter</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-facebook\"><span\r\n");
      out.write("						class=\"label\">Facebook</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-instagram\"><span\r\n");
      out.write("						class=\"label\">Instagram</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-github\"><span\r\n");
      out.write("						class=\"label\">GitHub</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span\r\n");
      out.write("						class=\"label\">LinkedIn</span></a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"copyright\">\r\n");
      out.write("				<li>&copy; Untitled</li>\r\n");
      out.write("				<li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Scripts -->\r\n");
      out.write("	<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("	<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("     \r\n");
      out.write("     <script>\r\n");
      out.write("        function idCheck(){\r\n");
      out.write("           var input = document.getElementById(\"input_id\");\r\n");
      out.write("          /*inner.HTML html 태그에 적어진 텍스트를 가지고 올때 */\r\n");
      out.write("          /* input.value input태그에 값을 가지고 올때 */\r\n");
      out.write("          //alert(input.value);\r\n");
      out.write("          \r\n");
      out.write("          //Ajax는 제이쿼리로 사용하는게 좀 더 편안함 \r\n");
      out.write("          //제이쿼리를 사용하겠다는 코드가 작성이 되어야함(제이쿼리가 없으면 꼭 프로젝트파일에 넣어줘야함)\r\n");
      out.write("          $.ajax({\r\n");
      out.write("        	  type : \"post\",   //데이터 전송방식\r\n");
      out.write("        	  data : {'email':input.value},//서버로 보낼 데이터\r\n");
      out.write("        	 //input태그에 작성한 텍스트 가져올때 .value사용\r\n");
      out.write("        	  url :  \"IdCheckCon\",             //데이터를 보낼 서버페이지\r\n");
      out.write("        	  dataType:  \"text\",               //응답데이터 타입,키와값형태로 받을려면 json형태\r\n");
      out.write("        	  //요청에 성공시 실행할 함수 정의    //true / false\r\n");
      out.write("        	  success : function(data){\r\n");
      out.write("        		  //alert(data);\r\n");
      out.write("        		 var sp= document.getElementById(\"sp\");\r\n");
      out.write("        		 if(data==\"true\"){\r\n");
      out.write("        			 //태그사이에 텍스트 요소 추가할 때 : innerHTML(텍스트,태그 추가),innerText(텍스트만 추가)\r\n");
      out.write("        			 sp.innerHTML=\"불가능한 ID입니다.\";\r\n");
      out.write("        		 }else{\r\n");
      out.write("        			 sp.innerHTML=\"가능한 ID입니다.\";\r\n");
      out.write("        		 }\r\n");
      out.write("        	  },\r\n");
      out.write("        	  //요청에 실패시 실행할 함수 정의 \r\n");
      out.write("        	  error : function(){\r\n");
      out.write("        		  alert(\"요청 실패!\");\r\n");
      out.write("        	  }\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("     \r\n");
      out.write("        var isSubmit = false;\r\n");
      out.write("        //event객체 : DOM 과 관련된 이벤트(click,submit) 발생하면 관련 정보를 가지고 있는 객체\r\n");
      out.write("     $('#MForm').submit(function(event){\r\n");
      out.write("       //SUBMIT 처리 되는것을 막아야함\r\n");
      out.write("       event.preventDefault();\r\n");
      out.write("       \r\n");
      out.write("       //span,p태그사이의 값을 가지고 올때 inner.html,inner.text\r\n");
      out.write("       //제이쿼리 사용해서 태그사이의 값을 가지고 올때는 html(),text()\r\n");
      out.write("       //input태그에 적어진 값을 가지고 올때는 val()\r\n");
      out.write("       var rEmail = $('#receiveEmail').val();\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        $.ajax({\r\n");
      out.write("        	  type : \"post\",   //데이터 전송방식\r\n");
      out.write("        	  data : {'email':rEmail},//서버로 보낼 데이터\r\n");
      out.write("        	 //input태그에 작성한 텍스트 가져올때 .value사용\r\n");
      out.write("        	  url :  \"EmailCheckCon\",             //데이터를 보낼 서버페이지\r\n");
      out.write("        	  dataType:  \"text\",               //응답데이터 타입\r\n");
      out.write("        	  //요청에 성공시 실행할 함수 정의    //true / false\r\n");
      out.write("        	  success : function(data){\r\n");
      out.write("        		 // alert(data);\r\n");
      out.write("        		if(data==\"true\"){ //메세지를 보낼 수 있다.\r\n");
      out.write("        			isSubmit = true;\r\n");
      out.write("        		}else{//메세지를 전송할 수 없다.\r\n");
      out.write("        			isSubmit = false;\r\n");
      out.write("        		    $('#sp1').html(\"이메일을 확인하시오\");\r\n");
      out.write("        		}\r\n");
      out.write("        		\r\n");
      out.write("        	  },\r\n");
      out.write("        	  //요청에 실패시 실행할 함수 정의 \r\n");
      out.write("        	  error : function(){\r\n");
      out.write("        		  alert(\"요청 실패!\");\r\n");
      out.write("        	  }\r\n");
      out.write("        	  \r\n");
      out.write("          });\r\n");
      out.write("     \r\n");
      out.write("        //isSubmit이 true인 경우에만 submit할 수 있도록\r\n");
      out.write("        if(isSubmit){\r\n");
      out.write("         	alert(isSubmit);\r\n");
      out.write("         	this.submit();\r\n");
      out.write("       \r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("     })\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("     </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}