package com.demo.common;

import java.util.List;

import javax.management.modelmbean.ModelMBean;

import com.demo.model.User;
import com.demo.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller{
	//默认主页
	public void index() {
		render("index.jsp");
	}
	
	//登录页面
	public void login() {
		render("login.jsp");
	}
	
	//登录成功
	@Before(LoginValidator.class)
	public void success() {
		User user = getModel(User.class);
		String name = user.getStr("name");
		String password = user.getStr("password");
		if(name.equals("admin") & password.equals("123")) {
			render("success.jsp");
		}else{
			render("index.jsp");
		}
	}
	
	//用户查询
	public void search() {
		List<User> userList = User.dao.find("select * from user");
		render("search.html");
	}
	
	//用户注册
	@Before(LoginValidator.class)
	public void register() {
		render("register.jsp");
	}
	
	//注册成功
	public void good() {
		User user = getModel(User.class);
		System.out.println(getPara("user.name"));
		user.save();
//		renderJson(user);
		render("good.jsp");
	}
	
	@ActionKey("/haha")
	public void hello() {
		render("index.html");
	}
	
	public void hehe() {
		renderText("This is my text!");
	}
	
//	public void save() {
//		// 页面的modelName正好是Blog类名的首字母小写
//		User user = getModel(User.class);
//		// 如果表单域的名称为 "otherName.title"可加上一个参数来获取
//		//blog = getModel(Blog.class, "otherName");
//		}
}
