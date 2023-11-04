<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%// just replace the jsp into jstl tags which is present in the java 8 features %>
<!DOCTYPE html>
<html>
<head>

<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>
<div id="wrapper">
<div id="header">
<h2>FooBar University</h2>

</div>
</div>
<div id="container">
<div id="content">
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<% // for(Student tempStudent : theStudents){//remove from jstl tag:- %>

<c:forEach var="tempStudent" item="${STUDENT_LIST}">
<tr>
<td> ${tempStudent.firstName }</td>
<td>${tempStudent.lastName }</td>
<td>${tempStudent.email }</td>
</tr>
</c:forEach>


</table>
</div>
</div>

</body>
</html>