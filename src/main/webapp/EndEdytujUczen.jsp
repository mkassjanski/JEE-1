<%@page import="kass.domain.Uczen"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:useBean id="uczen" class="kass.domain.Uczen" scope="session" />
<jsp:useBean id="uczenTEMP" class="kass.domain.Uczen" scope="session" />
<jsp:setProperty name="uczen" property="*" />
<jsp:useBean id="storage" class="kass.service.StorageService" scope="application" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
                    for (Uczen uczenTEM : storage.getAllUczen()) {
                        if (uczenTEM.getId() == uczen.getId()) {
                        	uczen.setId(uczenTEM.getId());
                            break;
                        }
                    }
 					Uczen nowy = new Uczen(uczen.getImie(), uczen.getNazwisko(), uczen.getPlec() ,uczen.getPesel());
 					storage.edytujUczen(uczen, nowy);
            %>
            <p>Wprowadziłeś dane!!!</p>
</body>
</html>