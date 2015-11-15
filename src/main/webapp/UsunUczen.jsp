<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="uczenTEMP" class="kass.domain.Uczen" scope="session" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:setProperty name="uczenTEMP" property="id" />
<%
    Uczen uczen = new Uczen();
    for (Uczen uczenTEM : storage.getAllUczen()) {
        if(uczenTEM.getId() == uczenTEMP.getId()) {
            uczen.setId(uczenTEM.getId());
            break;
        }
    }
    storage.usunUczen(uczen);
%>
 <h1>Usunięto!</h1>
 <p>
  <a href="/dziennik/form">Add another person</a>
</p>
</body>
</html>