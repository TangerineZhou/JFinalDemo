<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册</h2>
	<form class="form-horizontal" action="/user/good" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">帐号:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="user.name" placeholder="请输入您的帐号">
    </div><font color="red" ><b>${pwMsg}</b></font>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="user.password" placeholder="请输入您的密码">
    </div><font color="red" ><b>${nameMsg}</b></font>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> 记住我的选择
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">注册</button>
    </div>
  </div>
</form>
</body>
</html>