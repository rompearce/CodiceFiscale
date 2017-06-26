<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserimento Dati</title>
</head>
<body>
<form action="ServletDati" method="post">
  Inserire Nome :<br>
  <input type="text" name="nome"><br>
  Inserire Cognome:<br>
  <input type="text" name="cognome" ><br>
  Inserire Data di nascita es:(29/10/1989):<br>
  <input type="text" name="dataNascita" ><br>
  Indicare il sesso:<br>
  <input type="radio" name="sesso" value="0" > Maschile<br>
  <input type="radio" name="sesso" value="1"> Femminile<br>
  Inserire il comune di nascita:<br>
  <input type="text" name="comuneNascita" ><br> 
  <br>
  <br>
  <input type="submit" value="Genera Codice Fiscale">
</form>
</body>
</html>