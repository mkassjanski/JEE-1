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
<jsp:useBean id="przedmiot" class="kass.domain.Przedmiot" scope="session" />
<jsp:setProperty name="przedmiot" property="*" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<%
storage.dodajPrzedmiot(przedmiot);
%>
<p>Do bazy zostal dodany uczeń z poniżczymi danymi: </p>
<p>Nazwa:  <jsp:getProperty name="przedmiot" property="nazwa"></jsp:getProperty> </p>
<p>Typ:  <jsp:getProperty name="przedmiot" property="typ"></jsp:getProperty> </p>
<p>Liczba godzin: <jsp:getProperty name="przedmiot" property="godz"></jsp:getProperty></p>
<form  action='http://localhost:8080/dziennik/form2'>
<input type='submit' value='Dodaj kolejne przedmioty'>
</form>
<br>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Zobacz wszystkie przedmioty'>
</form>
</body>
</html>