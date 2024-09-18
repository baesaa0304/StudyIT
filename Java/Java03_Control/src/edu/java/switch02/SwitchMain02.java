package edu.java.switch02;

public class SwitchMain02 {

	public static void main(String[] args) {
		// 정수를 사용하는 switch-case
		
		int n =17;
		switch (n % 2) {
		// switch-case는 분리형 사용불가 ex) switch(n % 2 ==0) 비교연산자 사용불가
		case 0:
			System.out.println("짝수");
			 break;
		case 1:
			System.out.println("홀수");
			break;
		}

	}

}
