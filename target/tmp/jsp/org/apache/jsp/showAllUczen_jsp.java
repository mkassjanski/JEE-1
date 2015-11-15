package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kass.domain.Uczen;

public final class showAllUczen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".ukryty {visibility: hidden; width: 1px; height: 1px; font-size: 1px; margin: 0px ; padding: 0px}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      kass.service.StorageService storage = null;
      synchronized (application) {
        storage = (kass.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new kass.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("uczen"), request);
      out.write('\n');

  for (Uczen uczen : storage.getAllUczen()) {
	  out.println("<p>Imie: " + uczen.getImie() + "; Nazwisko: " + uczen.getNazwisko() + "; Plec " + uczen.getPlec() + "; Pesel: "+ uczen.getPesel() + 
			  "<form  action='UsunUczen.jsp'>" +
			  "<input type='submit' value='Usuń'>" +
			  "<input class='ukryty' type='text' name='id' value='"+uczen.getId()+"'>" +
			  "</form>" 
				+
			  "<form  action='EdytujUczen.jsp'>" +
			  "<input type='submit' value='Edytuj'>" +
			  "<input class='ukryty' type='text' name='id' value='"+uczen.getId()+"'>" +
			  "</form>"
			  +
	  
	  "</p>");
  }

      out.write("\n");
      out.write("<p>\n");
      out.write("  <a href=\"/dziennik/form\">Add another person</a>\n");
      out.write("</p>\n");
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
