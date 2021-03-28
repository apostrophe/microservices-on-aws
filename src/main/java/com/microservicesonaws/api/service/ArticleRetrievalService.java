package com.microservicesonaws.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservicesonaws.api.model.Article;
import com.microservicesonaws.api.model.WebItResponse;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

@Service
public class ArticleRetrievalService {

	public List<Article> retrieveArticlesBasedOnKeywordSearch(String keyword) {

		try {
			OkHttpClient client = new OkHttpClient();

			Request request = new Request.Builder()
					.url("https://webit-news-search.p.rapidapi.com/search?q="+keyword+"&language=en&number=8&offset=0")
					.get()
					.addHeader("x-rapidapi-key", "***REMOVED***")
					//				.addHeader("x-rapidapi-host", "webit-news-search.p.rapidapi.com")
					.build();

			Response response = client.newCall(request).execute();

			ObjectMapper objectMapper = new ObjectMapper();
			WebItResponse webItResponse = objectMapper.readValue(response.body().string(), WebItResponse.class);
			
			if (webItResponse.getStatus().equalsIgnoreCase("success")) {
				return webItResponse.getData().getResults();
			} else {
				return new ArrayList<Article>();
			}

		} catch (Exception e) {
			System.out.println("**** "+e);
			return new ArrayList<Article>();
		}
	}
}
