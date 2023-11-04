<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String favLang = "Java";

	// get the cookies from the browser request
	Cookie[] theCookies = request.getCookies();
	
	// find our favorite language cookie
	if (theCookies != null) {
		
		for (Cookie tempCookie : theCookies) {
			
			if ("myApp.favoriteLanguage".equals(tempCookie.getName())) {
				favLang = tempCookie.getValue();
			 
				break;
			}
		}
	}
	%>
	<h4>New Books :--  <%= favLang %></h4>
	
<h1 align="center"> Our First Cookie Program which is related connect with html and jsp pages</h1>
<l1> Programs</l1>
<ol>First</ol>
<ol>Second</ol>
<ol>Third</ol>
<ol>Fourth</ol>
<l1>Language</l1>
<ol>Java</ol>
<ol>C</ol>
<ol>C#</ol>
<ol>C++</ol>
<ol>Python</ol>

</body>
</html>