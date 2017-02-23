package com.demo.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

//µ«¬º–£—È
public class LoginValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		validateRequiredString("user.name", "nameMsg", "«Î ‰»Î’ ∫≈!");
		validateRequiredString("user.password", "pwMsg", "«Î ‰»Î√‹¬Î");
	}

	@Override
	protected void handleError(Controller c) {
		c.render("login.jsp");
	}

}
