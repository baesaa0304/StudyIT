package edu.java.file07;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private Score score; 
		
	
	
 // TOOD : 생성자 getter setter tostring , 파일을 쓸수 있어여 함
	public Student() {}
	
	
	
	public Student (int id , String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Score getScore() {
		return score;
	}



	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Score(id = %d, name =%s , Score = %s)" , this.id, this.name, this.score);
	}
	
	
}
