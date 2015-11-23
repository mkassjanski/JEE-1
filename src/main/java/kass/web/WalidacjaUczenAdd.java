package kass.web;
import kass.domain.Uczen;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/walidacjaUczenA")
public class WalidacjaUczenAdd extends HttpServlet  {

	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try
	        {
	        	  Uczen uczen = new Uczen(request.getParameter("imie"),
	                      				  request.getParameter("nazwisko"), 
	                      				  request.getParameter("plec"),  
	                      				  Long.parseLong(request.getParameter("pesel")));
	
	long pesel = uczen.getPesel();
	if(pesel <1000000000){
		  throw new Exception();
	}
	
	String plec =  uczen.getPlec();
	if( plec.length() <= 0)
	{
		  throw new Exception();
	}
	
	request.setAttribute("uczen", uczen);
    request.getRequestDispatcher("EndDodajUczen.jsp").forward(request, response);
	        }
	        catch(Exception e)
	        {
	            request.getRequestDispatcher("blad.jsp").forward(request, response);
	        }
	 }
	
	
}
