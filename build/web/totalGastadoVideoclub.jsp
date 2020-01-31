<%-- 
    Document   : totalGastadoVideoclub
    Created on : 31-ene-2020, 13:39:03
    Author     : Alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //prueba query para sumar lo gastado por los clientes en un videoclub
            String query="select sum(pagos.amount), pagos.customer.firstName,pagos.customer.lastName from Payment as pagos where pagos.staff in (select empleado.staffId from Staff as empleado where empleado.store=1 ) group by pagos.customer";
        %>
        <h1>Hello World!</h1>
    </body>
</html>
