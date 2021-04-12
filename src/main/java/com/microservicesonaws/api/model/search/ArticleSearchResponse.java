package com.microservicesonaws.api.model.search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleSearchResponse {
	
	private String status;
	private String copyright;
	@JsonProperty("response")
	private SearchResponse searchResponse;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public SearchResponse getSearchResponse() {
		return searchResponse;
	}
	public void setSearchResponse(SearchResponse searchResponse) {
		this.searchResponse = searchResponse;
	}

}
