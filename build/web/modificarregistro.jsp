<%-- 
    Document   : modificarregistro
    Created on : 06-03-2022, 01:06:31 PM
    Author     : Monroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
        </style>
    </head>
    <body>
        <h1>Modificar registro</h1>
        <div class="div_left">
            <c:forEach var="listaTotal" items="${sessionScope.personas}">
                DUI:${listaTotal.dui}<br>
                Nombres:${listaTotal.nombres}<br>
                Apellidos:${listaTotal.apellidos}<br>
                <br>
                <hr>
            </c:forEach>
        </div>
                <div class="div_right">
                    <form action="" method="POST">
                        DUI:<input type="text" name="txtDui_A" value="" /><br>
                        Nombres:<input type="text" name="txtNombres_A" value="" /><br>
                        Apellidos:<input type="text" name="txtApellidos_A" value="" /><br>
                    </form>
                </div>
                <br>
                <br>
                <div>
                    <form action="modificar.do" method="POST">
                        DUI:<input type="text" name="txtDui_N" value="" /><br>
                        Nombres:<input type="text" name="txtNombres_N" value="" /><br>
                        Apellidos:<input type="text" name="txtApellidos_N" value="" /><br>
                        <input type="submit" value="Modificar registro" name="btnRNP" />
                    </form>
                </div>
    </body>
</html>
