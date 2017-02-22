package com.demo.common;

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
	
	//��¼ҳ��
	public void login() {
		render("login.jsp");
	}
	
	//��¼�ɹ�
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
	
	//�û���ѯ
	public void search() {
		List<User> userList = User.dao.find("select * from user");
		render("search.html");
	}
	
	//�û�ע��
	@Before(LoginValidator.class)
	public void register() {
		render("register.jsp");
	}
	
	//ע��ɹ�
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
//		// ҳ���modelName������Blog����������ĸСд
//		User user = getModel(User.class);
//		// ������������Ϊ "otherName.title"�ɼ���һ����������ȡ
//		//blog = getModel(Blog.class, "otherName");
//		}
}
