package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("            margin: auto;\n");
      out.write("            width: 500px;\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            margin: auto;\n");
      out.write("            text-align: center;\n");
      out.write("            width: 50%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <img src=\"imagenes/videoteca.gif\" alt=\"Logo\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <label for=\"videoclub\">Video club\n");
      out.write("                    <select name=\"videoClub\" id=\"videoClub\" onchange=\"asignaVideoclub()\">\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </label>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <h1>Datos del Negocio</h1>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"3\">\n");
      out.write("                <h1>Listado de peliculas alquiladas por un cliente en un videoclub</h1>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosVideoclub.jsp\" method=\"post\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"videoClub\">Video club</label>\n");
      out.write("                    <select name=\"videoClub\" id=\"videoClub\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"cliente\">Cliente</label>\n");
      out.write("                    <select name=\"cliente\" id=\"cliente\">\n");
      out.write("                        <option value=\"0\">-------------------------</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <h1>Gestion de Clientes</h1>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"datosCliente.jsp?inicio=0\" method=\"post\">\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"idVideoclub2\" id=\"idVideoclub2\" hidden><br>\n");
      out.write("                    <label for=\"clientesActivos\"><input type=\"radio\" name=\"clientes\" id=\"clientesActivos\" value=\"1\"\n");
      out.write("                            checked> Listado de\n");
      out.write("                        clientes activos</label><br>\n");
      out.write("                    <label for=\"clientesInactivos\"><input type=\"radio\" name=\"clientes\" id=\"clientesInactivos\" value=\"0\">\n");
      out.write("                        Listado\n");
      out.write("                        de clientes inactivos</label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <h1>Gestion de inventario</h1>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <form action=\"verPeliculas.jsp?inicio=0\" method=\"post\">\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"idVideoclub3\" id=\"idVideoclub3\" hidden><br>\n");
      out.write("                    <label for=\"categoria\">Categoria\n");
      out.write("                        <select name=\"categoria\" id=\"categoria\">\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td><input type=\"submit\" value=\"Mostrar\"></td>\n");
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
