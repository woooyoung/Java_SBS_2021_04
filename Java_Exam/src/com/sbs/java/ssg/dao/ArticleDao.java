package com.sbs.java.ssg.dao;

import java.util.ArrayList;
import java.util.List;

import com.sbs.java.ssg.dto.Article;

public class ArticleDao extends Dao {
	public List<Article> articles;

	public int getLastId() {
		return lastId;
	}

	public ArticleDao() {
		articles = new ArrayList<>();
	}

	public void add(Article article) {
		articles.add(article);
		lastId = article.id;
	}
}