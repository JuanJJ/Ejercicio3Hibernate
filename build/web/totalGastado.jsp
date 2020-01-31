<%-- 
    Document   : totalGastado
    Created on : 31-ene-2020, 11:51:28
    Author     : Alumno_2DAW
--%>

<%@page import="dvdRental.Payment"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.Rental"%>
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
    <%
        Ayudante ayudante=new Ayudante();
        int idVideoClub=Integer.parseInt(request.getParameter("videoClub1"));
        int idCliente=Integer.parseInt(request.getParameter("cliente1"));
        String mesDesde=request.getParameter("mesDesde");
        String mesHasta=request.getParameter("mesHasta");
        List<Payment>alquileres=ayudante.getTotalGastado(idVideoClub, idCliente, mesDesde, mesHasta);
        float total=0;
        Payment alquiler=null;
        for(int i=0;i<alquileres.size();i++){
            alquiler=alquileres.get(i);
            total+=alquiler.getAmount();
        }
        
        
    %>
    <table>
        <tr>
            <td colspan="2">
                <img src="imagenes/videoteca.gif" alt="Logo">
                <hr>
            </td>
        </tr>

        <tr>
            <th>
                
                Cliente
            </th>
            <th>
                Total Alquiler
            </th>
        </tr>
        <tr>
            <td>
                <% if(alquiler!=null){ %>
                <p><%=alquiler.getCustomer().getFirstName() %> <%=alquiler.getCustomer().getLastName() %></p>
                <%}else{%>
                <p>------------------------------</p>
                <%}%>
            </td>
            <td>
                <% if(alquiler!=null){ %>
                <p><%=total %></p>
                <%}else{%>
                <p>-----------</p>
                <%}%>
            </td>
        </tr>
       

        <tr>
            
            <td colspan="3"><hr><input type="button" value="Volver" onclick="location.href='inicio.jsp'"></td>
        </tr>
        

    </table>
</body>

</html>
