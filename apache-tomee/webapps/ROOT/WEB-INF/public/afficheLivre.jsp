<html>
<body>

<table>
	<tr>
		<th>Titre</th>
		<th>Auteur</th>
		<th>Annee</th>
	</tr>

<% for(Livre l : request.getAttribute("listeLivre")) { %>
	<tr>
		<td><%= l.getTitre() %></td>
		<td><%= l.getAuteur() %></td>
		<td><%= l.getAnnee() %></td>
	</tr>
<% } %>
</table>

</body>
</html>
