<%-- 
    Document   : newjsp
    Created on : 05/09/2017, 19:35:20
    Author     : 1860915
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%! 
            int i = 0;
            int a = i+1;
        %>
        
        <% 
        
            for(int i = 0;i<2;i++){
                
                %>
                <h2>puta que pariu <%= i%></h2>
                <%
            }
        
        %>
        
        <%-- este é um comentario jsp --%>
        <!-- este é um comentario html -->
        
    </body>
</html>
