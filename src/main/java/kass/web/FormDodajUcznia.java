package kass.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/form")
public class FormDodajUcznia extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><link rel='stylesheet' type='text/css' href='include/dziennik.css'><body><nav><ul><li><a href='/dziennik'>Home</a></li><li><a href='/dziennik/showAllUczen.jsp'>Lista uczniów</a></li><li><a href='/dziennik/showAllNauczyciel.jsp'>Lista nauczycieli</a></li></ul></nav></br>" +
	"<p>Formularz dodania nowego ucznia</p>"+
	"<form action='DodajUczen.jsp' method='post'>" +
	"Imie: <input type='text' name='imie' /> <br />" +
	"Nazwisko: <input type='text' name='nazwisko' /> <br />" +
	"Plec:<br>"+
	"<input type='radio' name='plec' value='Chlopiec'>Chlopiec<br />" +
	"<input type='radio' name='plec' value='Dziewczyna'>Dziewczyna<br />" +
	"Pesel: <input type='text' name='pesel' /> <br />" +
	"<input type='submit' value=' OK ' />" +
	"</form>" +
	"</body></html>");
	out.close();
	
	
	
	
	
	}
}
