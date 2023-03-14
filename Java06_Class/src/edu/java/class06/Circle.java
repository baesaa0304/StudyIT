package edu.java.class06;

public class Circle {
	 
	// field - 객페의 속성
	double radius; // 원의 반지름
    
    // 생성자 - 객체 속성을 초기화
    // (1) 기본 생성자
    // (2) argument 1개를 갖는 생성자
    
	
	
	// (1)
	public Circle() {}
	
	// (2)
	public Circle(double radius) {
		this.radius = radius;
	}
    
    // 메서드 - 객체의 기능
    
	// (1) printInfo - 원의 반지름 정보를 출력.
//	public void prinInfo(double radius) {
//		 this.radius = radius;
//	}	
	public void pirntInfo() {
		System.out.printf("원 반지름: %f\n", this.radius);
	}
	
    // (2) perimeter - 원의 둘레 길이(2 x 3.14 x 반지름)을 리턴.
	public double perimter() {
		return 2 * 3.14 * this.radius;
	}
	
    // (3) area - 원의 넓이(3.14 x 반지름 x 반지름)을 리턴.
	public double area() {
		return 3.14 * radius * radius;
	}
}
