<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="client" class="Beans.ClientJavaBean" scope="session"></jsp:useBean>
</head>
<body>
Nom : <%= client.getNom() %>
<br>
prenom:<%=client.getPrenom() %>
<br>
adresse :<%= client.getAdresse() %>
<br>
Telephone :<%= client.getNum() %>
<br>
Email : <%=client.getEmail() %>
</body>
</html>