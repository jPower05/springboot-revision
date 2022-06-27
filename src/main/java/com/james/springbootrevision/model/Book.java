package com.james.springbootrevision.model;

public class Book {
	private Long id;
	private String title;
	private String summary;
	private String author;
	private String category;
	private double rating;
	
	public Book(Long id, String title, String summary, String author, String category, double rating) {
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.category = category;
		this.rating = rating;
	}
	
	public Book(String title, String summary, String author, String category, double rating) {
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.category = category;
		this.rating = rating;
	}
	
	public Book() {
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", summary=" + summary + ", author=" + author + ", category="
				+ category + ", rating=" + rating + "]";
	}

	

	
	
	
	
}
