<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br> <br>Hai scelto l'operazione:${operazioneScelta}<br> <br>
<br> <br>inserisci i due numeri <br> <br>
<form action="eseguiOperazione" method="post">
		<input type="hidden" name="operazione" value="${operazioneScelta}">
		<input type="number" name="Primo numero">
		<input type="number" name="Secondo numero">
				<input type="submit" value="Esegui">
		
	</form>
</body>
</html>