<%@page import="kass.domain.Przedmiot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj ucznia</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:setProperty name="przedmiot" property="*" />
<br>
<table class="zui-table zui-table-horizontal zui-table-highlight">
    <thead>
        <tr>
            <th>Nazwa</th>
            <th>Typ</th>
            <th>Liczba godzin</th>
            <th>Opcje</th>
        </tr>
    </thead>
    <tbody>
<%
  for (Przedmiot przedmiot : storage.getAllPrzedmiot()) {
	  out.println("<tr>");
	  out.println("<td>" + przedmiot.getNazwa() + "</td>"+
			  "<td>" + przedmiot.getTyp() + "</td>"+
			  "<td>" + przedmiot.getGodz() + "</td>"+
			  "<td>" + "<form  action='UsunPrzedmiot.jsp' method='post'>" +
			  "<input type='submit' value='Usuń'>" +
			  "<input class='ukryty' type='text' name='id' value='"+przedmiot.getId()+"'>" +
			  "</form>" 
				+
			  "<form  action='EdytujPrzedmiot.jsp' method='post'>" +
			  "<input type='submit' value='Edytuj'>" +
			  "<input class='ukryty' type='text' name='id' value='"+przedmiot.getId()+"'>" +
			  "</form>" + "</td>" + "</tr>");
  }
%>
</tbody>
</table>
<br>
 <form  action='http://localhost:8080/dziennik/form2'>
<input type='submit' value='Dodaj przedmiot'>
</form>
</body>
</html>