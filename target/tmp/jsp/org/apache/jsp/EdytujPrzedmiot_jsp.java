package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kass.domain.Przedmiot;

public final class EdytujPrzedmiot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      kass.domain.Przedmiot przedmiotTEMP = null;
      synchronized (session) {
        przedmiotTEMP = (kass.domain.Przedmiot) _jspx_page_context.getAttribute("przedmiotTEMP", PageContext.SESSION_SCOPE);
        if (przedmiotTEMP == null){
          przedmiotTEMP = new kass.domain.Przedmiot();
          _jspx_page_context.setAttribute("przedmiotTEMP", przedmiotTEMP, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      kass.domain.Przedmiot przedmiot = null;
      synchronized (session) {
        przedmiot = (kass.domain.Przedmiot) _jspx_page_context.getAttribute("przedmiot", PageContext.SESSION_SCOPE);
        if (przedmiot == null){
          przedmiot = new kass.domain.Przedmiot();
          _jspx_page_context.setAttribute("przedmiot", przedmiot, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("przedmiotTEMP"), "id", request.getParameter("id"), request, "id", false);
      out.write('\n');


    for (Przedmiot przedmiotTEM : storage.getAllPrzedmiot()) {
        if(przedmiotTEM.getId() == przedmiotTEMP.getId()) {
        	przedmiot.setId(przedmiotTEM.getId());
        	przedmiot.setNazwa(przedmiotTEM.getNazwa());
        	przedmiot.setTyp(przedmiotTEM.getTyp());
        	przedmiot.setGodz(przedmiotTEM.getGodz());
            break;
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<form action=\"EndEdytujPrzedmiot.jsp\" method='post'>\n");
      out.write("    <p>\n");
      out.write("        <label>Nazwa: &nbsp;</label><input type=\"text\" name=\"nazwa\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Przedmiot)_jspx_page_context.findAttribute("przedmiot")).getNazwa())));
      out.write("' /><br />\n");
      out.write("        <label>Typ: </label><br />\n");
      out.write(" ");

    if(przedmiot.getTyp().equals("Obowiazkowy")){

      out.write("\n");
      out.write("        <input type=\"radio\" name=\"typ\" value=\"Obowiazkowy\" checked> Obowiazkowy  <br />\n");
      out.write("        <input type=\"radio\" name=\"typ\" value=\"Dodatkowy\"> Dodatkowy <br />\n");
      out.write("        \n");

    } else {

      out.write(" \t\n");
      out.write("\t\t<input type=\"radio\" name=\"typ\" value=\"Obowiazkowy\"> Obowiazkowy  <br />\n");
      out.write("\t\t<input type=\"radio\" name=\"typ\" value=\"Dodatkowy\" checked> Dodatkowy <br />\n");
      out.write("\n");

   }

      out.write("\n");
      out.write("        <label>Liczba godzin: &nbsp;</label><input type=\"text\" name=\"godz\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Przedmiot)_jspx_page_context.findAttribute("przedmiot")).getGodz())));
      out.write("'  /><br />\n");
      out.write("    </p>\n");
      out.write("    <p><input type=\"submit\" value=\" OK \"></p>\n");
      out.write("    <p class=\"ukryty\"><input type=\"text\" name=\"id\" value='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((kass.domain.Przedmiot)_jspx_page_context.findAttribute("przedmiot")).getId())));
      out.write("' /></p>\n");
      out.write("</form>\n");
      out.write("<form  action='showAllPrzedmiot.jsp'>\n");
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
