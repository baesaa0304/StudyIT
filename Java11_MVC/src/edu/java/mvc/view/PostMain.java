package edu.java.mvc.view;

import java.time.LocalDateTime;
import java.util.Scanner;

import edu.java.mvc.controller.PostDaoImpl;
import edu.java.mvc.menu.Menu;
import edu.java.mvc.model.Post;


public class PostMain {
	private final Scanner scanner = new Scanner(System.in);
	private final PostDaoImpl dao = PostDaoImpl.getInstance();
	
	
	
	public static void main(String[] args) {
		System.out.println("****블로그 프로그램****");
		PostMain vlog = new PostMain();
		// Static 이 아닌 필드와 메서드를 사용하기 위해서
		
		boolean run = true;
		while(run) {
			int n = vlog.ShowvMainMenu();
			Menu menu = Menu.getValue(n);
			switch(menu) {
			case QUIT :
				run = false;
				break;
			case CREATE:
				vlog.insertNewContact();
				break;
			case READ_ALL:
				vlog.selectAllContacts();
				break;
			case READ_BY_INDEX:
				vlog.selectContactByIndex();
				break;
			case UPDATE:
				vlog.updateContact();
				break;
			case DELETE:
				 vlog.deleteContact();
				break;
			case UNKNOWN:
				System.out.println("번호를 제대로 확인하세요...");
				break;
			}
						
		}
		System.out.println("*** 종료 ***");

		
		
		
	}

	
	
	private void deleteContact() {
		System.out.println("\n-----블로그 삭제-------");
		System.out.print("삭제할 블로그 인덱스 입력> ");
		int index = inputNumber();
		
		if(!dao.isValidIndex(index)) {
			System.out.println(">>> 해당 인덱스에는 블로그 정보가 없습니다.");
			return;
		}
		
		int result = dao.delete(index);
		if(result == 1) {
			System.out.println(">>> 블로그 삭제 성공");
		} else {
			System.out.println(">>> 블로그 삭제 실패");
		}
	}



	private void updateContact() {
		System.out.println("\n----블로그 업데이트----");
		System.out.print("수정할 블로그 인덱스 입력> ");
		int index = inputNumber();
		
		if (!dao.isValidIndex(index)) {
			System.out.println(">>> 해당 인덱스에는 블로그 정보가 없습니다.");
			return;
		}
		
		Post before = dao.read(index);
		System.out.println(">>> 수정 전: " + before);
		
		System.out.println("제목입력> ");
		String title = scanner.nextLine();
		System.out.println("내용입력> ");
		String content = scanner.nextLine();
		System.out.println("작성자입력> ");
		String author = scanner.nextLine();
	
		Post after = new Post(0, title, content, author, null, null);
		
		System.out.println("Time:  "  );
		int result = dao.update(index, after);
		if(result == 1) {
			System.out.println(">>> 블로그 업데이트 완료");
		} else {
			System.out.println(">>> 블로그 업데이트 실패");
		}
		
	}



	private void selectContactByIndex() {
		System.out.println("\n-----블로그 검색-------");
		System.out.print("검색할 블로그 인덱스 입력> ");
		int index = inputNumber();
		
		Post post = dao.read(index);
		
		if(post != null) {
			System.out.println(post);
		} else {
			System.out.println("해당 인덱스에는 블로그 정보가 없습니다.");
		}
		
	}



	private void selectAllContacts() {
		System.out.println("\n-------블로그 전체 목록------");
		
		Post[] post = dao.read();
		
		for (Post c : post) {
			System.out.println(c);
		}
		System.out.println("------------------------------");
		
	}



	private void insertNewContact() {
		System.out.println("\n------새 블로그 저장------");
		
		if(!dao.isMemoryAvailable()) {
			System.out.println(">>>>>블로그 저장 공간이 없습니다.");
			return;
		}
		System.out.println("제목입력> ");
		String title = scanner.nextLine();
		System.out.println("내용입력> ");
		String content = scanner.nextLine();
		System.out.println("작성자입력> ");
		String author = scanner.nextLine();
		
		Post post = new Post(0, title, content, author, null , null);
		
		int result = dao.creat(post);
		
		if(result == 1) {
			System.out.println("새 블로그 저장 성공");			
		} else {
			System.out.println("새 블로그 저장 실패");
		}
	}



	private int ShowvMainMenu() {
		System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("[0]종료 [1]새 블로그 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
        System.out.println("------------------------------------------------------------");
        System.out.print("선택> ");
        int n = inputNumber();
        
        return n;
	}

	private int inputNumber() {
	        while (true) {
	            try {
	                int n = Integer.parseInt(scanner.nextLine());
	                return n;
	                
	            } catch (NumberFormatException e) {
	                System.out.print("정수 입력>> ");
	            }
	        }
	    }

}
