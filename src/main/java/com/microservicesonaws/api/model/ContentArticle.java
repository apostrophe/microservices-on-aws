package com.microservicesonaws.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// there's an issue reading this element
@JsonIgnoreProperties({"related_urls"}) 
public class ContentArticle {

	private String slug_name;
	private String section;
	private String subsection;
	private String title;
	@JsonProperty("abstract")
	private String abstract_;
	private String url;
	private String byline;
	private String thumbnail_standard;
	private String item_type;
	private String source;
	private String updated_date;
	private String created_date;
	private String published_date;
	private String first_published_date;
	private String material_type_facet;
	private String kicker;
	private String subheadline;
	private List<String> des_facet;
    private List<String> org_facet;
    private List<String> per_facet;
    private List<String> geo_facet;
	private List<String> related_urls;
	private List<ContentArticleMultiMedia> multimedia;
	
	public String getSlug_name() {
		return slug_name;
	}
	public void setSlug_name(String slug_name) {
		this.slug_name = slug_name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSubsection() {
		return subsection;
	}
	public void setSubsection(String subsection) {
		this.subsection = subsection;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbstract_() {
		return abstract_;
	}
	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getByline() {
		return byline;
	}
	public void setByline(String byline) {
		this.byline = byline;
	}
	public String getThumbnail_standard() {
		return thumbnail_standard;
	}
	public void setThumbnail_standard(String thumbnail_standard) {
		this.thumbnail_standard = thumbnail_standard;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	public String getFirst_published_date() {
		return first_published_date;
	}
	public void setFirst_published_date(String first_published_date) {
		this.first_published_date = first_published_date;
	}
	public String getMaterial_type_facet() {
		return material_type_facet;
	}
	public void setMaterial_type_facet(String material_type_facet) {
		this.material_type_facet = material_type_facet;
	}
	public String getKicker() {
		return kicker;
	}
	public void setKicker(String kicker) {
		this.kicker = kicker;
	}
	public String getSubheadline() {
		return subheadline;
	}
	public void setSubheadline(String subheadline) {
		this.subheadline = subheadline;
	}
	public List<String> getDes_facet() {
		return des_facet;
	}
	public void setDes_facet(List<String> des_facet) {
		this.des_facet = des_facet;
	}
	public List<String> getOrg_facet() {
		return org_facet;
	}
	public void setOrg_facet(List<String> org_facet) {
		this.org_facet = org_facet;
	}
	public List<String> getPer_facet() {
		return per_facet;
	}
	public void setPer_facet(List<String> per_facet) {
		this.per_facet = per_facet;
	}
	public List<String> getGeo_facet() {
		return geo_facet;
	}
	public void setGeo_facet(List<String> geo_facet) {
		this.geo_facet = geo_facet;
	}
	public List<String> getRelated_urls() {
		return related_urls;
	}
	public void setRelated_urls(List<String> related_urls) {
		this.related_urls = related_urls;
	}
	public List<ContentArticleMultiMedia> getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(List<ContentArticleMultiMedia> multimedia) {
		this.multimedia = multimedia;
	}
	
 }
