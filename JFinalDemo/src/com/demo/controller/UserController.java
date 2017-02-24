package com.demo.controller;

import java.util.List;

import com.demo.model.User;
import com.demo.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.render.excel.PoiRender;
import com.jfinal.render.RenderException;

public class UserController extends Controller{
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
		
		//用户注册
		public void register() {
			render("register.jsp");
		}
		
		//注册成功
		public void good() {
			User user = getModel(User.class);
			System.out.println(getPara("user.name"));
			user.save();
//			renderJson(user);
			render("good.jsp");
		}
		
		//用户名单
		public void list() {
			List<User> userList = User.dao.find("select * from user");
			setAttr("userList", userList);
//			render("from.html");
			render("list.jsp");
		}
		
		//用户添加修改
		public void from() {
			
		}
		
		//导出excel
		public void excel() {
			String sql = "select * from user";
		}
}
