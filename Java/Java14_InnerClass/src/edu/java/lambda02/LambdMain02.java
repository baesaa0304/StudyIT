package edu.java.lambda02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdMain02 {

	public static void main(String[] args) {
		Random random = new Random();
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}
		
//		System.out.println(numbers);
		
		for (Integer x : numbers) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		numbers.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		// 리스트 numbers에서 짝수들마 선택해서 새로운 리스트에 저장하고 출력.
		ArrayList<Integer> evens = new ArrayList<>();
		for (Integer x : numbers) {
			if (x % 2 == 0) {
				evens.add(x);
			}
		}
		System.out.println(evens);
		
		List<Integer> evens2 = numbers.stream() // 리스트의 원소들이 흘러가는 통로
				.filter(x -> x % 2 == 0) // 조건을 만족하는 원소들만 필터링
				.toList(); // 필러팅된 겨롸를 리스트로 만듦.
		System.out.println(evens2);
		// filter 메서드의 argument :
		// 파라미터가 1개이고 리턴 타입이 boolean이 FuctionalInterface 객체를 전달.
		
		
		// 리스트 numbers 에서 홀수들의 제곱을 저장하는 리스트를 만들고 출력.
		ArrayList<Integer> oddSquars = new ArrayList<>();
		for (Integer x : numbers) {
			if (x % 2 == 1) {
				oddSquars.add(x * x);				
			}
		}
		System.out.println(oddSquars);
		
		List<Integer> oddSquars2 = numbers.stream() // 리스트의 원소들이 순서댈 지나가는 통로
				.filter(x -> x % 2 == 1) // 조건을 만족하는 원소들만 필터링
				.map(x -> x * x) // 값을 다른 값으로 매핑(변환)
				.toList(); // 결과를 리스트로 저장
		System.out.println(oddSquars2);
		// map 메서드의 argument : 
		// 파라미터가 1개이고, 리턴 값이 있는(void가 아닌) FuctionalInterface 객체.
		
		List<String> languages = Arrays.asList("java" , "SQL", "JavaScript", "Python");
		// 리스트 languages에서 5글자 이상인 문자열을 소문자로 변환한 문자열을 원소로 갖는 리스트를 만들고 출력.
		List<String> result = new ArrayList<>();
		for(String s : languages) {
			if(s.length() >=5) {
				result.add(s.toLowerCase());
			}
		} 
		System.out.println(result);
		
		List<String> result2 = languages.stream().filter(s -> s.length() >= 5).map(s -> s.toLowerCase()).toList();
		System.out.println(result2);
	}

}
