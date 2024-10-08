package edu.java.homework;

public class HomeWork04 {

	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			int n1 = n % 10; // n을 10으로 나눈 나머지 -> 1의 자릿수
			int n10 = n / 10; // n을 10으로 나눈 몫 -. 10의 자릿수
			
			// 1의 자릿수가 3 또는 6또는 9인 경우
			boolean condition1 = ((n1 == 3) || (n1 == 6) || (n1 == 9));
			// 10의 저랏수가 3 또는 6 또는 9인 경우
			boolean condition2 = ((n10 == 3) ||(n10 == 6) || (n10 == 9));
			
			
			
			// 숫자를 출력할 것인지, "*"를 출력할 것인 지.
			if (condition1 && condition2) {
				System.out.print("**\t");
			}else if (condition1 || condition2) {
				System.out.print("*\t");
			}else {
				System.out.print(n + "\t");
			}
			


			// 줄바꿈을 할 것인 지 아닌 지
			if (n % 10 == 0) { // 10의 배수이면 (숫자 또는 *를 한 줄에 10개를 출력했으면)
				System.out.println(); // 줄바꿈
			}
		}

	}

}
