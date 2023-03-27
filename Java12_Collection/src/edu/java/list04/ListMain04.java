package edu.java.list04;

import java.util.ArrayList;
import java.util.List;

public class ListMain04 {

	
	public static void main(String[] args) {
		// User 타입을 저장하는 ArrayList 타입 변수 선언, 객체 생성
		ArrayList<User> Users = new ArrayList<>();
		
		// 3 개의 user 객체를 ArrayList에 저장.
		
		// (1) 
		User a = new User();
		Users.add(a);
		
		// (2) 
		User b = new User("baesaa0305" , "125");
		Users.add(b);
		
		// (3)
		Users.add(new User("guest" , "guest"));
		
		
		// ArrayList 내용을 출력.
		System.out.println(Users);
		
		// 리스트 user3에서 인덱스 0번 위치의 원소를 삭제
		Users.remove(0);
		System.out.println(Users);
		
		// id가 "guest"인 user 객체를 리스트에서 삭제
		for(int i = 0; i < Users.size(); i++) {
			if(Users.get(i).getId().equals("guest")) {
				Users.remove(i);
				break;
			}
		}
		
		System.out.println(Users);
		
	}

}
