<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style rel="stylesheet" type="text/css">
        .ukryty     {visibility: hidden; width: 1px;  height: 1px; font-size: 1px; margin: 0px ; padding: 0px}
    </style>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />
<jsp:useBean id="uczenTEMP" class="kass.domain.Uczen" scope="session" />
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczenTEMP" property="id" />
<%

    for (Uczen uczenTEM : storage.getAllUczen()) {
        if(uczenTEM.getId() == uczenTEMP.getId()) {
        	uczen.setId(uczenTEM.getId());
        	uczen.setImie(uczenTEM.getImie());
        	uczen.setNazwisko(uczenTEM.getNazwisko());
        	uczen.setPlec(uczenTEM.getPlec());
        	uczen.setPesel(uczenTEM.getPesel());
            break;
        }
    }
%>

<form action="EndEdytujUczen.jsp">
    <p>
        <label>Imie: &nbsp;</label><input type="text" name="imie" value='<jsp:getProperty name="uczen" property="imie"></jsp:getProperty>' /><br />
        <label>Nazwisko: </label><input type="text" name="nazwisko" value='<jsp:getProperty name="uczen" property="nazwisko"></jsp:getProperty>'  /><br />
        <label>Plec: </label><br />
 <%
    if(uczen.getPlec().equals("Chlopiec")){
%>
        <input type="radio" name="plec" value="Chlopiec" checked> Chlopiec  <br />
        <input type="radio" name="plec" value="Dziewczyna"> Dziewczyna <br />
        
<%
    } else {
%> 	
		<input type="radio" name="plec" value="Chlopiec"> Chlopiec  <br />
		<input type="radio" name="plec" value="Dziewczyna" checked> Dziewczyna <br />

<%
   }
%>
        <label>Pesel: &nbsp;</label><input type="text" name="pesel" value='<jsp:getProperty name="uczen" property="pesel"></jsp:getProperty>'  /><br />
    </p>
    <p><input type="submit" value=" OK "></p>
    <p class="ukryty"><input type="text" name="id" value='<jsp:getProperty name="uczen" property="id"></jsp:getProperty>' /></p>
</form>
</body>
</html>