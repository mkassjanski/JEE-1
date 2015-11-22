package kass.web;
import kass.domain.Przedmiot;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/walidacjaPrzedmiot2")
public class WalidacjaPrzedmiot2 extends HttpServlet  {

	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try
	        {
	        	Przedmiot przedmiot = new Przedmiot(request.getParameter("nazwa"),
	                      				  request.getParameter("typ"), 
	                      				Integer.parseInt(request.getParameter("godz")));
	        	przedmiot.setId(Integer.parseInt(request.getParameter("id")));
	
	long godz = przedmiot.getGodz();
	if(godz <0){
		  throw new Exception();
	}
	request.setAttribute("przedmiot", przedmiot);
    request.getRequestDispatcher("EndEdytujPrzedmiot.jsp").forward(request, response);
	        }
	        catch(Exception e)
	        {
	            request.getRequestDispatcher("blad.jsp").forward(request, response);
	        }
	 }
	
	
}
