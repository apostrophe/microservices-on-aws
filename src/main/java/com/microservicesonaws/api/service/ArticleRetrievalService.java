package com.microservicesonaws.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservicesonaws.api.model.SectionTopArticle;
import com.microservicesonaws.api.model.SectionTopArticlesResponse;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class ArticleRetrievalService {
	
	@Autowired
	private String apiKey;

	public List<SectionTopArticle> retrieveLatestArticles(String section) {

		try {
			
			Request request = new Request.Builder()
					.url("https://api.nytimes.com/svc/news/v3/content/nyt/"+section+".json?limit=200&offset=0&api-key="+apiKey)
					.get()
					.build();

			OkHttpClient client = new OkHttpClient();
			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful()) {
				ObjectMapper objectMapper = new ObjectMapper();
				SectionTopArticlesResponse contentResponse = objectMapper.readValue(response.body().string(), SectionTopArticlesResponse.class);
				
				return contentResponse.getResults();
			}
			
			return null;

		} catch (Exception e) {
			System.out.println("**** "+e);
			return new ArrayList<SectionTopArticle>();
		}
	}
	
	public List<SectionTopArticle> retrieveArticlesBasedOnKeywordSearch(String keyword) {
		
		return null;
		
	}

}
