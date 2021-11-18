package com.jagranenglish.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jagranenglish.core.dao.ArticleDao;
import com.jagranenglish.core.pojo.Article;

@Service
public class ArticleService {
	
	@Autowired
	ArticleDao articleDao;
	

	public List<Article> findById(Integer id) {
		for (Article art : articleDao.findAll()) {
			System.out.println(art.getId());
		}
		return articleDao.findAll();
		
	}

}
