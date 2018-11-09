
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%
           String color ="";
           Cookie[] cookies = request.getCookies();
           for(Cookie c: cookies ){
             if(c.getName().equals("color")){
                color= c.getValue();
            }
           }
        %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: <%= color%>;">
      
        <h1>Bienvenido </h1>
        <%=session.getAttribute("usuario")%>
        
        <br>
        <form method="post" action="ProfileController"> 
            <select name="color">
                <option value="yellow">Rojo</option>
                <option value="pink">Verde</option>
                <option value="blue">Azul</option>
            </select>
            <br>
            <input type="submit" value="Guardar"/>
        </form>
    </body>
</html>
