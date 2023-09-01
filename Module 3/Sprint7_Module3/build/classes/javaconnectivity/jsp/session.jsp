<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import = "java.util.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="session.jsp">
		Add new Item:<Input type="text" name="theItem"/>
		<input type="submit" value="GO"/>
	</form>
	<%//oofejjjfjefje %>
	<%
		List<String> items=(List<String>) session.getAttribute("myToDoList");//if setAttribute is not executed then default value is NULL and first set attribute is executed.
		if(items==null){
			items=new ArrayList<String>();
			session.setAttribute("myToDoList",items);
		}
		String theItem=request.getParameter("theItem");
		if(theItem!=null){
			items.add(theItem);
		}	
	%>
<% //joofjdojfjfjldfldf %>
<hr>
<b>To List Items:</b> <br/>

<ol>
<%
	for (String temp : items) {
		out.println("<li>" + temp + "</li>");
	}
%>
</ol>


</body>
</html>