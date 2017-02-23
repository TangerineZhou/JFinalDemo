package com.demo.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

//��¼У��
public class LoginValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		validateRequiredString("user.name", "nameMsg", "�������ʺ�!");
		validateRequiredString("user.password", "pwMsg", "����������");
	}

	@Override
	protected void handleError(Controller c) {
		c.render("login.jsp");
	}

}
