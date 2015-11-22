<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Uczen zostal usuniety</title>
</head>
<body>

<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="uczenTEMP" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczenTEMP" property="id" />
<jsp:useBean id="usunUczen" class="kass.domain.Uczen" scope="session" />

<jsp:include page="include/header.jsp" />

<c:forEach var="uczenDoUsuniecia" items="${storage.getAllUczen()}">
    <c:if test="${uczenDoUsuniecia.getId() eq uczenTEMP.getId()}">
        ${usunUczen.setId(uczenDoUsuniecia.getId())}
    </c:if>
</c:forEach>
${storage.usunUczen(usunUczen)}




 <h1>Uczeń został usunięty.</h1>
<form  action='showAllUczen.jsp'>
<input type='submit' value='Zobacz wszystkich ucznów'>
</form>
</body>
</html>