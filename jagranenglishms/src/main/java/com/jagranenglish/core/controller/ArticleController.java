package com.jagranenglish.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jagranenglish.core.pojo.Article;
import com.jagranenglish.core.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	
	@GetMapping("/englisharticle/{id}")  
	  public List<Article> getAllUsers(@PathVariable Integer id) {
	    //return articleService.findById(id);
		System.out.println(id);
		return articleService.findById(id);
	  }
	

}
