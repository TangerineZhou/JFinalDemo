package com.demo.controller;

import java.util.List;

import com.demo.model.User;
import com.demo.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

public class UserController extends Controller{
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
		public void register() {
			render("register.jsp");
		}
		
		//ע��ɹ�
		public void good() {
			User user = getModel(User.class);
			System.out.println(getPara("user.name"));
			user.save();
//			renderJson(user);
			render("good.jsp");
		}
		
		//�û�����
		public void from() {
			render("from.html	");
		}
}
