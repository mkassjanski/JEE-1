<%@page import="kass.domain.Przedmiot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="przedmiotTEMP" class="kass.domain.Przedmiot" scope="session" />
<jsp:useBean id="przedmiot" class="kass.domain.Przedmiot" scope="session" />
<jsp:setProperty name="przedmiotTEMP" property="id" />
<%

    for (Przedmiot przedmiotTEM : storage.getAllPrzedmiot()) {
        if(przedmiotTEM.getId() == przedmiotTEMP.getId()) {
        	przedmiot.setId(przedmiotTEM.getId());
        	przedmiot.setNazwa(przedmiotTEM.getNazwa());
        	przedmiot.setTyp(przedmiotTEM.getTyp());
        	przedmiot.setGodz(przedmiotTEM.getGodz());
            break;
        }
    }
%>

<form action="EndEdytujPrzedmiot.jsp" method='post'>
    <p>
        <label>Nazwa: &nbsp;</label><input type="text" name="nazwa" value='<jsp:getProperty name="przedmiot" property="nazwa"></jsp:getProperty>' /><br />
        <label>Typ: </label><br />
 <%
    if(przedmiot.getTyp().equals("Obowiazkowy")){
%>
        <input type="radio" name="typ" value="Obowiazkowy" checked> Obowiazkowy  <br />
        <input type="radio" name="typ" value="Dodatkowy"> Dodatkowy <br />
        
<%
    } else {
%> 	
		<input type="radio" name="typ" value="Obowiazkowy"> Obowiazkowy  <br />
		<input type="radio" name="typ" value="Dodatkowy" checked> Dodatkowy <br />

<%
   }
%>
        <label>Liczba godzin: &nbsp;</label><input type="text" name="godz" value='<jsp:getProperty name="przedmiot" property="godz"></jsp:getProperty>'  /><br />
    </p>
    <p><input type="submit" value=" OK "></p>
    <p class="ukryty"><input type="text" name="id" value='<jsp:getProperty name="przedmiot" property="id"></jsp:getProperty>' /></p>
</form>
<form  action='showAllPrzedmiot.jsp'>
<input type='submit' value='Anuluj'>
</form>
</body>
</html>