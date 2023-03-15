package edu.java.class08;

public class ClassMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account aco1 = new Account(843101, 10000); //계좌 생성
		aco1.printInfo(); // 계좌 정보 출력
		
		 double balance = aco1.deposit(1000); // 1,000원 입금
		 System.out.println("balance = " + balance);
		 aco1.printInfo();
		 
		 aco1.withdraw(5000); // 5000원 출금
		 aco1.printInfo();
		 
		 Account aco2 = new Account(123000 , 10000); // 2번째 계좌 생성
		 aco2.printInfo();
		 
		 aco1.transfer(aco2, 5000); //aco1 계좌에서 aco2 계좌로 5000원 이체.
		 aco1.printInfo();
		 aco2.printInfo();
	}

}
