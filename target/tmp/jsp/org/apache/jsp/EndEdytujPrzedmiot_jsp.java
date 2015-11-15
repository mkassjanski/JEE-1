package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kass.domain.Przedmiot;

public final class EndEdytujPrzedmiot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
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
      kass.domain.Przedmiot przedmiotTEMP = null;
      synchronized (session) {
        przedmiotTEMP = (kass.domain.Przedmiot) _jspx_page_context.getAttribute("przedmiotTEMP", PageContext.SESSION_SCOPE);
        if (przedmiotTEMP == null){
          przedmiotTEMP = new kass.domain.Przedmiot();
          _jspx_page_context.setAttribute("przedmiotTEMP", przedmiotTEMP, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("przedmiot"), request);
      out.write('\n');
      kass.service.StorageService storage = null;
      synchronized (application) {
        storage = (kass.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new kass.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" ");

                    for (Przedmiot przedmiotTEM : storage.getAllPrzedmiot()) {
                        if (przedmiotTEM.getId() == przedmiot.getId()) {
                        	przedmiot.setId(przedmiotTEM.getId());
                            break;
                        }
                    }
 					Przedmiot nowy = new Przedmiot(przedmiot.getNazwa(), przedmiot.getTyp(), przedmiot.getGodz());
 					storage.edytujPrzedmiot(przedmiot, nowy);
            
      out.write("\n");
      out.write("            <h1>Przedmiot został zaktualizowany.</h1>\n");
      out.write("<form  action='showAllPrzedmiot.jsp'>\n");
      out.write("<input type='submit' value='Zobacz wszystkie przedmioty'>\n");
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
