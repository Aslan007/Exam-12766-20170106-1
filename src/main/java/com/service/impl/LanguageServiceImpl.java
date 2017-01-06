package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.LanguageMapper;
import com.po.Language;
import com.service.LanguageService;

public class LanguageServiceImpl implements LanguageService{

	@Autowired
	private LanguageMapper languageMapper;
	
	@Override
	public List<Language> findLanguageAll() {
		List<Language> list =languageMapper.findLanguageAll();
		return list;
	}

}
