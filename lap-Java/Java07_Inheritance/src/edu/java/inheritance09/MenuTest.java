package edu.java.inheritance09;

import java.util.Scanner;

enum Menu{
	// enum 열거형 상수 선언
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKONWN;
	
	/*
	 * 정수가 입력되면, 그 정수에 해당하는 열거형 상수를 리턴.
	 * 0 -> QUIT, 1-> CREAT, 2 -> READ_ALL, 3 -> READ_BY_INDEX, 
	 * 4 -> UPOATE, 5 -> DELETE, ) 그 이외의 정수들인 경우에는 UNKONWN을 리턴.
	 * @para n 정수(int)
	 * @return Menu 타입의 열거형 상수.
	 */
	
 	
	public static Menu getValue(int n) {					
		Menu[] menu = values();
		int len = menu.length;
		if (n >= 0 && n < len) {
			return menu[n];
		} else {
			return menu[len - 1]; // return UNKONWN
		}
		
//		if(n < 6 && n >= 0) {
//			Menu[] menu = values(); //== Menu.values();
//			return menu[n];
//		}
//		Menu[] menu = Menu.values();
//		return menu[6];
//		}	
		
	
   }
}

//--------------------------------------------


public class MenuTest {
			
	

	public static void main(String[] args) {		
		Singleton s =Singleton.INSTANCE;
		// -> enum 타입이 열거형 상수르 1개만 가지고 있으면,
		// 그 enum 타입의 할당할 수 있는 객체는 오직 1개만 있게 됨.
		//-> 싱글톤 객체
		
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		
		//Menu m = Menu.QUIT;
		Menu menu = Menu.getValue(n); // 정수를 int를 전달하면 Menu에 상수들 중 하나를 리턴.
		
		
		switch (menu) {
		case QUIT :
			System.out.println(menu.name());
			break;
		case CREATE:
			System.out.println(menu.name());
			break;
		case READ_ALL:
			System.out.println(menu.name());
			break;
		case READ_BY_INDEX:
			System.out.println(menu.name());
			break;
		case UPDATE:
			System.out.println(menu.name());
			break;
		case DELETE:
			System.out.println(menu.name());
			break;
		case UNKONWN:
			System.out.println(menu.name());
			break;
//		default :
//			System.out.println(menu.name()); == UNKONWM;
		}		
	 }
  }

