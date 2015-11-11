<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<%
  for (Uczen uczen : storage.getAllUczen()) {
	  out.println("<p>Imie: " + uczen.getImie() + "; Nazwisko: " + uczen.getNazwisko() + " Pesel: "+ uczen.getPesel() +"</p>");
  }
%>
<p>
  <a href="getUczenData.jsp">Add another person</a>
</p>
</body>
</html>