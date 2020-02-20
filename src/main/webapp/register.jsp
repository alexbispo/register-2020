<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html-1.0.2" prefix="form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="register.do">
		UserName:<form:text property="username" /><br/>
		enter password:<form:password property="password1" /><br/>
		re-enter password:<form:password property="password2" /><br/>
		<form:submit value="Register"/>
	</form:form>
</body>
</html>