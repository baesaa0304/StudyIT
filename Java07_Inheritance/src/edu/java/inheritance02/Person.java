package edu.java.inheritance02;

public class Person {
	// field
	private String name; //기본생성자시 null로 초기화
	
	
	// constructor
	public Person() {
		System.out.println("Person() 생성자 호출.");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person(name) 생성자 호출.");
	}

	
	// method	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
