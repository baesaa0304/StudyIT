package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// // 2중 반복문
		for ( int dan = 2; dan < 10; dan++) {
			System.out.println("---" + dan + "단 ---");
			for (int n = 1; n < 10; n++) {
//				System.out.println(dan + " x " + n + " = " + (dan * n));
				System.out.printf("%d x %d = %d\n" , dan, n, dan * n);
			}
		}
		System.out.println();
		System.out.println();
		
		int n = 2;		
		while (n < 10) {
			System.out.println("---" + n + "단----");
			for(int b = 1; b < 10; b++) {
				System.out.println(n + " x " + b);
			} n++;
		}
		
		// 방법 2 :
		int x = 2;
		while ( x < 10) {
			System.out.println("---" + x + "단---");
			
			//구구단 출력
			int y = 1;
			while (y < 10) {
				System.out.printf("%d x %d = %d\n", x, y ,x * y);
				y++;
			}
			
			x++;
		}

	}

}
