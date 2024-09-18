package edu.java.modifier03;

public class User {
	//field
	private int userNo;
	private String userId;
	private String password;
	
	
	
	
	//agument 3개를 갖는 생성자
	public User(int userNo, String userId, String password) {
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
	}
	
	// getter, setter 메서드
	
	//getter 	
	public int getUserNo() {
		return this.userNo;
	}
	// setter
	public void setUserNo(int userNO) {
		this.userNo = userNO;
	}
	//getter
	public String getUserId() {
		return this.userId;
	}
	//setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//getter
	public String getPassword() {
		return this.password;
	}
	//setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
	
	
	
	
	
	
}
