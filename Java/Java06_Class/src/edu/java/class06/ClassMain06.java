package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		Circle cir1 = new Circle(); // 기본 생성자 호출
						
		//(1)
		
		cir1.pirntInfo();
		System.out.println("둘레: " + cir1.perimter());
		System.out.println("넓이: " +cir1.area());
		
		//(2)
		
		Circle cir2 = new Circle(1.0);
		cir2.pirntInfo();
		System.out.println("둘레: " + cir2.perimter());
		System.out.println("넓이: " + cir2.area());
	}

}
