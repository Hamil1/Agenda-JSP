package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Agenda;
import persistencia.AgendaDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"sweetalert-master/dist/sweetalert.min.js\"></script>\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"Script.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome-4.7.0\\css\\font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sweetalert-master/dist/sweetalert.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <title>Agenda - JSP</title>\n");
      out.write("        <style>\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table class=\"table table-hover table-bordered table-striped\">\n");
      out.write("        \n");
      out.write("            <!--Titulos-->\n");
      out.write("            <tr>\n");
      out.write("            ");

            AgendaDAO agendadao = new AgendaDAO();
            
            for(Agenda agenda: agendadao.getAll()){
      out.write("\n");
      out.write("            <th class=\"registroslightgrey\">");
      out.print(agenda.getTitulo());
      out.write("</th>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <!--Registros-->\n");
      out.write("        ");

            
            for(Agenda agenda: agendadao.getAll()){
                
      out.write("\n");
      out.write("                    \n");
      out.write("                <tr> \n");
      out.write("                       <td ><strong>");
      out.print(agenda.getId());
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getNombre() );
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getApellido() );
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getTelefono1() );
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getTelefono2() );
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getDireccion() );
      out.write("</strong></td>\n");
      out.write("                       <td contenteditable='true'><strong>");
      out.print(agenda.getCorreo() );
      out.write("</strong></td>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                   </tr>\n");
      out.write("                \n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        \t\t<button class=\"btn btn-default\" style=\"margin-left: 3px; width: 80px;\" id=\"guardar\">  <i data-toggle=\"tooltip\" title=\"Guardar\" class=\"fa fa-floppy-o fa-1x\" aria-hidden=\"true\"></i></button>\n");
      out.write("\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" style=\"margin-left: 3px;  width: 88px;\" data-toggle=\"modal\" data-target=\"#myModal\">\t<i data-toggle=\"tooltip\" title=\"Agregar\" class=\"fa fa-plus fa-1x\" aria-hidden=\"true\"></i></button>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  \t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    \t\t\t\t<div class=\"modal-content\">\n");
      out.write("      \t\t\t\t\t<div class=\"modal-header\" >\n");
      out.write("       \t\t\t\t\t\t<button type=\"button\" class=\"sr-only\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("       \t\t\t\t\t\t<h4 class=\"modal-title\" style=\"color: rgb(95, 90, 90);\">Agregar</h4>\n");
      out.write("      \t\t\t\t    </div>\n");
      out.write("      \t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("      \t\t\t\t\t<div style=\"height: 43px;\">\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"nombre\" placeholder=\"Nombre\" class=\"inputtext\" style=\"float:left; width: 50%;\" ></div>\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"apellido\" placeholder=\"Apellido\" class=\"inputtext\" style=\"width: 50%;float: right;\"></div>\n");
      out.write("      \t\t\t\t\t</div>\t\n");
      out.write("      \t\t\t\t\t<div style=\"height: 43px;\">\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"nombre\" placeholder=\"Telefono 1\" class=\"inputtext\" style=\"float:left; width: 50%;\" ></div>\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"apellido\" placeholder=\"Telefono 2\" class=\"inputtext\" style=\"width: 50%;float: right;\"></div>\n");
      out.write("      \t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("      \t\t\t\t\t<div style=\"height: 80px;\">\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"nombre\" placeholder=\"Dirección\" class=\"inputtext\" style=\"float:left; width: 50%;\" ></div>\n");
      out.write("      \t\t\t\t\t\t<div><input type=\"text\" name=\"apellido\" placeholder=\"Correo\" class=\"inputtext\" style=\"width: 50%;float: right;\"></div>\n");
      out.write("      \t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("      \t\t\t\t\t</div>\n");
      out.write("      \t\t\t\t\t<div class=\"modal-footer\" style=\"border: 0;    margin-bottom: -8px; margin-right: -2px;\">\n");
      out.write("      \t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" style=\"background-color:rgb(113, 188, 222);color:white;\">Guardar</button>\n");
      out.write("        \t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" style=\"background-color:rgb(247, 81, 81);color:white;\">Cerrar</button>\n");
      out.write("        \t\t\t\t\t\n");
      out.write("      \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("\n");
      out.write(" \t\t\t   </div>\n");
      out.write("\t\t   </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
