<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
<jsp:useBean id="authentification" class="Beans.authentificationBean" scope="session"></jsp:useBean>

</title>
</head>
<body>
<% if (request.getParameter("prenom").equals("") & request.getParameter("nom").equals("") ){ %>
Le prenom:<jsp:getProperty property="prenom" name="authentification"/>
<br>
Le Nom : <jsp:getProperty property="nom" name="authentification"/>
<% } else { %>
votre prenom est :<%= request.getParameter("prenom") %><br>
votre nom est :<%= request.getParameter("nom") %>
<%} %>
</body>
</html>