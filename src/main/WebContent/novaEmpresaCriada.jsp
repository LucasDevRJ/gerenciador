<% 
	//scriplet - pedaço de código Java
	String nomeEmpresa = request.getAttribute("empresa"); //pegando o atributo pelo apelido
	System.out.println(nomeEmpresa);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		Empresa <%=nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>