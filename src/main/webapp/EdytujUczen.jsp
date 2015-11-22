<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="uczenTEMP" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczenTEMP" property="id" />
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="session" />

<c:forEach var="uczenDoEdycji" items="${storage.getAllUczen()}">
 <c:if test="${uczenDoEdycji.getId() eq uczenTEMP.getId()}">
        ${uczen.setId(uczenDoEdycji.getId())}
        ${uczen.setImie(uczenDoEdycji.getImie())}
        ${uczen.setNazwisko(uczenDoEdycji.getNazwisko())}
        ${uczen.setPlec(uczenDoEdycji.getPlec())}
        ${uczen.setPesel(uczenDoEdycji.getPesel())}
    </c:if>
</c:forEach>

<form action="walidacjaUczen2">
    <p>
        <label>Imie: &nbsp;</label><input type="text" name="imie" value=${uczen.getImie()} /><br />
        <label>Nazwisko: </label><input type="text" name="nazwisko" value=${uczen.getNazwisko()}  /><br />
        <label>Plec: &nbsp;</label> <br />
        <c:if test="${uczen.getPlec() == 'Chlopak'}">
        	  <input type="radio" name="plec" value="Chlopak" checked/>Chlopak <br />
        	  <input type="radio" name="plec" value="Dziewczyna" />Dziewczyna <br />
         </c:if>
         <c:if test="${uczen.getPlec() == 'Dziewczyna'}">
         	<input type="radio" name="plec" value="Chlopak"/>Chlopak <br />
        	 <input type="radio" name="plec" value="Dziewczyna" checked/>Dziewczyna <br />
         </c:if>
        <label>Pesel: </label><input type="text" name="pesel" value=${uczen.getPesel()}  /><br />
    </p>
    <p><input type="submit" value=" OK "></p>
    <p><input type="hidden" name="id" value=${uczen.getId()} /></p>
</form>
<form  action='showAllUczen.jsp'>
<input type='submit' value='Anuluj'>
</form>
</body>
</html>