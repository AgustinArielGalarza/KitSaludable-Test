<%-- 
    Document   : listas
    Created on : 23/06/2019, 01:36:05
    Author     : Agustin
--%>

<%@page import="java.util.List"%>
<%@page import="kitsaludable.componentes.alimentos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>resultados</h1>
        <% 
         List<alimentos> losAlimentos=(List<alimentos>) request.getAttribute("lista dietas");
        %>
        <%= losAlimentos %>
    </body>
</html>
