<%@page import="model.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>설문조사 결과</title>
<link rel="stylesheet" href="style/css/voteresult.css" />


</head>
	<body>
		
	<%
	String rank1 = request.getParameter("rank1");
	String rank2 = request.getParameter("rank2");
	String rank3 = request.getParameter("rank3");
	
	%>

    <h1>내 설문조사 결과</h1>
    <form>
      <div class="main">
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank1%>.jpg" alt="" title="" /><!-- 강아지 1순위 사진 -->
                  </span>
                  <h3><%=rank1 %></h3><!-- 1강아지이름 나오는곳 -->
                  <span data-sipu-resultpoint="" class="point"><span>1위</span></span> <!-- 매칭시 퍼센트  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
         
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank2%>.jpg" alt="" title="" /><!-- 강아지 2순위 사진 -->
            		</span> 
            		<h3><%=rank2 %></h3><!-- 2강아지이름 나오는곳 -->
                  <span data-sipu-resultpoint="" class="point"><span>2위</span></span><!-- 매칭시 퍼센트  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank3%>.jpg" alt="" title="" /><!-- 강아지 3순위 사진 -->
                  </span>
                  <h3><%=rank3 %></h3><!-- 3강아지이름 나오는곳 -->
                  <span data-sipu-resultpoint="" class="point"><span>3위</span></span><!-- 매칭시 퍼센트  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
      </div>
      <div class="footer">
        <a href="vote.jsp">
          <h2 class="result_restart" style="margin-top:13px;padding-top:12px">다시하기</h2>
          <!-- <img alt="다시하기" src="https://interactive.hankookilbo.com/v/e4fe0c1ef9294bdbb8e34c3b326ec2ed/images/result/bt_re_game.png"> -->
        </a>
        <a href="introduce.jsp"><h2 class="result_restart" style="margin-top:13px;padding-top:12px">홈으로</h2></a>
       </div>
   
      </form>
    

</body>
</html>