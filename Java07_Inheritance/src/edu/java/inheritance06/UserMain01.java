package edu.java.inheritance06;

public class UserMain01 {

	public static void main(String[] args) {
		User user1 = new User();
		
		User user3 = new User(null, null);
	
		System.out.println("아이디: " + (user1 == user3));
	
		System.out.println("equals 아이디: " + user1.equals(user3));
		System.out.println();
		
		
		
		
		
		
		System.out.println("equals 메서드: " + user1.equals(user3));
		System.out.println("user1 hashCode: " + user1.hashCide());
		System.out.println("user1 hashCode: " + user3.hashCide());
	}

}
