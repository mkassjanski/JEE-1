<%@page import="kass.domain.Przedmiot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="przedmiotTEMP" class="kass.domain.Przedmiot" scope="session" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:setProperty name="przedmiotTEMP" property="id" />
<jsp:include page="include/header.jsp" />
<%
    Przedmiot przedmiot = new Przedmiot();
    for (Przedmiot przedmiotTEM : storage.getAllPrzedmiot()) {
        if(przedmiotTEM.getId() == przedmiotTEMP.getId()) {
        	przedmiot.setId(przedmiotTEM.getId());
            break;
        }
    }
    storage.usunPrzedmiot(przedmiot);
%>
 <h1>Uczeń został usunięty.</h1>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Zobacz wszystkie przedmioty'>
</form>
</body>
</html>