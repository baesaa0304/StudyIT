package edu.java.class05;


// 직사각형
public class Rectangle {
	// field - 객체 속성
	double witdth; // 직사각형 가로 길이
	double height; // 직사각형 세로 길이
	
	// 생성자 - 필드 초기화
	// (1) 기본생성자
	// (2) 직사각형의 가로/새로 길이를 전달받은 값으로 초기화하는 생성자.
	
	//(1) 
	public Rectangle() {}
	
	
	//(2)
	public Rectangle(double witdth, double height) {
		this.witdth = witdth;
		this.height = height;		
	}
	

	// 메서드 - 객체기능
	// (1) perimeter - 직사각형의 둘레 길이를 리턴.
	
	
	public double perimeter() {
		return (witdth + height) * 2; // (this.width + this.height) * 2		 			
	}
	
	// (2) area - 직사각형의 넓이 길이를 리턴.
	public double area() {
		return this.witdth * this.height; // width * height.
	}
}	
