<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- floor�� room�� ����� ���� ������ �� ������ ������Ÿ������ ��ȯ�Ͽ� ���� -->
     <table border='1'>
     <% 
     int layer = Integer.parseInt(request.getParameter("layer"));
     int room = Integer.parseInt(request.getParameter("room"));
     
     
     
     for(int row=0; row< layer;row++){
    	    out.print("<tr>");
    	       for(int col=0; col<room; col++){
    	    	 out.print("<td>"+col+"</td>");
    	    	 
    	       }
    	    out.print("</tr>");
     }
     
     
    
     
     %>
     </table>
     
     <%-- <form>
        <table border="1">
             <%
             /*  String layer =request.getParameter("layer");
             String room =request.getParameter("room");
              int layernum = Integer.parseInt(layer);
              int roomNum=Integer.parseInt(room); */
              
              for(int i=0;i< layernum ;i++){ %>
            	  <tr>  
            <%for(int j=0;j<roomNum;j++) {%>
            	  <td><%=j %></td>
              <% }%>
              </tr>
              <%} %>
           
        
        
        </table>
     </form> --%>
</body>
</html>