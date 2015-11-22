<%@page import="kass.domain.Przedmiot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Przedmiot zostal usuniety</title>
</head>
<body>

<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="przedmiotTEMP" class="kass.domain.Przedmiot" scope="session" />
<jsp:setProperty name="przedmiotTEMP" property="id" />
<jsp:useBean id="przedmiot" class="kass.domain.Przedmiot" scope="session" />

<jsp:include page="include/header.jsp" />

<c:forEach var="przedmiotDoUsuniecia" items="${storage.getAllPrzedmiot()}">
    <c:if test="${przedmiotDoUsuniecia.getId() eq przedmiotTEMP.getId()}">
        ${przedmiot.setId(przedmiotDoUsuniecia.getId())}
    </c:if>
</c:forEach>
${storage.usunPrzedmiot(przedmiot)}




 <h1>Przedmiot został usunięty.</h1>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Zobacz wszystkie przedmioty'>
</form>
</body>
</html>