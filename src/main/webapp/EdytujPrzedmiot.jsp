<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edycja przedmiotu</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="przedmiotTEMP" class="kass.domain.Przedmiot" scope="session" />
<jsp:setProperty name="przedmiotTEMP" property="id" />
<jsp:useBean id="przedmiot" class="kass.domain.Przedmiot" scope="session" />

<c:forEach var="przedmiotDoEdycji" items="${storage.getAllPrzedmiot()}">
 <c:if test="${przedmiotDoEdycji.getId() eq przedmiotTEMP.getId()}">
        ${przedmiot.setId(przedmiotDoEdycji.getId())}
        ${przedmiot.setNazwa(przedmiotDoEdycji.getNazwa())}
        ${przedmiot.setTyp(przedmiotDoEdycji.getTyp())}
        ${przedmiot.setGodz(przedmiotDoEdycji.getGodz())}
    </c:if>
</c:forEach>

<form action="walidacjaPrzedmiotU">
    <p>
        <label>Nazwa: &nbsp;</label><input type="text" name="nazwa" value=${przedmiot.getNazwa()} /><br />
        <label>Typ: &nbsp;</label> <br />
        <c:if test="${przedmiot.getTyp() == 'Obowiazkowy'}">
		<input type='radio' name='typ' value='Obowiazkowy' checked>Obowiazkowy<br />
		<input type='radio' name='typ' value='Dodatkowy'>Dodatkowy<br />
         </c:if>
         <c:if test="${przedmiot.getTyp() == 'Dodatkowy'}">
         	<input type="radio" name="typ" value="Obowiazkowy"/>Obowiazkowy <br />
        	 <input type="radio" name="typ" value="Dodatkowy" checked/>Dodatkowy <br />
         </c:if>
        <label>Liczba godzin: </label><input type="text" name="godz" value=${przedmiot.getGodz()}  /><br />
    </p>
    <p><input type="submit" value=" OK "></p>
    <p><input type="hidden" name="id" value=${przedmiot.getId()} /></p>
</form>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Anuluj'>
</form>
</body>
</html>