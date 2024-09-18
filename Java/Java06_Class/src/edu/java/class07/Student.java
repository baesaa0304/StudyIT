package edu.java.class07;

public class Student {
	// field
	int stuMo; // 학생 번호(학번)
	String name; // 학생의 이름
	Score score; // 학생 (java, sql, html)시험 점수
	
	
	//constructor
	// (1) 기본 생성자 (2) stuMO, name, score를 초기화 할 수 있는 생성자
	
	// (1)
	public Student() {}
	
	
	//(2)
	public Student(int stuMO, String name, Score score) {
		this.stuMo = stuMO;
		this.name = name;
		this.score = score;
				
	}
	
	//(3)
	public Student(int stuMO, String name, int java, int sql, int html) {
		this.stuMo = stuMO;
		this.name = name;
		this.score = new Score(java, sql, html);
	}
	
	//method
	//printStudent - 학번, 이름 ,세 과목 점수, 총점을 모두 출력 할 수 있는 메서드
	public void printStudent() {
		if (score == null) {
			System.out.println("세 과목 점수 조회 불가");
		} else {
			System.out.println("학번: " + stuMo);
			System.out.println("이름: " + name);
//			System.out.println("JAVA 점수: " + this.score.java); 			
//			System.out.println("SQL 점수: " + this.score.sql); 
//			System.out.println("HTML 점수: " + this.score.html); 
			score.printScoer(); // System.out.println("세 과목 점수: " + score);
			System.out.println();
			System.out.println("총점: " + score.getTotal());
			System.out.println("평균: " + score.getAverage());
			
			
			
			
		}
	}
}
