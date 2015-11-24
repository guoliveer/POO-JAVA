<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String numErro = "";
	String numErro1 = "";
	String numero = "0";
	String numero1 = "0";
	
	Object numErroObj = request.getAttribute("numeroErro");
	Object numErroObj1 = request.getAttribute("numeroErro1");

	if (numErroObj != null){
		numErro = numErroObj.toString();		
	}
	if (numErroObj1 != null){
		numErro1 = numErroObj1.toString();		
	}
	
	String num = request.getParameter("numero");
	if (num != null){
		numero = num;
	}
	String num1 = request.getParameter("numero1");
	if (num1 != null){
		numero1 = num1;
	}
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Última Entrega</title>
</head>
<body>

<form method="get" action="calcular">
	<p>Última Entrega de POO - Gustavo Henrique de Oliveira</p>
	<p>Formulário de Soma dos Números:</p>
	
	<input type='text' name='numero' value='<%= numero %>' />
	<%= numErro %>
	<p> </p>
	<input type='text' name='numero1' value='<%= numero1 %>' />
	<%= numErro1 %>
	<p><button type='submit'>Enviar</button></p>

</form>

</body>
</html>