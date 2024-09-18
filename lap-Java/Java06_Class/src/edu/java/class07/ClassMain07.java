package edu.java.class07;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class ClassMain07 {

	public static void main(String[] args) {
		Score sco1 = new Score(); // 기본 생성자 호출
		
		//(1)
		sco1.printScoer();
		System.out.println();
		
		System.out.println("총점: " + sco1.getTotal());
		System.out.println("평균: " + sco1.getAverage());
		
		
		//(2)
		Score sco2 = new Score(50 , 60, 70);
		sco2.printScoer();
		
		System.out.println();
		System.out.println("총점: " + sco2.getTotal());
		System.out.println("평균: " + sco2.getAverage());
		
		String emptyString = "";
		System.out.println("길이: " + emptyString.length());
		String nullString = null;
//		System.out.println("길이: " +nullString.length());
		// -> NullPonterExeption 발생
		// null : 생성된 객체가 없다.
		// 데이터 타입의 기본값:
		// (1) boolean - false, (2) 정수 -0, (3) 실수 -0.0, (4) 참조(클래스) 타입 - null
		//*------------------*
		
		// 기본 생성자를 사용해서 student 객체를 생성.
//		
//		Student sco3 = new Student(1, "배선영", Score1);
//		sco3.printStudent();
//		System.out.println(sco3);
//		
//		sco3.printStudent();
//		sco3.stuMo = 2020;
//		sco3.name = "배선영";
//		sco3.score = sco2;
//		sco3.printStudent();
		
		Student stu5 = new Student(10, "위태욱", 100, 100, 100);
		stu5.printStudent();
		
		
		
		

	}

}
