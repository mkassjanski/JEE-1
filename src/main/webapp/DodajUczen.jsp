<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczen" property="*" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<%
storage.dodajUczen(uczen);
%>
<p>Do bazy zostal dodany uczeń z poniżczymi danymi: </p>
<p>Imie:  <jsp:getProperty name="uczen" property="imie"></jsp:getProperty> </p>
<p>Nazwisko:  <jsp:getProperty name="uczen" property="nazwisko"></jsp:getProperty> </p>
<p>Plec: <jsp:getProperty name="uczen" property="plec"></jsp:getProperty></p>
<p>Pesel: <jsp:getProperty name="uczen" property="pesel"></jsp:getProperty></p>
<form  action='http://localhost:8080/dziennik/form'>
<input type='submit' value='Dodaj kolejnego ucznia'>
</form>
<br>
<form  action='showAllUczen.jsp'>
<input type='submit' value='Zobacz wszystkich ucznów'>
</form>
</body>
</html>