package edu.java.method01;

import java.util.Random;


// 메서드 (method) : 클래스 안에서 정의하는 기능(함수 , function).
// - 함수 (function) : 프로그램에서 사용될 기능을 코드 블록으로 작성한 것.
// - 메서드 : 클래스 안에서 작성된 함수.
// 자바 언어는 메서드만 제공하고, 함수는 제공하지 않음!
// 자바 언어는 메서드 안에서 메서드를 정의하는 것을 제공하지 않음!

// 함수 호출 (call, invoke) : 메서드 사용하는 것
// argument: 메서드를 호출할 때 메서드에게 전달하는 값.
// parameter : 매개변수. 아규먼트를 저장하기 위한 매서드의 지역 변수.
// 반환 값 (return value) : 메서드가 모든 기능흘 수행 한 후 메서드를 호출한 곳으로 되돌려 주는 값.
// - 메서드는 반환 값이 있을 수도 있고, 없을 수도 있음.
// - println() : 반환 값이 없는 메서드.
// - nextInt() : 반환 값이 있는 메서드.

// 메서드 정의(선언) 방법 : 
//[수식어] 리턴타입 메서드 이름([파라미터 선언,...]) {...} (메서드를 만드는 구조)//
// 메서의 리턴 값이 없는 경우에는 리턴 타입을 void라고 선언함.
public class MethodMain01 {

	// main 메서드(method) : 프로그램 시작점.
	public static void main(String[] args) {
		System.out.println("안녕하세요~");
		// -> println() 메서드 호출. -> 호출 결과 : 콘솔 창에 문자열을 출력.
		
		Random random = new Random();
		int x = random.nextInt(10);
		// -> nextInt() 메서드(기능) 호출 nextInt() 메서드는 난수를 반환(return).
		System.out.println(x);

		System.out.println("테스트 1");
		
		newLine(); // 같은 클래스에 정의(선언)된 메서드를 호출
		System.out.println("테스트2 ");
		
		
		System.out.println("테스트3 ");
		newLine(3);
		System.out.println("테스트4 ");
	}
	/**
	 * 콘솔에 빈 줄 하나를 출력 하는 메서드.
	 */
	public static void newLine() {
		System.out.println();
	}
	/**
	 * 콘솔에 n개의 빈 줄을 출력하는 메서드.
	 * 
	 * @param a 0 이상의 정수. 출력할 빈 줄의 개수.
	 */
	public static void newLine(int a) {
		for (int i =0; i < a; i++) {
			System.out.println();
		}
	}

}
