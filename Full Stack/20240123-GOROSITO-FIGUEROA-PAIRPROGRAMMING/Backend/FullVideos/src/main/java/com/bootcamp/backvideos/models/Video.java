package com.bootcamp.backvideos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="videos")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	private String description;
	private String url;
	private String category;
	private Integer views;
	private Integer likes;
	private Integer dislikes;
	private Double rating;
	
	public Video() {
	}
	

	public Video(int id, String title, String description, String url, String category, Integer views, Integer likes,
			Integer dislikes, Double rating) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
		this.category = category;
		this.views = views;
		this.likes = likes;
		this.dislikes = dislikes;
		this.rating = rating;
	}
	
	public Integer getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getDescription() {
		return description;
	}


	public String getUrl() {
		return url;
	}


	public String getCategory() {
		return category;
	}


	public Integer getViews() {
		return views;
	}


	public Integer getLikes() {
		return likes;
	}


	public Integer getDislikes() {
		return dislikes;
	}


	public Double getRating() {
		return rating;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setViews(Integer views) {
		this.views = views;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}

	
	
	
	
}
