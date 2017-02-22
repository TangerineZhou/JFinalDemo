package com.demo.common;

import com.demo.interceptor.LoginInterceptor;
import com.demo.model.User;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

public class ConfigDemo extends JFinalConfig {

	// 配置常量
	@Override
	public void configConstant(Constants me) {
		// 第一次使用use加载的配置将成为主配置，可以通过PropKit.get(...)直接取值
		PropKit.use("db.properties");
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	// 配置路由
	@Override
	public void configRoute(Routes me) {
		me.add("/", HelloController.class);
	}

	//配置引擎
	@Override
	public void configEngine(Engine me) {

	}

	//配置插件
	@Override
	public void configPlugin(Plugins me) {
		loadPropertyFile("db.properties");
		C3p0Plugin c3p0 = new C3p0Plugin(getProperty("jdbcUrl"), 
				getProperty("user"), getProperty("password"));
		me.add(c3p0);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0);
		me.add(arp);
		//user的model对象对user表的映射，默认主键为id
		arp.addMapping("user", User.class);
		//主键不为id设置如下
		//arp.addMapping("user","user_id", User.class);
	}

	//配置拦截器
	@Override
	public void configInterceptor(Interceptors me) {

	}

	//配置处理器
	@Override
	public void configHandler(Handlers me) {

	}

	//主方法
	public static void main(String[] args) {
		JFinal.start("WebContent", 80, "/", 5);
	}
}
