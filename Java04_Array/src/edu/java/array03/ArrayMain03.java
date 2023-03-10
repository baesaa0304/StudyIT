package edu.java.array03;

import javax.sound.sampled.BooleanControl;

public class ArrayMain03 {

	public static void main(String[] args) {
		// EX 1.
		// 정수 (int) 10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 0 ,2, 4, 6, 8, 10,.... 18을 저장
		// 배열의 원소들을 한 줄로 출력.
		int[] scores = new int [10]; // 정수 int 10개 선언
		
		// 배열 저장
//		scores[0] = 0;
//		scores[1] = 2;
//		scores[9] = 18;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i * 2;
		}
		
		// for- each 구문으로 프린트 
		
		// for -each 
		for (int x : scores) {
			System.out.print(x + "  ");
		}
		
		System.out.println();
		
		
		
		
		// EX 2.
		// boolean 10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 true, false, true, false, ....,를 저장.
		// 배열의 원소들을 한 줄로 출력.
		boolean[] isEven = new boolean[10];
		
		//배열 저장
		for (int i = 0; i <isEven.length; i++) {
			if (i % 2 ==0) {
				isEven[i]=true;
			}else {
				isEven[i]=false;
			}
		}
		
		// for -each 구문
		for (boolean x : isEven) {
			System.out.print(x + " ");
		}
		
		

	}

}
