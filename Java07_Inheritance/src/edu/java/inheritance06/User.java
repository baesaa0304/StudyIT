package edu.java.inheritance06;

import java.util.Objects;

public class User {
	//field
	private String userID;
	private String password;
	
	// 생성자 : (1) 기본 생성자. (2) argument 2개를 갖는 생성자.
	// (1) 
	public User() {}
	
	// (2)
	public User(String userID, String password) {
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
		return "User(userID = " +this.userID + "password = " + this.password + ")";
	}
	
	// equals() override : 두 객체의 userId가 같으면 true; 그렇지 않으면 false.	
    @Override
    public boolean equals(Object obj) {
    	boolean result = false;
    	if(obj instanceof User) {
    	   User other = (User)obj;
    	   result =(this.userID == other.userID);
    	}
    	return result;
    }
	// hashCode() override
    public int hashCide() {
    return Objects.hash(this.userID);
    }
}
