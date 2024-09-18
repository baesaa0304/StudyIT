package edu.java.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random random = new Random();
        int computer = random.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.print("선택>>>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print(computer : user)
        System.out.println("computer(" + computer + ") : user(" + user + ")");

        // TODO: 누가 이겼는 지 결과를 출력하세요.
        
        if(computer == user) {	//컴퓨터랑 유저가 같은걸 냈을때
        	System.out.println("Computer가 User를 비겼습니다");
        } else if(computer != user) {
        	if(computer > user) {
        		if (computer == 2) { // 컴퓨터가 보자기를 냈을때
        	    	
        			System.out.println("Computer가 User에게 졌습니다");
        			
        		} else System.out.println("Computer가 User를 이겼습니다");
        	} else {
        		if (user == 2) { // 유저가 보자기를 냈을때
        	    	
        			System.out.println("User가 Computer에게 졌습니다");
        			
        		} else System.out.println("User가 Computer를 이겼습니다");
        	}
        	
        	
        	
       
        	
        }
        
        

	}
	
	

}
