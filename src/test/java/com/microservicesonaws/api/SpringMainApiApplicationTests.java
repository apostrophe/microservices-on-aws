package com.microservicesonaws.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.microservicesonaws.api.controllers.NewsController;
import com.microservicesonaws.api.model.SectionTopArticle;
import com.microservicesonaws.api.utility.Utility;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@SpringBootTest
class SpringMainApiApplicationTests {

	@Autowired
	private NewsController newsController;

	@Test
	void apiKeyFileIsAvailable() {
		Utility utility = new Utility();
		assertThat(utility.apiKey() != null && utility.apiKey().length() > 0);
	}
	
	@Test
	void contextLoads() {
		assertThat(newsController).isNotNull();
	}
	
	@Test
	void newsControllerReturnsBasicContent() throws Exception {
		List<SectionTopArticle> articles = newsController.latestArticles("opinion");
		assertThat(articles.size() > 0);
	}

}


/*
 * 
 * @Disabled("Not implemented yet")
 * 
 * 
 * */