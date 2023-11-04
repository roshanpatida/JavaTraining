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
String favLang=request.getParameter("FavoriteLanguage");
// favLang = URLEncoder.encode(favLang, "UTF-8");//  it is use to handle white spaces 
Cookie theCookie =new Cookie("myCookie",favLang);
theCookie.setMaxAge(60*60*24*365);
response.addCookie(theCookie);
%>
Thanks! We set your favorite language to: ${param.FavoriteLanguage}   <br><br>
<a href="CookieHome.jsp">Return to Home Page</a>
</body>
</html>