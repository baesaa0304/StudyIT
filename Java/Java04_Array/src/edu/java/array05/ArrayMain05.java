package edu.java.array05;

import java.util.Random;

public class ArrayMain05 {

	public static void main(String[] args) {
		// int 10개를 저장할 수 있는 배열을 선언.
		int[]genderCodes = new int[10] ;
		
		
		//배열에 난수 (0, 1) 10개를 저장. // 2보다 작은 난수
		Random random = new Random();
		for (int i =0; i < genderCodes.length; i++) {
			genderCodes[i] = random.nextInt(2);
		}
		// 배열의 내용을 출력.
		for (int x : genderCodes) {
			System.out.print(x + " ");
		}
		//문자열 10개를 저장할 수 있는 배열(genders) 을 선언.
		String []genders = new String[10];
				
		System.out.println();
		// genderCodes의 값이 0이면 "Male", 1이면 "Female"을 문자열 배열에 저장.
		
		// 문자열 배열 genders의 내용을 출력.
		for (int i = 0; i < genderCodes.length; i++) {
			if(genderCodes[i] == 0) {
				genders[i] = "Male";
			}else {
				genders[i] = "Female";
			}
			System.out.println("genders = " + genders[i]);
		}
//		for (String s : genders) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
		
		// 문자열 배열에 저장된 "Male"의 개수, "Female"의 개수를 출력.
		int numOfMales = 0; // "Male"의 개수를 저장할 변수
		int numOfFemales = 0; // "Female"의 개수를 저장할 변수
		for (String s : genders) { // 배열 genders의 원소들을 순서대로 반복하면서
			if(s.equals("male")) { // 배열에서 읽은 값이 "Male"과 같으면
				numOfMales++; // 남성의 숫자를 1 증가
			}else if (s.equals("Female")) { // 배열에서 읽은 값이 "Female"과 같으면
				numOfFemales++; // 여성의 숫자를 1 증가
			}			
		}
		System.out.println("Male = " + numOfMales);
		System.out.println("Female = " + numOfFemales);
		
		
		
		
				
		
	}

}
