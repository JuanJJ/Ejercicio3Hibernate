package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dvdRental.Customer;
import java.util.List;
import dvdRental.Store;
import dvdRental.Ayudante;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("            margin: auto;\n");
      out.write("            width: 600px;\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            margin: auto;\n");
      out.write("            text-align: center;\n");
      out.write("            width: 50%;\n");
      out.write("            /*border: 1px solid black;*/\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        h4{\n");
      out.write("            background-color: cornflowerblue;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

        Ayudante ayudante=new Ayudante();
        List<Store>listaVideoclub=ayudante.getListaVideoclub();
        List<Customer>listaClientes=ayudante.getListaClientes();
    
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <img src=\"imagenes/videoteca.gif\" alt=\"Logo\">\n");
      out.write("                <hr>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h4>Listado de peliculas alquiladas por un cliente en un videoclub</h4>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"peliculasCliente.jsp\" method=\"post\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"videoClub\">Video club</label>\n");
      out.write("                    <select name=\"videoClub\" id=\"videoClub\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        ");

                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(videoclub.getStoreId() );
      out.write('"');
      out.write('>');
      out.print(videoclub.getNombre() );
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"cliente\">Cliente</label>\n");
      out.write("                    <select name=\"cliente\" id=\"cliente\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        ");

                            for(int i=0;i<listaClientes.size();i++){
                                Customer cliente=listaClientes.get(i);
                            
                        
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(cliente.getCustomerId() );
      out.write('"');
      out.write('>');
      out.print(cliente.getFirstName() );
      out.write(' ');
      out.print(cliente.getLastName() );
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h4>Total de dinero gastado por un cliente en el alquiler de peliculas de un videoclub en un mes:</h4>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosVideoclub.jsp\" method=\"post\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"videoClub1\">Video club</label>\n");
      out.write("                    <select name=\"videoClub1\" id=\"videoClub1\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        ");

                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(videoclub.getStoreId() );
      out.write('"');
      out.write('>');
      out.print(videoclub.getNombre() );
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"cliente1\">Cliente</label>\n");
      out.write("                    <select name=\"cliente1\" id=\"cliente1\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"mesDesde\">Mes desde</label>\n");
      out.write("                    <select name=\"mesDesde\" id=\"mesDesde\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        <option value=\"2005-05-01\">Mayo 2005</option>\n");
      out.write("                        <option value=\"2005-06-01\">Junio 2005</option>\n");
      out.write("                        <option value=\"2005-07-01\">Julio 2005</option>\n");
      out.write("                        <option value=\"2005-08-01\">Agosto 2005</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"mesHasta\">Mes hasta</label>\n");
      out.write("                    <select name=\"mesHasta\" id=\"mesHasta\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        <option value=\"2005-05-31\">Mayo 2005</option>\n");
      out.write("                        <option value=\"2005-06-30\">Junio 2005</option>\n");
      out.write("                        <option value=\"2005-07-31\">Julio 2005</option>\n");
      out.write("                        <option value=\"2005-08-31\">Agosto 2005</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h4>Listado de clientes de un videoclub y el total gastado en el alquiler de peliculas</h4>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosVideoclub.jsp\" method=\"post\">\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <label for=\"videoClub2\">Video club</label>\n");
      out.write("                    <select name=\"videoClub2\" id=\"videoClub2\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        ");

                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(videoclub.getStoreId() );
      out.write('"');
      out.write('>');
      out.print(videoclub.getNombre() );
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h4>Listado de las peliculas de un videoclub y el total de veces que han sido alquiladas:</h4>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosVideoclub.jsp\" method=\"post\">\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <label for=\"videoClub3\">Video club</label>\n");
      out.write("                    <select name=\"videoClub3\" id=\"videoClub3\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                        ");

                            for(int i=0;i<listaVideoclub.size();i++){
                                Store videoclub=listaVideoclub.get(i);
                            
                        
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(videoclub.getStoreId() );
      out.write('"');
      out.write('>');
      out.print(videoclub.getNombre() );
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h4>Listado de actores que trabajan en una pelicula:</h4>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosVideoclub.jsp\" method=\"post\">\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <label for=\"pelicula\">Pelicula</label>\n");
      out.write("                    <select name=\"pelicula\" id=\"pelicula\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
