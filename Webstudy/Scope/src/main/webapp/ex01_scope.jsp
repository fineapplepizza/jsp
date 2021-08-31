<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body> 
     <%
         //내장객체영역: page, request, session, application
         //서버에 정보를 저장할 때 사용하는 영역
         //저장: setAttribute()
         //접근: getAttribute()
         //삭제: removeAttribute()
         
         pageContext.setAttribute("page", "page영역");
         request.setAttribute("request","request영역");
         session.setAttribute("session", "session영역");
         application.setAttribute("application", "application영역");
     
     %>
     
     <!-- 4개의 영역에 저장된 데이터 출력 -->
     <%=pageContext.getAttribute("page") %><br>
     <%=request.getAttribute("request") %><br>
     <%=session.getAttribute("session") %><br>
     <%=application.getAttribute("application")%><br>
  
      <%
         //redirect방식
         // - 내부/외부 서버의 웹 페이지에 접근가능
         // - url주소 변환
         // - 요청이 2번 발생하기 때문에 request, response 정보 유지 X
         //ex02_scope.jsp로 이동
         // - 시스템 변경이 일어나는 작업에 활용
         //정보를 수정하고 입력하고 삭제할 때 쓴다.
         //정보를 유지시킬 수없기 때문에(정보를 담지 않고 이동하기때문에)
         response.sendRedirect("ex02_scope.jsp");
      
         //forward방식
         //-서버 내 웹 페이지만 접근가능(외부x)
         // - url주소에 변화가 없음
         // - request, response정보를 페이지 이동시 유지
         // - 시스템 변경을 일어나지 않는 작업에 활용
         //(게시글작성이나 데이터베이스내용수정 하지 않는 일들)
         //ex)forward방식으로 데이터베이스 연관되서 이동하게 되면 그 페이지에 새로고침했을 때
          //데이터가 계속 저장이됨 시스템이 계속변화가됨
         //RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_scope.jsp");
         //dispatcher.forward(request,response);
          
         //session은 브라우저가 달라지게 되면 정보를 유지시킬 수 없다.
         //실행되는 브라우저에만 생성이 되고 주소만 붙여넣기되면 해당브라우저에는 생성이 안됐기 때문에 이동할 수 없다.
 
      %>
      <!-- 외부에서 볼때 url주소가 바뀌지 않는다.
           
           
       -->
</body>
</html>