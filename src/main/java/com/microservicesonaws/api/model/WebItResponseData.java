package com.microservicesonaws.api.model;

import java.util.List;

public class WebItResponseData {

	private List<Article> results;
	private String language;
	private String number;
	private int offset;
	
	
	public List<Article> getResults() {
		return results;
	}
	public void setResults(List<Article> results) {
		this.results = results;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
	
}
