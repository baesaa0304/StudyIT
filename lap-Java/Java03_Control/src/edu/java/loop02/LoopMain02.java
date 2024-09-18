package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		// 복합 할당 연산자 : +=, -=, *=, /=, %=,...
		int x =10;
//		x = x +1;
		x += 1;
		System.out.println("x =" +x);
		
		//System.out.println : print line. 출력하고 줄바꿈.
		System.out.println("test");
		
		// System.out.print : 출력하고 줄바꿈이 일어나지 않음. 출력이 끝난 위치에 커서가 위치.
		System.out.print("test1");
		System.out.print("test2");
		System.out.println("test3");
		
		// 0 2 4 6 8 10
		// 0부터 10까지 짝수들을 한 줄에 출력
		for (int y = 0; y <=10; y+=2) {
			System.out.print(y + " ");
		}
		
		for (int y = 0; y <=10; y++) {
			if(y % 2==0) {
				System.out.print(y + " ");
			}
		}
		System.out.println();
		
		System.out.println();
		
		for(int y = 10; y >=0; y-=2) {
			System.out.print(y + " ");
		}
		
		System.out.println();
		
		for(int y =0; y<= 5; y++) {
			System.out.print((2 * y) + " ");
		}
		
		// 1 3 5 7 9
		// 10 이하의 홀수들을 한 줄에 출력
		for(int y = 1; y <=9; y+=2) {
			System.out.print(y + " ");
		}

	}

}
