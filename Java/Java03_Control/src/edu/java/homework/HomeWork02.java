package edu.java.homework;

public class HomeWork02 {

	public static void main(String[] args) {
		
		int t = 0;
		int k = 1;
		for (int n = 1; n<=100; n++) {
			if(n - 3 == t * 10) {
				System.out.print("*\t");
			}else if(n - 6 == t * 10) {
				System.out.print("*\t");
			}else if(n - 9 == t * 10) {
				System.out.print("*\t");
			}else if (n % 10 ==0) {
				if(k % 3 == 0) {
					System.out.println("*\t");
				} else {
					System.out.println(n + "\t"); //줄바꿈
				}
				t++; k++;
			}else if (t == 3 || t == 6 || t== 9) {
				System.out.print("*\t");
			}
			
			 else {
				System.out.print(n + "\t");
			}
			
			// 방법 2 :
			
			
		} 
		
		
		
		// 369 게임 출력
        /* 실행 결과
            1   2   *   4   5   *   7   8   *   10  
            11  12  *   14  15  *   17  18  *   20  
            21  22  *   24  25  *   27  28  *   *   
            *   *   *   *   *   *   *   *   *   40  
            41  42  *   44  45  *   47  48  *   50  
            51  52  *   54  55  *   57  58  *   *   
            *   *   *   *   *   *   *   *   *   70  
            71  72  *   74  75  *   77  78  *   80  
            81  82  *   84  85  *   87  88  *   *   
            *   *   *   *   *   *   *   *   *   100
         */

	}

}
