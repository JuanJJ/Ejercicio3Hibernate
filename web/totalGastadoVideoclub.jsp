<%-- 
    Document   : totalGastadoVideoclub
    Created on : 31-ene-2020, 13:39:03
    Author     : Alumno_2DAW
--%>

<%@page import="java.util.List"%>
<%@page import="dvdRental.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        table {
            margin: auto;
            width: 600px;
            margin-bottom: 50px;

        }

        td {
            margin: auto;
            text-align: center;
            width: 50%;
            /*border: 1px solid black;*/

        }

    </style>
    </head>
    <body>
        <table>
            <tr>
                <td colspan="3">
                    <img src="imagenes/videoteca.gif" alt="Logo">
                </td>
            </tr>
            <tr>
            <th>Cliente</th>
            <th>Total alquiler</th>
            </tr>
        <%
            //prueba query para sumar lo gastado por los clientes en un videoclub
            //select sum(pagos.amount), pagos.customer.firstName,pagos.customer.lastName from Payment as pagos where pagos.staff in (select empleado.staffId from Staff as empleado where empleado.store=1 ) group by pagos.customer"
            
            Ayudante ayudante=new Ayudante();
            int idVideoClub=Integer.parseInt(request.getParameter("videoClub2"));
            int tramo=Integer.parseInt(request.getParameter("tramo"));
            List<Object[]>lista=ayudante.getTotalGastadoVideoclub(idVideoClub,tramo);
            for(int i=0;i<lista.size();i++){
                Object[]gasto=lista.get(i);

        %>
        <tr>
            <td><%=gasto[1] %> <%=gasto[2] %></td>
            <td><%=gasto[0] %></td>
        </tr>
        <%}%>
        
                <tr>
            <% if(tramo>=10){ %>
            <td><input type="button" value="anterior" onclick="location.href='totalGastadoVideoclub.jsp?tramo=<%=tramo-10 %>&videoClub2=<%=idVideoClub %>'"></td>
            <%}else{%>
            <td></td>
            <%}%>
            <% if(lista.size()==10){ %>
            <td><input type="button" value="Siguiente" onclick="location.href='totalGastadoVideoclub.jsp?tramo=<%=tramo+10 %>&videoClub2=<%=idVideoClub %>'"></td>
            <%}else{%>
            <td></td>
            <%}%>
        </tr>

        <tr>
            <td colspan="2"><input type="button" value="Volver" onclick="location.href='inicio.jsp'"></td>
        </tr>
        </table>

    </body>
</html>
