<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*,javaconnectivity.jsp.*" %>

<%
	// just create some sample data ... normally provided by MVC
	List<StudentData> data = new ArrayList<>();

	data.add(new StudentData("John", "Doe", false));
	data.add(new StudentData("Maxwell", "Johnson", false));
	data.add(new StudentData("Mary", "Public", true));

	pageContext.setAttribute("myStudents", data);
%>

<html>

<body>
	<table border="1">

	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gold Customer</th>
	</tr>
	
	<c:forEach var="tempStudent" items="${myStudents}">
		
		<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>
		<%// in this program we use "if" conditional statment which is related to normal if program concept %>
			<c:if test="${tempStudent.goldCustomer}"> Special Descount </c:if>
			<c:if test="${not tempStudent.goldCustomer}"> --</c:if>
			</td> 
		</tr>
		
	</c:forEach>

	</table>

</body>

</html>











