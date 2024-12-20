package edu.java.inheritance04;

public class InheritanceMain04 {

	public static void main(String[] args) {
		// 다향성과 타입 변환(casting) 연산자
		// 다향성 : SuperType var = new SunType();
		Parent ch1 = new Child();
		ch1.testParent();
		// -> 실제 생성된 객체는 Child 타입이지만, 변수 선언이 Parent 타입으로 되어 있어서
		// -> Parent 타입에서 정의된 메서드들만 보이고 사용할 수 있음.
		
		((Child)ch1).testChild(); 
		// -> Parent 타입으로 선언된 변수를 Child 타입으로 강제  타입 변환(casting)을 하면
	   // Child 타입에서 정의된 메서드들도 보이고 사용할 수 있음.
		//((child)ch2).testChild();
		// -> 문법 오류는 발생하지 않지만,
		// Child와 AnotherChild는 서로 casting 할 수 없는 타입이기 떄문에 실행 중에 에러가 발생
		// instanceof 연산자 : 변수 instanceof 클래스 이름.
		// 변수 클래스 타입의 인스턴스이면 true, 그렇지 않으면 false.
						
		

	}

}

class Parent{
	public void testParent() {
		System.out.println("I am your father!");
	}
}
class Child extends Parent{
	public void testChild() {
		System.out.println("Child");
	}
}

class AnotherChild extends Parent {
	public void testAnotherChild() {
		System.out.println("another child");
	}
}