package com.demo.controller;


import com.demo.model.User;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;


public class IndexController extends Controller{
	//Ĭ����ҳ
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
//		// ҳ���modelName������Blog����������ĸСд
//		User user = getModel(User.class);
//		// ������������Ϊ "otherName.title"�ɼ���һ����������ȡ
//		//blog = getModel(Blog.class, "otherName");
//		}
}
