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
				<c:choose>
				<% //it is related to switch tag and just
				// if we want to print so we put in the when tag 
				  // or we write in the otherwise tag %>
					<c:when test="${tempStudent.goldCustomer}">
						Special Discount
					</c:when>
					
					<c:otherwise>
					 net price!
					</c:otherwise>

				</c:choose>

				
			</td> 
		</tr>
		
	</c:forEach>

	</table>

</body>

</html>











