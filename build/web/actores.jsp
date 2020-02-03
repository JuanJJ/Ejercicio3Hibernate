<%-- 
    Document   : actores
    Created on : 03-feb-2020, 16:30:03
    Author     : Juan
--%>

<%@page import="dvdRental.Film"%>
<%@page import="dvdRental.FilmActor"%>
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
    <%
        Ayudante ayudante=new Ayudante();
        int idPelicula=Integer.parseInt(request.getParameter("pelicula"));

        List<FilmActor>listaActores=ayudante.getActores(idPelicula);
        Film pelicula=ayudante.getPelicula(idPelicula);
        
        
    %>
    <table>
        <tr>
            <td colspan="2">
                <img src="imagenes/videoteca.gif" alt="Logo">
                <hr>
            </td>
        </tr>

        <tr>
            <th colspan="2">
                
                Actores de la pelicula: <%=pelicula.getTitle() %>
                <hr>
            </th>

        </tr>
        <%
            for(int i=0;i<listaActores.size();i++){
                FilmActor actor=listaActores.get(i);
        
        %>
        <tr>
            <td>
                <%=actor.getActor().getFirstName() %> <%=actor.getActor().getLastName() %>
            </td>

        </tr>
       
        <%}%>
        <tr>
            
            <td colspan="3"><hr><input type="button" value="Volver" onclick="location.href='inicio.jsp'"></td>
        </tr>
        

    </table>
</body>

</html>
