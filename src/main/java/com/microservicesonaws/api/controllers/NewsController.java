package com.microservicesonaws.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesonaws.api.model.Article;
import com.microservicesonaws.api.service.ArticleRetrievalService;

@RestController
@RequestMapping(value="/v1/articles")
public class NewsController {
	
	@Autowired
	private ArticleRetrievalService retrievalService;

	@RequestMapping(value="/{searchKeyword}", method=RequestMethod.GET)
	public List<Article> retrieveArticles(@PathVariable("searchKeyword") String searchKeyword) {
		return retrievalService.retrieveArticlesBasedOnKeywordSearch(searchKeyword);
	}

	
}
