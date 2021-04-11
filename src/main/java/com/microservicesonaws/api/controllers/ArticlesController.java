package com.microservicesonaws.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesonaws.api.model.Section;
import com.microservicesonaws.api.model.SectionTopArticle;
import com.microservicesonaws.api.service.ArticleRetrievalService;

@RestController
@RequestMapping(value="/v1/articles")
public class ArticlesController {
	
	@Autowired
	private ArticleRetrievalService retrievalService;
	
	@RequestMapping(value="/sections", method=RequestMethod.GET)
	public List<Section> getSections() {
		return retrievalService.retrieveSections();
	}

	@RequestMapping(value="/latest/{category}", method=RequestMethod.GET)
	public List<SectionTopArticle> latestArticles(@PathVariable("category") String category) {
		return retrievalService.retrieveLatestArticles(category);
	}

	@RequestMapping(value="/search/{searchKeyword}", method=RequestMethod.GET)
	public List<SectionTopArticle> retrieveArticles(@PathVariable("searchKeyword") String searchKeyword) {
		return retrievalService.retrieveArticlesBasedOnKeywordSearch(searchKeyword);
	}

	
}
