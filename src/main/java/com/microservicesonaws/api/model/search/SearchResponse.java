package com.microservicesonaws.api.model.search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SearchResponse {

	private List<SearchResponseArticle> docs;
	@JsonIgnore
	private Object meta;

	public List<SearchResponseArticle> getDocs() {
		return docs;
	}
	public void setDocs(List<SearchResponseArticle> docs) {
		this.docs = docs;
	}
	public Object getMeta() {
		return meta;
	}
	public void setMeta(Object meta) {
		this.meta = meta;
	}
	
}
