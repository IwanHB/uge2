<%-- 
    Document   : hello
    Created on : 09-11-2016, 18:12:31
    Author     : Iwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>      
        
        <div id="navneboksen">
            <%=request.getParameter("firstname")%>
        </div>
        <h1>Tabel med data fra formularen:</h1>
        <div id="tableDiv">
        <table>
            <tr>
            <td>Fornavn:</td><td><%=request.getParameter("firstname")%></td>
            </tr>            
            <tr>
            <td>Efternavn:</td><td><%=request.getParameter("lastname")%></td>
            </tr>        
            <tr>
            <td>By:</td><td><%=request.getParameter("city")%></td>
            </tr>       
            <tr>
            <td>E-mail:</td><td><%=request.getParameter("mail")%></td>
            </tr>        
            <tr>
            <td>Mobilnummer:</td><td><%=request.getParameter("phone")%></td>
            </tr>       
            <tr>
            <td>Fødselsår:</td><td><%=request.getParameter("year")%></td>
            </tr>        
            <tr>
            <td>Køn:</td><td><%=request.getParameter("sex")%></td>
            </tr>        
            <tr>
            <td>Beskrivelse:</td><td><%=request.getParameter("description")%></td>
            </tr>
            <tr>
            <td>Billede:</td><td><img src="<%=request.getParameter("picture")%>"></td>
            </tr>
            </div>
    </body>
</html>
