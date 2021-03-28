package com.microservicesonaws.api.model;

import java.util.List;

public class Article {

	private String Heading;
	private String ByLine;
	private String Content;
	
	private String id;
	private String url;
	private List<String> keywords;
	private String title;
	private String description;
	private String author;
	private String date;
	private String source_name;
	private String image;
	
	
	public String getHeading() {
		return Heading;
	}
	public void setHeading(String heading) {
		Heading = heading;
	}
	public String getByLine() {
		return ByLine;
	}
	public void setByLine(String byLine) {
		ByLine = byLine;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
