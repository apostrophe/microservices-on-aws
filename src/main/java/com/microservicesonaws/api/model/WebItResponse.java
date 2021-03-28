package com.microservicesonaws.api.model;

public class WebItResponse {

	private String status;
	private WebItResponseData data; 
	private String message;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public WebItResponseData getData() {
		return data;
	}
	public void setData(WebItResponseData data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
