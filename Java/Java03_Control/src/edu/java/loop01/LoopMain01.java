package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		// 반복문
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("----------");
		
		// for 반복문
		for(int n =1; n <=5; n++){ 
			System.out.println(n);
		}
		
		// 증가 연산자(++), 감소 연산자 (--) : 변수의 값을 1 증가/감소.
		// 증가/감소 연산자는 변수 앞 또는 뒤에 사용. (예) x++, ++x
		
		System.out.println("------------");
		
		//10부터 1가지 내림차순으로 출력.
		for(int n =10; n > 0; n--){
			System.out.println(n);
		}
		
		int x = 1;
		{
			int y = 2;
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			
		}
		System.out.println("x =" + x);
		//System.out.println("y =" + y);
		// 변수 y는 블록 안에서만 사용가능한 지역변수
		// 지역 변수(local variable) : 메서드 블록({}) 안에서 선언한 변수
		// 지역변수는 선언된 위치에서부터 그 변수가 속한 블록({}) 안에서만 사용 가능.
		// for () 구문에서 선언하는 변수는 for 블록 안에서만 사용 가능한지역 변수.
		
		
		// 단축키 Ctrl + / 커서가 있는 줄(또는 선택된 줄) 주석 토글

	}

}
