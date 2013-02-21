package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hibernate.Manager;
import java.util.List;
import hibernate.LogisticHelper;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <hr>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"green\" ><h1>LIST MANAGER</h1></font>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("         <br><br><br><br><br><br><br><br><br>\n");
      out.write("                    Liste des Manager :\n");
      out.write("                    <table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                             <td width=\"120px\"><b>Nom</b></td>\n");
      out.write("                            <td width=\"120px\"><b>Prénom</b></td>\n");
      out.write("                            <td width=\"120px\"><b>Login</b></td>\n");
      out.write("                            <td width=\"120px\"><b>Adresse</b></td>\n");
      out.write("                             <td width=\"120px\"><b>Telephone</b></td>\n");
      out.write("                            <td width=\"120px\">email<b></b></td>\n");
      out.write("                                                                             \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            LogisticHelper pHelper = new LogisticHelper();
                            List <Manager> lst = pHelper.getListAbonnee();
                            for(int i=0; lst != null && i < lst.size(); i++){
                                if(i%2==0){
                        
      out.write("\n");
      out.write("                        <tr bgcolor=\"#F5F5F5\"></tr>\n");
      out.write("                        ");

                            }
                                else {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                            <td>");
      out.print( i+1 );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lst.get(i).getNom() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lst.get(i).getPrenom() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lst.get(i).getLogin() );
      out.write("</td>\n");
      out.write("                             <td>");
      out.print( lst.get(i).getAdresse() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lst.get(i).getTel() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lst.get(i).getEmail() );
      out.write("</td>\n");
      out.write("                            <td bgcolor=\"white\" align=\"center\"></td>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("          </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
