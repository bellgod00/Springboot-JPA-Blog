<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Boot Application</title></title>
    </head>
    <body>
        <h1>Hello, Spring Boot App</h1> 
        <%-- 변수 및 메소드 선언 --%> 
        <%! 
            int a; 
            int b;
            
            public int sum(int a, int b) {
            return a + b;
            }

            public int mulit(int a, int b) {
                return a * b;
            }
        %>
    
        <%-- 자바 코드 삽입 --%>
        <% 
            a = 10;
            b = 20;
            out.println(sum(a, b));
        %>
        <br/>
        <%-- 자바 코드 삽입 --%>
        <% 
            a = 10;
            b = 20;
            out.println(mulit(a, b));
        %>
        <br/>
        <%-- 표현식을 사용해 출력 --%>
        표현식의 결과값은 <%= sum(a,b) %> 입니다. <br/>
        
        <%-- 스크립트릿(자바 코드 삽입)을 사용해 출력 --%>
        스크립트릿의 결과값은 <% out.println(sum(a,b)); %> 입니다.
    </body>
</html>
