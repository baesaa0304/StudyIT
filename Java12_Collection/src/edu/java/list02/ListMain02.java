package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;


import javax.print.DocFlavor.INPUT_STREAM;

public class ListMain02 {

	public static void main(String[] args) {
		// 정수를 저장하는 LinkedList 타입 객체 생성.
		// LIST의 원소 타입은 자바의 기본 타입을 사용할 수 없음! 예 -> List<int> (x)
		// 기본 타입 대신에 wraaper 클래스를 사용해야 함!    예 ->  List<Integer> (O)
		LinkedList<Integer> numbers = new LinkedList<>();
		
		// LinkedList와 ArrayList 원소 추가(add)/ 삭제(remove) / 검색(get) 메서드 이름과 시용법이 동일.
		
		// 리스트 numbers에 [0, 100) 0 [보다는 크거나 같고 100 미만) 범위의 정수 난수 20개를 저장.		
		Random rand = new Random();
		for(int i = 0; i < 20; i++) {
			numbers.add(rand.nextInt(100));
		}
		
		
		// 리스트 numberes의 내용을 출력.
		System.out.println(numbers);
		
		// 홀수들만 저장할 LinkedList 변수(odds) 선언, 객체 생성.
		LinkedList<Integer> odds = new LinkedList<>();
		
		// numbers의 정수들 중에서 홀수들만 odds에 저장.
		for (Integer n : numbers) { // 리스트 numbers의 원소들을 처음부터 끝까지 순회하면서.
			if (n % 2 == 1) {
				odds.add(n);
			}
		}
		// 리스트 odds의 내용을 출력. 
		System.out.println(odds);
		// LinkedList 변수(evenSquares) 선언, 객체 생성
		LinkedList<Integer> evenSquares = new LinkedList<>();
		// evenSquares에는 numbers의 숫자들 중 짝수들의 제곱을 저장.
		for(Integer n: numbers) { // 리스트 numbers의 원소들을 처음부터 끝까지 반복하면서 
			if(n % 2 == 0) { // 리스트의 원소가 짝수이면
				evenSquares.add(n * n);	// 원소의 제곱을 저장.
			}
		}
		// 리스트 evenSquares의 내용을 출력.
		System.out.println(evenSquares);
		
		// Iterator 사용.
		Iterator<Integer> itr = evenSquares.iterator();
		while(itr.hasNext()) { 
			System.out.println(itr.next() + " ");
		}
		
		
		
		
		
		
		
	}

}
