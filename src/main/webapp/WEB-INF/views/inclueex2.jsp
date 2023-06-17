<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>

    </head>
    <body>
        <%@ include file = "inclueex.jsp" %>
        <% 
            out.println(str + "<br/>"); 
            str = "바꿀 수도 있다!";
            out.println(str + "<br/>"); 
        %>
    </body>
</html>
