<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="request"/>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />

${storage.dodajUczen(uczen)}

<p>Dodano: </p>
<p>Imie: ${uczen.imie} </p>
<p>Nazwisko: ${uczen.nazwisko} </p>
<p>Plec: ${uczen.plec} </p>
<p>Pesel: ${uczen.pesel} </p>
    
<form  action='DodajUczen.jsp'>
<input type='submit' value='Dodaj kolejnych uczniów'>
</form>
<br>
<form  action='showAllUczen.jsp'>
<input type='submit' value='Zobacz wszystkich uczniów'>
</form>
</body>
</html>