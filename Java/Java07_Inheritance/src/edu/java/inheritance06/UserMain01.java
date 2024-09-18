package edu.java.inheritance06;

public class UserMain01 {

	public static void main(String[] args) {
		
		
		User user1 = new User();
		
		User user2 = new User(null,null);
		
		User user3 = new User("baesaa0304", "1234");
		System.out.println("user3: " + user3);
		
		User user4 = new User("baesaa0304","0000");
		System.out.println("user4: " + user4);
		


		// equals : 
		
		System.out.println("======연산자: " + (user1 == user2));	
		System.out.println("equals 메서드: " + user1.equals(user2));
		System.out.println("--------------------------------------------");
		
		
		
		
		System.out.println("======연산자: " + (user3 == user4));
		System.out.println("equals 메서드: " + user3.equals(user4));
		System.out.println("--------------------------------------------");
		
		
				
		// hashCode :
		System.out.println("user1 hashCode: " + user1.hashCode());
		System.out.println("user2 hashCode: " + user2.hashCode());
		
		System.out.println("user3 hashCode: " + user3.hashCode());
		System.out.println("user4 hashCode: " + user4.hashCode());
	}

}
