package com.po;

import java.util.Date;

public class Film {
    private Integer film_id;

    private String title;

    private Date release_year;

    private Integer language_id;

    private Integer original_language_id;

    private Integer rental_duration;

    private Integer rental_rate;

    private Integer length;

    private Integer replacement_cost;

    private String rating;

    private String special_features;

    private Date last_update;

    private String description;
    
    private String language;

	public Integer getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}

	public Integer getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}

	public Integer getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
	}

	public Integer getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
	}

	public Integer getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(Integer rental_rate) {
		this.rental_rate = rental_rate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(Integer replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", release_year=" + release_year + ", language_id="
				+ language_id + ", original_language_id=" + original_language_id + ", rental_duration="
				+ rental_duration + ", rental_rate=" + rental_rate + ", length=" + length + ", replacement_cost="
				+ replacement_cost + ", rating=" + rating + ", special_features=" + special_features + ", last_update="
				+ last_update + ", description=" + description + ", language=" + language + "]";
	}
}