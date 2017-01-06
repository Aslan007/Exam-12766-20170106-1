package com.service;

import java.util.List;

import com.po.Film;

public interface FilmService {
public List<Film> findAll();
	
	public List<Film> findFilmByTitle(String title);
	
	public void deleteFilmById(Integer filmId);
	
	public void addFilm(Film film); 
	
	public void updateFilm(Film film);
	
	public Film findFilmById(Integer film_Id);
	
	
}
