package com.demo.controller;

import java.util.List;

import javax.management.modelmbean.ModelMBean;

import com.demo.model.User;
import com.demo.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller{
	//Ĭ����ҳ
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
//		// ҳ���modelName������Blog����������ĸСд
//		User user = getModel(User.class);
//		// ������������Ϊ "otherName.title"�ɼ���һ����������ȡ
//		//blog = getModel(Blog.class, "otherName");
//		}
}
