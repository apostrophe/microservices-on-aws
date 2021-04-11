package com.microservicesonaws.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Section {

	private String section;
	@JsonProperty("display_name")
	private String displayName;
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
