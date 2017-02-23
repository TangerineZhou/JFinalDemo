<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<title>用户表单</title>
</head>
<body>

	<table class="table table-hover table-bordered">
		<tr>
			<th>ID</th>
			<th>用户</th>
			<th>年龄</th>
			<th>性别</th>
			<th>职业</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td >${user.id}</td>
				<td>${user.name}</td>
				<td>${user.name}</td>
				<td>${user.name}</td>
				<td>${user.name}</td>
				<td>${user.name}</td>
				<td>
				<button type="button" class="btn btn-default" onclick="window.location.href='login'">编辑</button>
				<button type="button" class="btn btn-default" onclick="window.location.href='login'">删除</button>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>