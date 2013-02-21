package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta content=\"en-us\" http-equiv=\"Content-Language\" />\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\n");
      out.write("<title>MobileLogistic</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".auto-style2 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: xx-large;\n");
      out.write("\tcolor: #8E8C1B;\n");
      out.write("}\n");
      out.write(".auto-style3 {\n");
      out.write("\tmargin-top: 0px;\n");
      out.write("}\n");
      out.write(".auto-style5 {\n");
      out.write("\tcolor: #8E8C1B;\n");
      out.write("}\n");
      out.write(".auto-style6 {\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write(".auto-style7 {\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write(".auto-style8 {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tcolor: #8E8C1B;\n");
      out.write("\tfont-size: large;\n");
      out.write("}\n");
      out.write(".auto-style9 {\n");
      out.write("\ttext-align: right;\n");
      out.write("\tcolor: #8E8C1B;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1 class=\"auto-style2\"><strong>MobileLogistic </strong></h1>\n");
      out.write("<p><img alt=\"\" height=\"112\" src=\"images.jpg\" width=\"100%\" /></p>\n");
      out.write("<div style=\"width: 100%; height: 367px\">\n");
      out.write("\t<table align=\"center\" style=\"width: 100%; height: 275px\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td style=\"width: 223px\">\n");
      out.write("\t\t\t<form action=\"\" class=\"auto-style3\" method=\"post\" style=\"height: 122px; width: 224px\">\n");
      out.write("\t\t\t\t<table style=\"width: 29%\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td class=\"auto-style5\" style=\"width: 115px\"><strong>\n");
      out.write("\t\t\t\t\t\tLogin</strong></td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td class=\"auto-style5\" style=\"width: 115px\"><strong>\n");
      out.write("\t\t\t\t\t\tPassword</strong></td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input name=\"password\" style=\"width: 153px; height: 22px\" type=\"password\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td style=\"width: 115px\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"auto-style6\"><strong>\n");
      out.write("\t\t\t\t\t\t<input class=\"auto-style5\" name=\"Submit\" style=\"width: 83px\" type=\"submit\" value=\"Connexion\" /></strong></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td style=\"width: 115px\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"auto-style6\"><strong>\n");
      out.write("\t\t\t\t\t\t<input class=\"auto-style5\" name=\"Reset\" style=\"width: 83px\" type=\"reset\" value=\"Reset\" /></strong>&nbsp;</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td class=\"auto-style7\" style=\"width: 327px\"><strong><span class=\"auto-style5\">Bienvenue \n");
      out.write("\t\t\tsur la plateforme MobileLogistic</span><br class=\"auto-style5\" />\n");
      out.write("\t\t\t<br class=\"auto-style5\" />\n");
      out.write("\t\t\t<span class=\"auto-style5\">La plateforme MobileLogstic est une \n");
      out.write("\t\t\tplateforme de gestion exclusive de toutes les activités de \n");
      out.write("\t\t\tl&#39;entreprise permettant ainsi une suivie à quasi temps reél des \n");
      out.write("\t\t\tressource de l&#39;entreprise </span></strong></td>\n");
      out.write("\t\t\t<td class=\"auto-style6\">\n");
      out.write("\t\t\t<table  >\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"auto-style8\"><strong>Inscription</strong></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>Nom</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login0\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td  class=\"auto-style9\"><strong>Prenom</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input name=\"login1\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>Adresse</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login2\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>\n");
      out.write("\t\t\t\t\tTéléphone</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login3\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>Email</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login4\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>Login</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login5\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>\n");
      out.write("\t\t\t\t\tpassword</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login6\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 166px\"><strong>\n");
      out.write("\t\t\t\t\tRe-password</strong></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input align=\"right\" name=\"login7\" style=\"width: 153px\" type=\"text\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t\t<td class=\"auto-style6\"><strong>\n");
      out.write("\t\t\t\t\t\t<input class=\"auto-style5\" name=\"Submit\" style=\"width: 91px\" type=\"submit\" value=\"Inscrire\" /></strong></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        <tr>\t\t\t\t\t\t<td class=\"auto-style6\"><strong>\n");
      out.write("\t\t\t\t\t\t<input class=\"auto-style5\" name=\"Reset0\" style=\"width: 88px\" type=\"reset\" value=\"Reset\" /></strong>&nbsp;</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
