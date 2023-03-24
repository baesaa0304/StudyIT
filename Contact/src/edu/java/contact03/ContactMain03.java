package edu.java.contact03;

import java.util.Scanner;

import edu.java.contact.menu.Menu;

// MVC (Model - View - Controller) 아키텍쳐에서 View에 해당하는 클래스.
// UI (User - Interface)를 담당하는 클래스.
public class ContactMain03 {

	private Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 v0.3 ***");
		
		ContactMain03 app = new ContactMain03();
		// -> contactMain03의 static이 아닌 필드와 메서드를 사용하기 위해서.
		
		boolean run = true;
		while (run) {
			int n = app.ShowMainMenu();
			Menu menu = Menu.getValule(n);
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case CREATE:
				break;
			case READ_ALL:
				break;
			case READ_BY_READ:
				break;
			case UPDATE:
				break;
			case DELETE:
				break;
			default:
				System.out.println("메인 메뉴 번호를 확인하세요....");					
			} 
		}
		System.out.println("*** 프로그램 종료 ***");

	}
	
	public int ShowMainMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println("[0} 종료 [1] 새 연락처 [2] 전체 목록 [3] 검색 [4] 수정 [5] 삭제");
		System.out.println("---------------------------------------------------------------");
		System.out.println("선택> ");
		int n = inputNumber();
		
		return n;
	}

	private int inputNumber() {
		while(true){
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요.> ");
			}
		}
	}

}
