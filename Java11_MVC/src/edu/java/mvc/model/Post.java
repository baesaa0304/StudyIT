package edu.java.mvc.model;

import java.time.LocalDateTime;

public class Post {
	
	// fields
	
	private int pid;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdTime; // 업로드시간
    private LocalDateTime modifiedTime; // 수정시간

    
    // constructors
    public Post() {}
    
    public Post(int pid, String title, String content, String author) {
    	this.pid = pid;
    	this.title = title;
    	this.content = content;
    	this.author = author;
    	
    } 
    
   
    

    
    
    
    // getter setter
	public int getPid() {
		return pid;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	@Override
	public String toString() {
		return "Post(pid = " + this.pid + " TITLE = " + this.title + " COMTENT = " + this.content + " AUTHOR = " + author + ")";
	}

}
