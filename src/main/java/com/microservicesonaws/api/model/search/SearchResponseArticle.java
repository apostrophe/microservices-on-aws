package com.microservicesonaws.api.model.search;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponseArticle {
	
	@JsonProperty("abstract")
	private String abstract_;
	private String web_url;
	private String snippet;
	private String lead_paragraph;
	@JsonIgnore
	private String print_section;
	@JsonIgnore
	private String print_page;
	private String source;
	@JsonIgnore
	private Object multimedia;
	@JsonIgnore
	private Object headline;
	@JsonIgnore
	private Object keywords;
	private Date pub_date;
	private String document_type;
	private String news_desk;
	private String section_name;
	private String subsection_name;
	@JsonIgnore
	private Object byline;
	private String type_of_material;
	private String _id;
	private int word_count;
	private String uri;
	public String getAbstract_() {
		return abstract_;
	}
	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public String getLead_paragraph() {
		return lead_paragraph;
	}
	public void setLead_paragraph(String lead_paragraph) {
		this.lead_paragraph = lead_paragraph;
	}
	public String getPrint_section() {
		return print_section;
	}
	public void setPrint_section(String print_section) {
		this.print_section = print_section;
	}
	public String getPrint_page() {
		return print_page;
	}
	public void setPrint_page(String print_page) {
		this.print_page = print_page;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Object getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(Object multimedia) {
		this.multimedia = multimedia;
	}
	public Object getHeadline() {
		return headline;
	}
	public void setHeadline(Object headline) {
		this.headline = headline;
	}
	public Object getKeywords() {
		return keywords;
	}
	public void setKeywords(Object keywords) {
		this.keywords = keywords;
	}
	public Date getPub_date() {
		return pub_date;
	}
	public void setPub_date(Date pub_date) {
		this.pub_date = pub_date;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	public String getNews_desk() {
		return news_desk;
	}
	public void setNews_desk(String news_desk) {
		this.news_desk = news_desk;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSubsection_name() {
		return subsection_name;
	}
	public void setSubsection_name(String subsection_name) {
		this.subsection_name = subsection_name;
	}
	public Object getByline() {
		return byline;
	}
	public void setByline(Object byline) {
		this.byline = byline;
	}
	public String getType_of_material() {
		return type_of_material;
	}
	public void setType_of_material(String type_of_material) {
		this.type_of_material = type_of_material;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public int getWord_count() {
		return word_count;
	}
	public void setWord_count(int word_count) {
		this.word_count = word_count;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}


/*
private SearchResultMultiMedia multimedia;
private SearchResultHeadline searchResultHeadline;
private SearchResultKeywords searchResultKeywords;
private ByLine byline;


*/