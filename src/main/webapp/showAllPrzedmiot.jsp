<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista przedmitów</title>
</head>
<body>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:include page="include/header.jsp" />
    <h1>Przedmioty</h1>
    <table class="zui-table zui-table-horizontal zui-table-highlight">
    <thead>
        <tr>
            <th>Nazwa</th>
            <th>Typ</th>
            <th>Liczba godzin</th>
            <th></th>
        </tr>
          </thead>
    <tbody>
    <c:forEach var="przedmiot" items="${storage.getAllPrzedmiot()}">
        <tr>
            <td>${przedmiot.nazwa}</td>
            <td>${przedmiot.typ}</td>
            <td>${przedmiot.godz}</td>
            <td>
                    <form action="EdytujPrzedmiot.jsp">
                        <input type="submit" value="Edytuj">
                        <input type=hidden name="id" value=${przedmiot.id}>
                    </form>
                    <form action="UsunPrzedmiot.jsp">
                        <input type="submit" value="Usuń">
                        <input type="hidden" name="id" value=${przedmiot.id}>
                    </form>
              </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>

    <form action="dodajPrzedmiot">
        <p class="przycisk"><input type="submit" value=" Dodaj "></p>

    </form>
</body>
</html>