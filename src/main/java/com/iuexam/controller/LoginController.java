package com.iuexam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iuexam.tools.Constants;

@Controller
public class LoginController {

	@RequestMapping("/to_login")
	public String toLogin(ModelMap model,HttpServletRequest request) {
		return "/login";
	}
	@RequestMapping("/logout")
	public String logout(ModelMap model,HttpServletRequest request) {
		request.getSession().removeAttribute(Constants.Manager_SESSION);
		request.getSession().removeAttribute(Constants.Staff_SESSION);
		return "/login";
	}
}
