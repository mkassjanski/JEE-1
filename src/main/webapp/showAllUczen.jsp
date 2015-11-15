<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.ukryty {visibility: hidden; width: 1px; height: 1px; font-size: 1px; margin: 0px ; padding: 0px}
</style>
</head>
<body>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:setProperty name="uczen" property="*" />
<%
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
%>
<p>
  <a href="/dziennik/form">Add another person</a>
</p>
</body>
</html>