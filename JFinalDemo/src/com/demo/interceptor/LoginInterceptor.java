package com.demo.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class LoginInterceptor implements Interceptor{

	@Override
	public void intercept(Invocation inv) {
		System.out.println("Before method invoking");
		inv.invoke();
		System.out.println("After method invoking");
	}
}
