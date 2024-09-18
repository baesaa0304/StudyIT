package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단 2단은 2X2까지, 3단은 3X3까지, 4단은 4곱하기 4X$까지..... 9단은 9X9가지 출력.
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("---" + dan + "단 ----");
			for (int n = 1; n < 10; n++) {
				if (dan < n) {
					break;
				}System.out.println(dan + " x " + n + " = " + (dan * n));
				
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		// while 문
		int n = 2;
		while (n < 10) {
			System.out.println("---" + n + "단----");
			
			for(int b = 1; b < 10; b++) {
				if(n < b) {
					break;
				}
				System.out.println(n + " x " + b + " = " + (n * b));				
			} n++;
		}
		
		
		
		System.out.println();
		System.out.println();
		
		
		//while 2방법 : 
		int x = 2;
		while(x < 10) {
			System.out.println("---" + x + "단---");
			
			int y = 1;
			while ( y < 10) {
				if(x < y) {
					break;
				}
				System.out.println(x + " x " + y + " = " + (x * y));
				y++;
			} x++;
		}
		
		//while 3방법
		
			
		}
		

	

}
