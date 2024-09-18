package edu.java.set02;

import java.util.HashSet;

public class SetMain02 {

	public static void main(String[] args) {
		// Integer를 원소로 갖는 HashSet 변수를 선언, 객체 생성
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(100);
		set.add(52);
		System.out.println(set);
		
		// for-each
		for(Integer x: set) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// Iterator
//		Iterable<Integer> itr = set.iterator();
//		while(itr.has) {
//			System.out.println(itr.ne);
//		}

	}

}
