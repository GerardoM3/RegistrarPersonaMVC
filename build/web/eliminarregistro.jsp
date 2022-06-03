<%-- 
    Document   : eliminarregistro
    Created on : 06-03-2022, 02:37:34 PM
    Author     : Monroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar registro</h1>
        <form action="eliminar.do" method="POST">
            DUI:<input type="text" name="txtDui" value="" /><br>
            Nombres:<input type="text" name="txtNombres" value="" /><br>
            Apellidos:<input type="text" name="txtApellidos" value="" /><br>
            <input type="submit" value="Eliminar registro" name="btnRNP" />
        </form>
    </body>
</html>
