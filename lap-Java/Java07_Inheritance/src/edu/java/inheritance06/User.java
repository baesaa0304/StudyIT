package edu.java.inheritance06;

import java.util.Objects;

public class User {
	//field
	private String userID;
	private String password;
	
	// 생성자 : (1) 기본 생성자. (2) argument 2개를 갖는 생성자.
	// (1) 
	public User() {
//		this.userID = null;
//		this.password = null; 
		// -> 기본 생성자중 미리 들어있는것
		
		}	
	
	// (2)
	public User(String userID, String password) {
//		super(); USER의 부모클래스를 말하며 자바가 자동으로 불러주기 때문에 생략해도 됨.
		this.userID = userID;
		this.password = password;
	}
	
	// getter & setter 

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// toString() override : "User(userID= ..., password...)"	
	@Override
	public String toString() {		
		// String.format ("User(userID =%s , password=%s)", this.uerID, this.password);
		return "User(userID = " +this.userID + "password = " + this.password + ")";
	}
	
	// equals() override : 두 객체의 userId가 같으면 true; 그렇지 않으면 false.	
    @Override
    public boolean equals(Object obj) {
    	boolean result = false;
    	if(obj instanceof User) {
    	   User other = (User)obj;
    	   if(this.userID != null && this.userID.equals(other.userID)) {
    		   result = true;   
    	   }    	   
    	}
    	return result;
    }
	// hashCode() override
    public int hashCode() {
    	// equals()의 리턴 값이 true이면 hashCode()의 리턴 값이 같아야 함.
    	if(this.userID == null) {
    		return 0;
    	} else {
    		return this.userID.hashCode();	
    	}
    }
}
