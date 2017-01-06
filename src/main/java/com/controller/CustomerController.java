package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.po.Customer;
import com.po.Film;
import com.service.CustomerService;
import com.service.FilmService;



@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService; 
	@Autowired
	private FilmService filmService;
	
	@RequestMapping("/customerLogin")
	private ModelAndView customerLogin(String first_name, HttpServletRequest request) {
		System.out.println("userLogin====name==="+first_name);
		// 根据用户传入的用户名，去数据库查找到数据，不为空，且相等时，跳转到list.html
		String path = null;
		if (first_name != null && first_name != "") {
			List<Customer> list = customerService.findUserByName(first_name);
			if (!list.isEmpty() && list.size() > 0) {
				for (Customer user : list) {
					if (user.getFirst_name().equals(first_name)) {
						request.getSession().setAttribute("first_name", first_name);
						path = "/customer/list.html";
					}else{
						System.out.println("用户名错误");
						path = "/erro.html";
					}
				}
			} else {
				System.out.println("用户名错误");
				path = "/erro.html";
			}
		}else{
			System.out.println("用户名错误");
			path = "/erro.html";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(path);
		return modelAndView;
	}
	
	

}
