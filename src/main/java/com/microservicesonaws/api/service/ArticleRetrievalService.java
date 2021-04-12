package com.microservicesonaws.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservicesonaws.api.model.search.ArticleSearchResponse;
import com.microservicesonaws.api.model.search.SearchResponseArticle;
import com.microservicesonaws.api.model.sections.Section;
import com.microservicesonaws.api.model.sections.SectionListResponse;
import com.microservicesonaws.api.model.sections.SectionTopArticle;
import com.microservicesonaws.api.model.sections.SectionTopArticlesResponse;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class ArticleRetrievalService {
	
	@Autowired
	private String apiKey;
	
	public List<Section> retrieveSections() {

		try {
			
			Request request = new Request.Builder()
					.url("https://api.nytimes.com/svc/news/v3/content/section-list.json?api-key="+apiKey)
					.get()
					.build();

			OkHttpClient client = new OkHttpClient();
			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful()) {
				ObjectMapper objectMapper = new ObjectMapper();
				SectionListResponse sectionListResponse = 
						objectMapper.readValue(response.body().string(), SectionListResponse.class);
				
				return sectionListResponse.getResults();
			}
			
			return null;

		} catch (Exception e) {
			System.out.println("**** "+e);
			return new ArrayList<Section>();
		}

	}

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
	
	public List<SearchResponseArticle> retrieveArticlesBasedOnKeywordSearch(String searchTerm) {
		
		try {
			
			Request request = new Request.Builder()
					.url("https://api.nytimes.com/svc/search/v2/articlesearch.json?q="+searchTerm+"&limit=1&api-key="+apiKey)
					.get()
					.build();

			OkHttpClient client = new OkHttpClient();
			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful()) {
				ObjectMapper objectMapper = new ObjectMapper();
				ArticleSearchResponse articleSearchResponse
					= objectMapper.readValue(response.body().string(), ArticleSearchResponse.class);
				
				return articleSearchResponse.getSearchResponse().getDocs();
			}
			
			return null;

		} catch (Exception e) {
			System.out.println("**** "+e);
			return new ArrayList<SearchResponseArticle>();
		}
		
	}

}
