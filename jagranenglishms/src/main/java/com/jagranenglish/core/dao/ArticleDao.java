package com.jagranenglish.core.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagranenglish.core.pojo.Article;



public interface ArticleDao extends JpaRepository<Article, Integer> {
	 
}

