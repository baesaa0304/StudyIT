package edu.java.mvc.controller;

import edu.java.mvc.model.Post;

public class PostDaoImpl implements PostDao {
	private static PostDaoImpl instance = null;
	
	private  PostDaoImpl () {};
	
	public static PostDaoImpl getInstance() {
		if(instance == null) {
			instance = new PostDaoImpl();
		}
		return instance;
	}
	
	// fields
	private static final int MAX_LENGTH = 2;
	private Post[] post1 = new Post[MAX_LENGTH];
	private int count = 0;
	
	//method
	public boolean isMemoryAvailable() {
		return count < MAX_LENGTH;
			
	}
	
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < count);
	}

	@Override
	public int creat(Post c) {
			if (isMemoryAvailable()) {
				post1[count] = c;
				count++;			
			return 1;			
			}	 else {
				return 0;
			}		
	}
	
	

	@Override
	public Post[] read() {
		Post[] array = new Post[count];
		
		for (int i =0; i < count; i++) {
			array[i] = post1[i];
		}
		return array;
	}
	
	

	@Override
	public Post read(int index) {
		if (isValidIndex(index)) {
			return post1[index];
		} else {
			return null;
		}
		
	}

	@Override
	public int update(int index, Post post) {
		if (isValidIndex(index)) {
			post1[index].setTitle(post.getTitle());
			post1[index].setContent(post.getContent());
			post1[index].setAuthor(post.getAuthor());
			
			return 1;
		} else {
		return 0;
		}
	}

	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
		for (int i = index; i < count - 1; i++) {
			post1[i] = post1[i + 1];
       }
		post1[count - 1] = null;
		count --;
		
		return 1;
	}
	
	 
	    
	
	
	 
	
	
	
	
	
}
