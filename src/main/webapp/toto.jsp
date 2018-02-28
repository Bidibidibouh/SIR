<html>
<head><title>First JSP</title></head>
<body>
	Nom : <%= request.getAttribute("nom") %> </br>
	Prenom : <%= request.getAttribute("prenom") %></br>
	Mail : <%= request.getAttribute("mail") %>
</body>
</html>