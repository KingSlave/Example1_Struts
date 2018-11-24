<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Calculo de porcentaje</title>
        <link rel="stylesheet" href="res/css/estilo.css"/>
    </head>

    <body>
        <h2>
            La suma de ${num1} + ${num2} es: ${total}             
        </h2> 
        <form action="/Porcentaje/sumar">
            Numero 1: <input type="number" value="1" name="num1">
            <br>
            Numero 2: <input type="number" value="1" name="num2">
            <br>
            <button type="submit">Enviar</button>
        </form>        
    </body>
</html>






