package com.demo.controller;


import com.demo.model.User;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;


public class IndexController extends Controller{
	//默认主页
	public void index() {
//		render("index.jsp");
		renderFreeMarker("index.html");
	}
	
	@ActionKey("/haha")
	public void hello() {
		setAttr("name", "xiaoming");
		setAttr("age", 18);
		setAttr("email", "163");
		renderJson();
	}
	
	public void hehe() {
		User u = new User();
		u.set("name", "xiaoming");
		u.set("age", 18);
		renderJson(u);
	}
	
//	public void save() {
//		// 页面的modelName正好是Blog类名的首字母小写
//		User user = getModel(User.class);
//		// 如果表单域的名称为 "otherName.title"可加上一个参数来获取
//		//blog = getModel(Blog.class, "otherName");
//		}
}
