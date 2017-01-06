package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.FilmMapper;
import com.po.Film;
import com.service.FilmService;

public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public List<Film> findAll() {
		List<Film> list = filmMapper.findAll();
		return list;
	}

	@Override
	public List<Film> findFilmByTitle(String title) {
		List<Film> list = filmMapper.findFilmByTitle(title);
		return list;
	}

	@Override
	public void deleteFilmById(Integer filmId) {
		filmMapper.deleteFilmById(filmId);
		
	}

	@Override
	public void addFilm(Film film) {
		filmMapper.addFilm(film);
		
	}

	@Override
	public void updateFilm(Film film) {
		filmMapper.updateFilm(film);
	}

	@Override
	public Film findFilmById(Integer film_Id) {
		
	Film film =	filmMapper.findFilmById(film_Id);
		return film;
	}

}
