package edu.java.map03;

import java.util.HashMap;
import java.util.Set;



public class MapMain03 {

	public static void main(String[] args) {
		// 단어 개수 세기(word counting):
        // 문자열에 등장하는 단어를 key로 하고, 그 단어의 등자 횟수를 value로 하는 Map을 만들고 출력하세요.
        // 결과> {하늘=3, 땅=2, sky=2}
		HashMap<String, Integer> sentences = new HashMap<>();
		String sentence = ("하늘 땅 하늘 땅 하늘 sky sky");
		String[]words = sentence.split(" ");
		
		// 단어(key)- 빈도수(value) 저장하는 Map 변수를 선언, 초기화(객체 생성)
		HashMap<String, Integer> wordCounts = new HashMap<>();
		
		for(String s : words) { //배열의 첫번째 원소부터 마지막 원소까지 순서대로 반복하면서
//			System.out.println(s); 
			Integer count = wordCounts.get(s); // 배열의 단어 w에 매핑된 값(빈돗수)를 찾음
			if (count == null) { // 단어에 매핑된 빈돗수가 없을 때
				wordCounts.put(s, 1);
			}else { // 단어에 매핑된 빈돗수가 있을 때
				wordCounts.put(s, count + 1);
			}
			System.out.println(wordCounts);
	}
        
		
		HashMap<String, Integer> wordCount2 = new HashMap<>();
		for(String s : words) {
		Integer count = wordCount2.getOrDefault(s, 0);
		wordCount2.put(s, count + 1);
		}
       System.out.println(wordCount2);
       
        
     
        
	}

}
