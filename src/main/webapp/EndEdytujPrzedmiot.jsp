<%@page import="kass.domain.Przedmiot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="przedmiot" class="kass.domain.Przedmiot" scope="session" />
<jsp:useBean id="przedmiotTEMP" class="kass.domain.Przedmiot" scope="session" />
<jsp:setProperty name="przedmiot" property="*" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
                    for (Przedmiot przedmiotTEM : storage.getAllPrzedmiot()) {
                        if (przedmiotTEM.getId() == przedmiot.getId()) {
                        	przedmiot.setId(przedmiotTEM.getId());
                            break;
                        }
                    }
 					Przedmiot nowy = new Przedmiot(przedmiot.getNazwa(), przedmiot.getTyp(), przedmiot.getGodz());
 					storage.edytujPrzedmiot(przedmiot, nowy);
            %>
            <h1>Przedmiot został zaktualizowany.</h1>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Zobacz wszystkie przedmioty'>
</form>
</body>
</html>