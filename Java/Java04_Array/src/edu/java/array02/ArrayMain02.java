package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 문자열 3개를 저장할 수 있는 배열(names)을 선언, 초기화.
		String[] names = new String[3];
		
		// 배열 name에 문자열을 저장.
		names[0] = "이찬희";
		names[1] = "지대한";
		names[2] = "김다훈";
		
		// 배열의 names의 내용 한 줄로 출력 :
		// (1) for 구문
		// (2) for - each 구문
		
		//해설 (1) :
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		
		// 해설 (2)
		for(String a : names) {
			System.out.print(a + " ");
		}
				
		System.out.println();
		
		String[] subjects = {"Java" , "SQL", "HTML", "JavaScript"};
		for (String s : subjects) {
			System.out.print(s + " ");
		}
		

	}

}
