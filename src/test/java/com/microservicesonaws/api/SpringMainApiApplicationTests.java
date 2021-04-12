package com.microservicesonaws.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.microservicesonaws.api.controllers.ArticlesController;
import com.microservicesonaws.api.model.sections.Section;
import com.microservicesonaws.api.model.sections.SectionTopArticle;
import com.microservicesonaws.api.utility.Utility;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@SpringBootTest
class SpringMainApiApplicationTests {

	@Autowired
	private ArticlesController newsController;

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
	void getSectionsEndpointReturnsContent() throws Exception {
		List<Section> sections = newsController.getSections();
		assertThat(sections.size() > 0);
	}

	@Test
	void latestArticlesInTravelSectionReturnsContent() throws Exception {
		List<SectionTopArticle> articles = newsController.latestArticles("travel");
		assertThat(articles.size() > 0);
	}

	@Test
	void latestArticlesInBusinessSectionReturnsContent() throws Exception {
		List<SectionTopArticle> articles = newsController.latestArticles("business");
		assertThat(articles.size() > 0);
	}

	@Test
	void latestArticlesInWorldSectionReturnsContent() throws Exception {
		List<SectionTopArticle> articles = newsController.latestArticles("world");
		assertThat(articles.size() > 0);
	}

	@Test
	void latestArticlesInAllSectionsReturnsContent() throws Exception {
		List<SectionTopArticle> articles = newsController.latestArticles("all");
		assertThat(articles.size() > 0);
	}

}


/*
 * 
 * @Disabled("Not implemented yet")
 * 
 * 
 * */