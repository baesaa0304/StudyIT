package edu.java.mvc.controller;

import edu.java.mvc.model.Post;

public interface PostDao {
/**
 * 새 피드 저장기능 
 * 
 */
	
int creat(Post c);


/**
 * 블로그 목록 보기
 */
Post [] read();

// 블로그 검색
Post read (int index);

// 블로그 수정
int update (int index, Post post);

// 블로그 삭제
int delete(int index);

}


