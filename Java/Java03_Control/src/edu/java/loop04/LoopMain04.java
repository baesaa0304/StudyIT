package edu.java.loop04;

public class LoopMain04 {

	public static void main(String[] args) {
		// 반복문에서 break와 continue 차이점
		
		for(int n = 1; n <= 5; n++) {
			System.out.println(n);
			if (n == 3) {
				break; // break는 For 문을 나가라는 것 즉 break가 포함된 가장 가까운 반복문을 종료.
			}  
		}
		
		 System.out.println("-------------------");
		
		
		for(int n = 1; n <= 5; n++) {
			if (n == 3) {
				continue; //continue 아래의 코드들은 실행하지 않고, 그 다음 반복을 계속해서 수행.
				
			}
			System.out.println(n);
		}

	}

}
