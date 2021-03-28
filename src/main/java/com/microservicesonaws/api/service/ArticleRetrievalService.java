package com.microservicesonaws.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservicesonaws.api.model.ContentArticle;
import com.microservicesonaws.api.model.ContentResponse;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class ArticleRetrievalService {

	public List<ContentArticle> retrieveLatestArticles(String section) {

		try {
			OkHttpClient client = new OkHttpClient();

			Request request = new Request.Builder()
					.url("https://api.nytimes.com/svc/news/v3/content/nyt/"+section+".json?limit=20&offset=0&api-key=***REMOVED***")
					.get()
					.build();

			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful()) {
				ObjectMapper objectMapper = new ObjectMapper();
				ContentResponse contentResponse = objectMapper.readValue(response.body().string(), ContentResponse.class);
				
				return contentResponse.getResults();
			}
			
			return null;

		} catch (Exception e) {
			System.out.println("**** "+e);
			return new ArrayList<ContentArticle>();
		}
	}
	
	public List<ContentArticle> retrieveArticlesBasedOnKeywordSearch(String keyword) {
		
		return null;
		
	}

}
