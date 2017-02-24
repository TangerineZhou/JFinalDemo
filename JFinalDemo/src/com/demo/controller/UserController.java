package com.demo.controller;

import java.util.List;

import com.demo.model.User;
import com.demo.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.render.excel.PoiRender;
import com.jfinal.render.RenderException;

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
		public void list() {
			List<User> userList = User.dao.find("select * from user");
			setAttr("userList", userList);
//			render("from.html");
			render("list.jsp");
		}
		
		//�û�����޸�
		public void from() {
			
		}
		
		//����excel
		public void excel() {
			String sql = "select * from user";
		}
}
