package edu.java.string;

public class StringMain {

	public static void main(String[] args) {
		// Ex1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
		String ssn = "991231-1234567";
		// TOOD
		char sex = ssn.charAt(7);
		System.out.println(sex);
		String[] array = ssn.split("-");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[1].charAt(0));
//		if (sex == '1' || sex == '3') {
//			System.out.println("남자");			
//		} else if (sex == '2' || sex == '4') {
//			 System.out.println("여자");
//		} else {
//			System.out.println("대한민국 국적이 아닙니다.");
		

System.out.println("--------------------------------------------------------");		
		
		// Ex2. 아래의 문자열 배열에서 "홍길동"이라고 하는 문자열이 처음 등장하는 인덱스를 출력.
		// 만약에 홍길동이라는 문자열이 배열에 없으면 -1을 출력
		String[] names = {"오썜" , "jone", "jane", "홍길동", "허균", "홍길동"};
		// 출력값이 3으로 나와야 함
		// TOOD	
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("홍길동")) {
			index = i;
			break;
			} 
	    }
		System.out.println("홍길동 인덱스 = " + index);

		System.out.println("--------------------------------------------------------");			
		
		// Ex3. 아래의 문자열 배열에서 5글자 이상인 문자열들을 찾아서 출력.
		String[] languages = {"Java", "SQL", "HTML", "CSS", "JavaScript", "Python"};
		//TOOD
		for(String s : languages) {
			if (s.length() >= 5) {
				System.out.print(s + " ");
			}			
		}
		System.out.println();
			
		
		
System.out.println("--------------------------------------------------------");		
		

		// Ex4. 아래의 문자열 배열에서 대소문자 구별 없이 "est"가 포함된 문자열들을 찾아서 출력.
		String[] tests = {"TEST", "test", "TeSt", "tEST", "테스트"};
		// TOOD 
		System.out.println("TEST".toLowerCase());
		System.out.println("test".toUpperCase());
		System.out.println("test".contains("est"));
		for (String s : tests) {
			if (s.toLowerCase().contains("est")) {
				System.out.print(s + " ");
			}
		}


System.out.println("--------------------------------------------------------");
		
		
		// Ex5. 아래의 "YYYY-MM-00" 형식의 날짜 문자열에서 연/월/일 정보를 int 타입 변수에 저장하고 출력.
		String date = "2023-03-22";
		String[] dateString = date.split("-");
		int year = Integer.parseInt(dateString[0]);
		int month = Integer.parseInt(dateString[1]);;
		int day= Integer.parseInt(dateString[2]);;
		
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("day: " + day);
	
		
		

		
		
	}		
}

 

