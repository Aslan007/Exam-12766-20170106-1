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
import com.po.Film;
import com.service.FilmService;


@Controller
public class FilmController {
	@Autowired
	private FilmService filmService;
	
	
	@ResponseBody
	@RequestMapping("/toList")
	public Map toList(HttpServletRequest httpServletRequest) {
		// 调用UserService查询所有用户
		System.out.println("tolist======");
		PageHelper pageHelper = null;
		String page = httpServletRequest.getParameter("page");
		String pageSize1 = httpServletRequest.getParameter("pageSize");
		int size = Integer.parseInt(pageSize1);
		int i = Integer.parseInt(page);
		
		int pageNum = i;
		int pageSize = size;
		// 配置了合理化，所以不用担心页数小于0或者大于最大值
		pageHelper.startPage(pageNum, pageSize, true, true);
		List<Film> filmList = filmService.findAll();
		// 取分页信息
		PageInfo<Film> pageInfo = new PageInfo<Film>(filmList);
		long total = pageInfo.getTotal(); // 获取总记录数
		double z = ((double) total / (double) pageSize);
		int pageSum = (int) Math.ceil(z);
		Map map = new HashMap();
		map.put("filmList", filmList);
		map.put("pageSum", pageSum);
		map.put("pageNum", pageNum);
		map.put("pageSize", pageSize);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("/delete")
	public Integer delete(HttpServletRequest httpServletRequest){
		String id = httpServletRequest.getParameter("id");
		int erro =0;
		int i = Integer.parseInt(id);
		try {
			filmService.deleteFilmById(i);
		} catch (Exception e) {
			erro =1;
			System.out.println("不能删除，有外键");
		}
		return erro;
	}
	
	@RequestMapping("/addFilm")
	public ModelAndView addFilm(HttpServletRequest httpServletRequest,String title,String description,Integer language_id){
		Film film = new Film();
		
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		filmService.addFilm(film);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/customer/list.html");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/toUpdate")
	public Map toUpdate(HttpServletRequest httpServletRequest) {
		System.out.println("toupdate======");
		String id = httpServletRequest.getParameter("id");
		int i = Integer.parseInt(id);
		
		Film film = filmService.findFilmById(i);

		Map map = new HashMap();
		map.put("film", film);
		return map;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest httpServletRequest,Integer film_id,String title,String description,Integer language_id){
		System.out.println("update=======");
		Film film = new Film();
		film.setFilm_id(film_id);
		film.setLanguage_id(language_id);
		film.setDescription(description);
		film.setTitle(title);
		filmService.updateFilm(film);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/customer/list.html");
		return modelAndView;
	}

}
