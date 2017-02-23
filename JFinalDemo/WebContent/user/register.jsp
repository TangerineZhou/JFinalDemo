<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册</h2>
	<form action="/user/good" method="post">
	帐号:<input type="text" name="user.name"><font color="red" ><b>${nameMsg}</b></font></br>
	密码:<input type="password" name="user.password"><font color="red" ><b>${pwMsg}</b></font></br>
	<input type="submit" value="注册"></br>
	</form>	
</body>
</html>