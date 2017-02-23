package com.demo.controller;

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
