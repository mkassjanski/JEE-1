package kass.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/form2")
public class FormDodajPrzedmiot extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><link rel='stylesheet' type='text/css' href='include/dziennik.css'><body><nav><ul><li><a href='/dziennik'>Home</a></li><li><a href='/dziennik/showAllUczen.jsp'>Lista uczniów</a></li><li><a href='/dziennik/showAllPrzedmiot.jsp'>Lista przedmiotów</a></li></ul></nav></br>" +
	"<p>Formularz dodania nowy przedmiot</p>"+
	"<form action='DodajPrzedmiot.jsp' method='post'>" +
	"Nazwa: <input type='text' name='nazwa' /> <br />" +
	"Typ:<br>"+
	"<input type='radio' name='typ' value='Obowiazkowy'>Obowiazkowy<br />" +
	"<input type='radio' name='typ' value='Dodatkowy'>Dodatkowy<br />" +
	"Liczba godz: <input type='text' name='godz' /> <br />" +
	"<input type='submit' value=' OK ' />" +
	"</form>" +
	"</body></html>");
	out.close();
	
	
	
	
	
	}
}
