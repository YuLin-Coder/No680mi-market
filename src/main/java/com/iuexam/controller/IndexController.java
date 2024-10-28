package com.iuexam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iuexam.tools.Constants;

@Controller
public class IndexController {

	@RequestMapping({"/index",""})
	public String index(ModelMap model,HttpServletRequest request) {
		Object ms = request.getSession().getAttribute(Constants.Manager_SESSION);
		if(null!=ms) {
			return "redirect:/manager/flatform/main";
		}
		Object ss = request.getSession().getAttribute(Constants.Staff_SESSION);
		if(null!=ss) {
			return "redirect:/staff/flatform/main";
		}
		return "redirect:/to_login";
	}
}
