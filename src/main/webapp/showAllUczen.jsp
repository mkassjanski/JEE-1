<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj ucznia</title>
</head>
<body>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:include page="include/header.jsp" />
    <h1>Uczniowie</h1>
    <table class="zui-table zui-table-horizontal zui-table-highlight">
    <thead>
        <tr>
            <th>Imie</th>
            <th>Nazwisko</th>
            <th>Plec</th>
            <th>Pesel</th>
            <th></th>
        </tr>
          </thead>
    <tbody>
    <c:forEach var="uczen" items="${storage.getAllUczen()}">
        <tr>
            <td>${uczen.imie}</td>
            <td>${uczen.nazwisko}</td>
            <td>${uczen.plec}</td>
             <td>${uczen.pesel}</td>
            <td>
                    <form action="EdytujUczen.jsp">
                        <input type="submit" value="Edytuj">
                        <input type=hidden name="id" value=${uczen.id}>
                    </form>
                    <form action="UsunUczen.jsp">
                        <input type="submit" value="Usuń">
                        <input type="hidden" name="id" value=${uczen.id}>
                    </form>
              </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>

    <form action="DodajUczen.jsp">

        <p class="przycisk"><input type="submit" value=" Dodaj "></p>

    </form>
</body>
</html>