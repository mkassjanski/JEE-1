<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczen" property="*" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<%
storage.add(uczen);
%>
<p>Following person has been added to storage: </p>
<p>Imie:  <jsp:getProperty name="uczen" property="imie"></jsp:getProperty> </p>
<p>Nazwisko:  <jsp:getProperty name="uczen" property="nazwisko"></jsp:getProperty> </p>
<p>Pesel: <jsp:getProperty name="uczen" property="pesel"></jsp:getProperty></p>
<p>
  <a href="showAllUczen.jsp">Show all persons</a>
</p>
</body>
</html>