<%@page import="model.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������� ���</title>
<link rel="stylesheet" href="style/css/voteresult.css" />


</head>
	<body>
		
	<%
	String rank1 = request.getParameter("rank1");
	String rank2 = request.getParameter("rank2");
	String rank3 = request.getParameter("rank3");
	
	%>

    <h1>�� �������� ���</h1>
    <form>
      <div class="main">
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">�ڼ�������</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank1%>.jpg" alt="" title="" /><!-- ������ 1���� ���� -->
                  </span>
                  <h3><%=rank1 %></h3><!-- 1�������̸� �����°� -->
                  <span data-sipu-resultpoint="" class="point"><span>1��</span></span> <!-- ��Ī�� �ۼ�Ʈ  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
         
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">�ڼ�������</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank2%>.jpg" alt="" title="" /><!-- ������ 2���� ���� -->
            		</span> 
            		<h3><%=rank2 %></h3><!-- 2�������̸� �����°� -->
                  <span data-sipu-resultpoint="" class="point"><span>2��</span></span><!-- ��Ī�� �ۼ�Ʈ  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
              <li data-sipu-result="">
                  <span class="thumb_detail">�ڼ�������</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="dog_img/<%=rank3%>.jpg" alt="" title="" /><!-- ������ 3���� ���� -->
                  </span>
                  <h3><%=rank3 %></h3><!-- 3�������̸� �����°� -->
                  <span data-sipu-resultpoint="" class="point"><span>3��</span></span><!-- ��Ī�� �ۼ�Ʈ  -->
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
      </div>
      <div class="footer">
        <a href="vote.jsp">
          <h2 class="result_restart" style="margin-top:13px;padding-top:12px">�ٽ��ϱ�</h2>
          <!-- <img alt="�ٽ��ϱ�" src="https://interactive.hankookilbo.com/v/e4fe0c1ef9294bdbb8e34c3b326ec2ed/images/result/bt_re_game.png"> -->
        </a>
        <a href="introduce.jsp"><h2 class="result_restart" style="margin-top:13px;padding-top:12px">Ȩ����</h2></a>
       </div>
   
      </form>
    

</body>
</html>