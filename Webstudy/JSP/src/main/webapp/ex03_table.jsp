<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
     <form>
       <table border="1">

           
           <%for(int row=1;row<11;row++) {%>
           <tr>
           <%for(int col=1;col<11;col++) {%>
              <td> <%=col %> </td>
           <%} %>
           </tr>
            <%} %>
           
       </table>
     
     </form>
</body>
</html>