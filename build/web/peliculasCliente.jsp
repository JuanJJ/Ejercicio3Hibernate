<%-- 
    Document   : peliculasCliente
    Created on : 31-ene-2020, 9:01:45
    Author     : Alumno_2DAW
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dvdRental.Rental"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.Film"%>
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
        h4{
            background-color: cornflowerblue;
            color: white;
        }
    </style>

</head>

<body>
    <%
        Ayudante ayudante=new Ayudante();
        int idVideoClub=Integer.parseInt(request.getParameter("videoClub"));
        int idCliente=Integer.parseInt(request.getParameter("cliente"));
        int tramo=Integer.parseInt(request.getParameter("tramo"));
        List<Rental>alquileres=ayudante.getPeliculasAlquiladas(idVideoClub, idCliente, tramo);
        
        
    %>
    <table>
        <tr>
            <td colspan="3">
                <img src="imagenes/videoteca.gif" alt="Logo">
            </td>
        </tr>

        <tr>
            <td colspan="3">
                <hr>
                <h2>Listado de peliculas</h2>
                <hr>
            </td>
        </tr>
        <tr>
            <th>Titulo</th>
            <th>Fecha de alquiler</th>
            <th>Fecha de devolucion</th>
        </tr>
        <tr>
            <td colspan="3"><hr></td>
        </tr>
        <%
            for(int i=0;i<alquileres.size();i++){
                Rental rental=alquileres.get(i);
                SimpleDateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");
                String fechaAlquiler=formateador.format(rental.getRentalDate());
                String fecheDevolucion=formateador.format(rental.getReturnDate());
            
        %>
        <tr>
            <td><%=rental.getInventory().getFilm().getTitle() %></td>
            <td><%=fechaAlquiler %></td>
            <td><%=fecheDevolucion %></td>
        </tr>
        <%}%>
        <%
            if(alquileres.size()<10){
            for(int i=0;i<(10-alquileres.size());i++){
        %>
        <tr>
            <td>-------------------------</td>
            <td>--/--/----</td>
            <td>--/--/----</td>
        </tr>
        <%}}%>
        
        <tr>
            <% if(tramo>=10){ %>
            <td><input type="button" value="anterior" onclick="location.href='peliculasCliente.jsp?tramo=<%=tramo-10 %>&cliente=<%=idCliente %>&videoClub=<%=idVideoClub %>'"></td>
            <%}else{%>
            <td></td>
            <%}%>
            <td></td>
            <% if(alquileres.size()==10){ %>
            <td><input type="button" value="Siguiente" onclick="location.href='peliculasCliente.jsp?tramo=<%=tramo+10 %>&cliente=<%=idCliente %>&videoClub=<%=idVideoClub %>'"></td>
            <%}else{%>
            <td></td>
            <%}%>
        </tr>

        <tr>
            <td colspan="3"><input type="button" value="Volver" onclick="location.href='inicio.jsp'"></td>
        </tr>
        

    </table>
</body>

</html>
