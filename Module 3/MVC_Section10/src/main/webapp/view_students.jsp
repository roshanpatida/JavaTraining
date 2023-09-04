<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2> Students Table Demo</h2>
<hr>
<br/>
<table border="1">

<tr>
<th>Frist Name</th>
<th>Last Name</th>
<th>Email Name</th>


</tr>



	<c:forEach var="tempStudent" items="${student_list}">
	<tr>
		<td>${tempStudent.fristName}</td>
		<td>${tempStudent.lastName}</td>
		<td>${tempStudent.eamil}</td>
		 
	</tr>
	</c:forEach>
	</table>

</body>
</html>