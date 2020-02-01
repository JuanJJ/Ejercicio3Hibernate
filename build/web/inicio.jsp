<%--
    Document   : inicio
    Created on : 30-ene-2020, 11:40:05
    Author     : Alumno_2DAW
--%>

<%@page import="dvdRental.Customer"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.Store"%>
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
        List<Store>listaVideoclub=ayudante.getListaVideoclub();
        List<Customer>listaClientes=ayudante.getListaClientes();
    %>
    <table>
        <tr>
            <td colspan="3">
                <img src="imagenes/videoteca.gif" alt="Logo">
                <hr>
            </td>
        </tr>

        <tr>
            <td colspan="3">
                <h4>Listado de peliculas alquiladas por un cliente en un videoclub</h4>
            </td>
        </tr>
        <tr>
            <form action="peliculasCliente.jsp?tramo=1" method="post">
                <td>
                    <label for="videoClub">Video club</label>
                    <select name="videoClub" id="videoClub">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        %>
                            <option value="<%=videoclub.getStoreId() %>"><%=videoclub.getNombre() %></option>
                        <%}%>
                    </select>
                </td>
                <td>
                    <label for="cliente">Cliente</label>
                    <select name="cliente" id="cliente">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaClientes.size();i++){
                                Customer cliente=listaClientes.get(i);
                            
                        %>
                            <option value="<%=cliente.getCustomerId() %>"><%=cliente.getFirstName() %> <%=cliente.getLastName() %></option>
                        <%}%>
                    </select>
                </td>
                <td>
                    <input type="submit" value="Mostrar">
                </td>
            </form>
        </tr>

        <tr>
            <td colspan="3">
                <h4>Total de dinero gastado por un cliente en el alquiler de peliculas de un videoclub en un mes:</h4>
            </td>
        </tr>
        <tr>
            <form action="totalGastado.jsp" method="post">
                <td>
                    <label for="videoClub1">Video club</label>
                    <select name="videoClub1" id="videoClub1">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        %>
                            <option value="<%=videoclub.getStoreId() %>"><%=videoclub.getNombre() %></option>
                        <%}%>
                    </select>
                    <br>
                    <label for="cliente1">Cliente</label>
                    <select name="cliente1" id="cliente1">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaClientes.size();i++){
                                Customer cliente=listaClientes.get(i);
                            
                        %>
                            <option value="<%=cliente.getCustomerId() %>"><%=cliente.getFirstName() %> <%=cliente.getLastName() %></option>
                        <%}%>
                    </select>
                </td>
                <td>
                    <label for="mesDesde">Mes desde</label>
                    <select name="mesDesde" id="mesDesde">
                        <option value="0">-------------------------</option>
                        <option value="2005-05-01">Mayo 2005</option>
                        <option value="2005-06-01">Junio 2005</option>
                        <option value="2005-07-01">Julio 2005</option>
                        <option value="2005-08-01">Agosto 2005</option>
                    </select>
                    <br>
                    <label for="mesHasta">Mes hasta</label>
                    <select name="mesHasta" id="mesHasta">
                        <option value="0">-------------------------</option>
                        <option value="2005-05-31">Mayo 2005</option>
                        <option value="2005-06-30">Junio 2005</option>
                        <option value="2005-07-31">Julio 2005</option>
                        <option value="2005-08-31">Agosto 2005</option>
                    </select>
                </td>
                <td>
                    <input type="submit" value="Mostrar">
                </td>
            </form>
        </tr>


        <tr>
            <td colspan="3">
                <h4>Listado de clientes de un videoclub y el total gastado en el alquiler de peliculas</h4>
            </td>
        </tr>
        <tr>
            <form action="totalGastadoVideoclub.jsp?tramo=1" method="post">
                <td colspan="2">
                    <label for="videoClub2">Video club</label>
                    <select name="videoClub2" id="videoClub2">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        %>
                            <option value="<%=videoclub.getStoreId() %>"><%=videoclub.getNombre() %></option>
                        <%}%>
                    </select>
                </td>

                <td>
                    <input type="submit" value="Mostrar">
                </td>
            </form>
        </tr>

        <tr>
            <td colspan="3">
                <h4>Listado de las peliculas de un videoclub y el total de veces que han sido alquiladas:</h4>
            </td>
        </tr>
        <tr>
            <form action="datosVideoclub.jsp" method="post">
                <td colspan="2">
                    <label for="videoClub3">Video club</label>
                    <select name="videoClub3" id="videoClub3">
                        <option value="0">-------------------------</option>
                        <%
                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        %>
                            <option value="<%=videoclub.getStoreId() %>"><%=videoclub.getNombre() %></option>
                        <%}%>
                    </select>
                </td>

                <td>
                    <input type="submit" value="Mostrar">
                </td>
            </form>
        </tr>

        <tr>
            <td colspan="3">
                <h4>Listado de actores que trabajan en una pelicula:</h4>
            </td>
        </tr>
        <tr>
            <form action="datosVideoclub.jsp" method="post">
                <td colspan="2">
                    <label for="pelicula">Pelicula</label>
                    <select name="pelicula" id="pelicula">
                        <option value="0">-------------------------</option>
                    </select>
                </td>

                <td>
                    <input type="submit" value="Mostrar">
                </td>
            </form>
        </tr>

    </table>
</body>

</html>