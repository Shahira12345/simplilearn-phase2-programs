<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="simplilearnjsp.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="simplilearnjsp.Employee"></jsp:useBean>
<jsp:setProperty property="empno" name="emp" value="572"/>
<jsp:setProperty property="empname" name="emp" value="shahira"/>
<jsp:getProperty property="empno" name="emp"/>
<jsp:getProperty property="empname" name="emp"/>
</body>
</html>