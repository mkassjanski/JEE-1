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
      out.write("<title>Dodaj ucznia</title>\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("uczen"), request);
      out.write("\n");
      out.write("<br>\n");
      out.write("<table class=\"zui-table zui-table-horizontal zui-table-highlight\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Imie</th>\n");
      out.write("            <th>Nazwisko</th>\n");
      out.write("            <th>Plec</th>\n");
      out.write("            <th>Pesel</th>\n");
      out.write("            <th>Opcje</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");

  for (Uczen uczen : storage.getAllUczen()) {
	  out.println("<tr>");
	  out.println("<td>" + uczen.getImie() + "</td>"+
			  "<td>" + uczen.getNazwisko() + "</td>"+
			  "<td>" + uczen.getPlec() + "</td>"+
			  "<td>" + uczen.getPesel() + "</td>"+
			  "<td>" + "<form  action='UsunUczen.jsp' method='post'>" +
			  "<input type='submit' value='Usuń'>" +
			  "<input type='hidden' name='id' value='"+uczen.getId()+"'>" +
			  "</form>" 
				+
			  "<form  action='EdytujUczen.jsp' method='post'>" +
			  "<input type='submit' value='Edytuj'>" +
			  "<input type='hidden' name='id' value='"+uczen.getId()+"'>" +
			  "</form>" + "</td>" + "</tr>");
  }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write(" <form  action='http://localhost:8080/dziennik/form'>\n");
      out.write("<input type='submit' value='Dodaj ucznia'>\n");
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
