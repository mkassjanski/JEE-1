<%@page import="kass.domain.Uczen"%>
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
<jsp:setProperty name="uczen" property="*" />
<br>
<table class="zui-table zui-table-horizontal zui-table-highlight">
    <thead>
        <tr>
            <th>Imie</th>
            <th>Nazwisko</th>
            <th>Plec</th>
            <th>Pesel</th>
            <th>Opcje</th>
        </tr>
    </thead>
    <tbody>
<%
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
%>
</tbody>
</table>
<br>
 <form  action='http://localhost:8080/dziennik/form'>
<input type='submit' value='Dodaj ucznia'>
</form>
</body>
</html>