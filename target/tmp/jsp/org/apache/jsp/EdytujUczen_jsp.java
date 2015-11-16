package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kass.domain.Uczen;

public final class EdytujUczen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write('\n');
      kass.service.StorageService storage = null;
      synchronized (application) {
        storage = (kass.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new kass.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      kass.domain.Uczen uczenTEMP = null;
      synchronized (session) {
        uczenTEMP = (kass.domain.Uczen) _jspx_page_context.getAttribute("uczenTEMP", PageContext.SESSION_SCOPE);
        if (uczenTEMP == null){
          uczenTEMP = new kass.domain.Uczen();
          _jspx_page_context.setAttribute("uczenTEMP", uczenTEMP, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      kass.domain.Uczen uczen = null;
      synchronized (session) {
        uczen = (kass.domain.Uczen) _jspx_page_context.getAttribute("uczen", PageContext.SESSION_SCOPE);
        if (uczen == null){
          uczen = new kass.domain.Uczen();
          _jspx_page_context.setAttribute("uczen", uczen, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("uczenTEMP"), "id", request.getParameter("id"), request, "id", false);
      out.write('\n');


    for (Uczen uczenTEM : storage.getAllUczen()) {
        if(uczenTEM.getId() == uczenTEMP.getId()) {
        	uczen.setId(uczenTEM.getId());
        	uczen.setImie(uczenTEM.getImie());
        	uczen.setNazwisko(uczenTEM.getNazwisko());
        	uczen.setPlec(uczenTEM.getPlec());
        	uczen.setPesel(uczenTEM.getPesel());
            break;
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<form action=\"EndEdytujUczen.jsp\" method='post'>\n");
      out.write("    <p>\n");
      out.write("        <label>Imie: &nbsp;</label><input type=\"text\" name=\"imie\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Uczen)_jspx_page_context.findAttribute("uczen")).getImie())));
      out.write("' /><br />\n");
      out.write("        <label>Nazwisko: </label><input type=\"text\" name=\"nazwisko\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Uczen)_jspx_page_context.findAttribute("uczen")).getNazwisko())));
      out.write("'  /><br />\n");
      out.write("        <label>Plec: </label><br />\n");
      out.write(" ");

    if(uczen.getPlec().equals("Chlopiec")){

      out.write("\n");
      out.write("        <input type=\"radio\" name=\"plec\" value=\"Chlopiec\" checked> Chlopiec  <br />\n");
      out.write("        <input type=\"radio\" name=\"plec\" value=\"Dziewczyna\"> Dziewczyna <br />\n");
      out.write("        \n");

    } else {

      out.write(" \t\n");
      out.write("\t\t<input type=\"radio\" name=\"plec\" value=\"Chlopiec\"> Chlopiec  <br />\n");
      out.write("\t\t<input type=\"radio\" name=\"plec\" value=\"Dziewczyna\" checked> Dziewczyna <br />\n");
      out.write("\n");

   }

      out.write("\n");
      out.write("        <label>Pesel: &nbsp;</label><input type=\"text\" name=\"pesel\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Uczen)_jspx_page_context.findAttribute("uczen")).getPesel())));
      out.write("'  /><br />\n");
      out.write("    </p>\n");
      out.write("    <p><input type=\"submit\" value=\" OK \"></p>\n");
      out.write("    <p><input type=\"hidden\" name=\"id\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Uczen)_jspx_page_context.findAttribute("uczen")).getId())));
      out.write("' /></p>\n");
      out.write("</form>\n");
      out.write("<form  action='showAllUczen.jsp'>\n");
      out.write("<input type='submit' value='Anuluj'>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
