<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="request"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Komunikat - Edycja ucznia</title>
</head>
<body>
   ${storage.edytujUczen(uczen)}
            
            <h1>Uczeń został zaktualizowany.</h1>
<form  action='showAllUczen.jsp'>
<input type='submit' value='Zobacz wszystkich ucznów'>
</form>
</body>
</html>