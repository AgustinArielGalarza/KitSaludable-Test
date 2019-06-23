package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kitsaludable.componentes.*;

public final class alimentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos/estilos.css\">\n");
      out.write("        <title>Alimentos</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <header>\n");
      out.write("            <h1 onclick=\"location.href='index.html'\">KitSaludable</h1>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form class=\"container\" name=\"menu\" action=\"controlador\" method=\"post\"  >\n");
      out.write("            <select name=\"\" >\n");
      out.write("                <option name=\"\" value =\"\" disable selected>--Seleccione una Dieta--</option>\n");
      out.write("                <option name=\"opcion\" value =\"dieta proteica\">dieta proteica</option>\n");
      out.write("                <option name=\"opcion\" value =\"dieta de harinas\">dieta de harinas</option>\n");
      out.write("                <option name=\"opcion\" value =\"dieta del limon\">dieta del limon</option>\n");
      out.write("                <option name=\"opcion\" value =\"Azucares\">Azucares</option>\n");
      out.write("                <option name=\"opcion\" value =\"Vegetariana\">Vegetariana</option>\n");
      out.write("            </select>\n");
      out.write("             <input  name=\"boton\" type=\"submit\" value=\"Enviar\"/>\n");
      out.write("        </form>\n");
      out.write("        ");
 
        List<alimentos> al = (List < alimentos >) request.getAttribute("lista dietas");
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.print( al);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class =\"container\">\n");
      out.write("            <h3>Lista de alimentos de la dieta seleccionada</h3>\n");
      out.write("           <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                <tr class=\"success\">\n");
      out.write("                    <th>N°</th>\n");
      out.write("                    <th>Alimentos</th>\n");
      out.write("                    <th>Calorias</th>\n");
      out.write("                    <th>Descripcion</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                    <td>-</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("    <footer> \n");
      out.write("        <br></br>\n");
      out.write("        <br></br>\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
      out.write("\n");
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
