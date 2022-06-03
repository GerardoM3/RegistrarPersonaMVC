<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>
        <h1>Registro de personas</h1>
        <form action="recibir.do" method="POST">
            DUI:<input type="text" name="txtDui" value="" /><br>
            Nombres:<input type="text" name="txtNombres" value="" /><br>
            Apellidos:<input type="text" name="txtApellidos" value="" /><br>
            <input type="submit" value="Regitrar Nueva Persona" name="btnRNP" />
        </form>
    </body>
</html>
