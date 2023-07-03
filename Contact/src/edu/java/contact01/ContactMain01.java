package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	 // 상수(constant)
	private static final int MAX_LENGTH = 5; // 연락처 배열의 최대 길이(원소 개수)
	
	// field
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열.
	private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값 증가.
	private Scanner scanner = new Scanner(System.in); // 입력 도구. 
	
	
	public static void main(String[] args) {
		System.out.println("****연락처 프로그램 V0.1****");
		
		ContactMain01 app = new ContactMain01();
		// -> static이 아닌 메서들을 사용하기 위해서 참조 변수를 생성.
		boolean run =true;
		while(run) {
			// 메인 메뉴 보여주기
			// 메인 메뉴에서 선택된 값
			int menu = app.showMainMenu();
			switch (menu) {
			case 0 : // 프로그램 종료.
				run = false;
				break;
			case 1 : // 새 연락처 저장.
				app.insertNewContact();
				break;
			case 2 : // 연락처 전체 목록 보여주기.
				app.selectAllContact();
				break;
			case 3 : // 배열의 인덱스로 연락처 검색하기.
				app.selectContacttByIndex();
				break;
			case 4 : // 연락처 이름 / 전화번호 /이메일 정보 수정하기.
				app.updateContactIndex();
				break;
			case 5 : // 배열의 인덱스로 연락처 삭제하기.
				app.deleteContactByIndex();
				break;
			default:
				System.out.println("메인 메뉴 번호를 확인하세요...");
			}
		}
		
		System.out.println("****** 프로그램 종료 ******");

	}
	// (1) 새 연락처
	public void insertNewContact() {
		System.out.println();
		System.out.println("----- 새 연락처 저장 -----");		
		if (count == MAX_LENGTH) { // 배열에 저장된 연락처 개수가 배열 길이와 같다면
			System.out.println("연락처 저장 공간이 없습니다.");
			return; // 메서드 종료.
		} 
		
		System.out.print("이름 입력 > ");
		String name = scanner.nextLine(); // 공백을 포함해서 엔터가 입력될 때까지 모든 문자열을 읽음.
		System.out.print("전화번호 입력 > ");		
		String phone = scanner.nextLine();
		System.out.print("이메일 입력 > ");
		String email = scanner.nextLine();					
		// 입력받은 정보들로 Contact 타입의 객체를 생성.
		Contact c = new Contact(0, name, phone, email);
		// 생성된 contact 타입의 객체를 배열에 저장
		contacts[count] = c;
		count++;
		System.out.println("연락처 저장 성공");
		
			
}	
				

	
	// (2) 전체 목록 
	public void selectAllContact() {
		System.out.println();
		System.out.println("------연락처 목록------");
		for (int i = 0; i < count; i++) {
			contacts[i].printInfo();
		}
		
//		if (count == 0) {
//			System.out.println("등록된 연락처가 없습니다.");
//			System.out.println("연락처를 등록해주세요. ");			
//		}else {
//			System.out.println("------전체 연락처--------");
//			for(int i= 0; i < count; i++) {
//				System.out.println("연락처 : " + i +"개");				
//				System.out.printf("이름:%s, 번호:%s, 이메일:%s", contacts[i].getName(),contacts[i].getPhone(), contacts[i].getEmail());	
//			}
//		}		
	}
	
	
	// (3) 검색
	public void selectContacttByIndex() {
		System.out.println();
		System.out.println("------인덱스 검색---------");
		System.out.print("검색할 인덱스 입력> ");
		int index = Integer.parseInt(scanner.nextLine()); 
		contacts[index].printInfo();
		
		if(index >=0 && index < count) {
			contacts[index].printInfo();	
		} else {
			System.out.println("없는 연락처 입니다. 다시 확인해주세요.");
		}
	}
	
//		System.out.println("검색 > ");		
//		if(index >=0 && index < count) {
//			System.out.println();
//			System.out.printf("이름:%s, 번호:%s, 이메일:%s", contacts[].getName(),contacts[].getPhone(), contacts[].getEmail());			
//		} else {
//			System.out.println("없는 연락처 입니다. 다시 확인해주세요.");
//		}			
	
	
	// (4) 수정
	public void updateContactIndex() {
	System.out.println();
	System.out.println("------연락처 수정-----");
	System.out.println("수정할 연락처 인덱스 입력> ");
	int index = Integer.parseInt(scanner.nextLine());
	
	if (index < 0 || index >= count) {
		System.out.println("해당 인덱스에는 연착처 정보 없음...");
		return; //메서드 종료
	}
	System.out.println("수정 전:" );
	contacts[index].printInfo(); //수정 전에 연락처 정보를 출력
	
	System.out.println("수정할 이름 입력> ");
	String name = scanner.nextLine();
	System.out.println("수정할 전화번호 입력> " );
	String phone = scanner.nextLine();
	System.out.println("수정할 이메일 입력> ");
	String email = scanner.nextLine();
	// 수정할 인덱스의 정보를 업데이트
	
	// 두가지 방법중 하나 사용
	contacts[index].setName(name);
	contacts[index].setPhone(phone);
	contacts[index].setEmail(email);	
//	contacts[index] = new Contact(0, name, phone, email);
	
	System.out.print("수정 후");
	contacts[index].printInfo();
	
	}
	
	// (5) 삭제
	public void deleteContactByIndex() {				
		System.out.println();
		System.out.println("------연락처 삭제-------");
		System.out.println("삭제할 연락처 인덱스 입력> ");	
		int index = Integer.parseInt(scanner.nextLine());	
		if (index < 0 || index >= count) {
			System.out.println("해당 인덱스에는 연착처 정보 없음...");
			return; //메서드 종료
		}										
		for(int i = index; i < count-1; i++) { 
			contacts[i] = contacts[i + 1]; // 뒤에 있는 연락처 정보를 한칸 앞으로...
		}
		
		
		contacts[count - 1] = null; // 삭제 전 배열의 마지막 원소를 null 
		count--; // 배열 원소 개수를 1 줄임.
		
		System.out.println("삭제 성공");
		
}
		
	
	public int showMainMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("---------------------------------------------------------");
		System.out.println("선택> ");
		
		// 콘솔 창에서 입력된 문자열 1개 라인은 정수(int)로 변환.		
		int result = Integer.parseInt(scanner.nextLine());
		
		return result;
	}

}
