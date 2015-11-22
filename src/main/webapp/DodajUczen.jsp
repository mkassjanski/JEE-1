<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj ucznia</title>
</head>
<body>
<jsp:include page="include/header.jsp" />
    <h1>Dodaj uczen</h1>

    <form action="walidacjaUczen">

      <p>
          <label>Imie: &nbsp;</label><input type="text" name="imie" value="" /><br />
          <label>Nazwisko: &nbsp;</label><input type="text" name="nazwisko" value="" /><br />
          <label>Plec: &nbsp;</label> <br />
          <input type="radio" name="plec" value="Chlopak" />Chlopak <br />
          <input type="radio" name="plec" value="Dziewczyna" />Dziewczyna <br />
          <label>Pesel: &nbsp;</label><input type="text" name="pesel" value="" /><br />
      </p>
      <p class="przycisk"><input type="submit" value=" OK "></p>

    </form>
</body>
</html>