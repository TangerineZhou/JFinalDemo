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

	// ���ó���
	@Override
	public void configConstant(Constants me) {
		// ��һ��ʹ��use���ص����ý���Ϊ�����ã�����ͨ��PropKit.get(...)ֱ��ȡֵ
		PropKit.use("db.properties");
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	// ����·��
	@Override
	public void configRoute(Routes me) {
		me.add("/", HelloController.class);
	}

	//��������
	@Override
	public void configEngine(Engine me) {

	}

	//���ò��
	@Override
	public void configPlugin(Plugins me) {
		loadPropertyFile("db.properties");
		C3p0Plugin c3p0 = new C3p0Plugin(getProperty("jdbcUrl"), 
				getProperty("user"), getProperty("password"));
		me.add(c3p0);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0);
		me.add(arp);
		//user��model�����user���ӳ�䣬Ĭ������Ϊid
		arp.addMapping("user", User.class);
		//������Ϊid��������
		//arp.addMapping("user","user_id", User.class);
	}

	//����������
	@Override
	public void configInterceptor(Interceptors me) {

	}

	//���ô�����
	@Override
	public void configHandler(Handlers me) {

	}

	//������
	public static void main(String[] args) {
		JFinal.start("WebContent", 80, "/", 5);
	}
}
