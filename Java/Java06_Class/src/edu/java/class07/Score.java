package edu.java.class07;

public class Score {
	// 필드 - 객체의 속성(데이터)
	int java; // java 과목 점수
	int sql; // SQL 과목 점수
	int html; // HTML 과목 점수
	
	
	// 생성자 - 객체 생성 & 속성 초기화
	// (1) 기본 생성자  (2) argument 3개를 갖는 생성자
	
	// (1)
	public Score() {}
	
	
	// (2)
	public Score(int java , int sql, int html) {
		this.java = java;
		this.sql = sql;
		this.html = html;
	}
	
	// 메서드 - 객체 기능 
	// (1) printScore 3과목으로 출력만 해여함
	public void printScoer() {
		System.out.printf("JAVA: %d, SQL: %d, HTML: %d", this.java , this.sql, this.html);
	}
	// (2) getTotal 세 과목으로 총점 리턴
	public int getTotal() {
		return (java + sql + html);
	}
	// (3) getAverage - 세 과목으로 평균(double) 리턴
	public double getAverage() {
		return (double)getTotal() / 3;
	}
}
