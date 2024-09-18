package edu.java.class08;
/**
 * 은행 계좌 클래스.
 * 필드: 계좌번호, 잔액.
 * 메서드: 입금, 출금, 이체, 정보 출력.
 */
public class Account {
	// field
    int accountNo; // 계좌번호
    double balance; // 잔고
    
    // TODO: argument 2개를 갖는 생성자
    public Account(int accountNo,double balance) {
    	this.accountNo = accountNo;
    	this.balance = balance;
    }
    			
    /**
     * 입금(deposit)
     * 
     * @param amount 입금액(double).
     * @return 입금 후 잔액.
     */
    // TODO
    public double deposit(double amount) { 
    	this.balance+=amount;
    	return this.balance;
		
    }
    
    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액(double).
     * @retu전사rn 입금 후 잔액.
     */
    // TODO
    public double withdraw(double amount) {
    	balance-=amount;
    	return this.balance;
    }
    
    /**
     * 이체(transfer).
     * 
     * @param to 이체할 은행 계좌 객체(Account 타입 객체).
     * @param amount 이체할 금액(double).
     * @return true.
     */
    // TODO  
    public boolean transfer(Account to , double amount) { 
    	// 이체 : (1) 내 계좌에 출금, (2) 다른 계좌 입금.
//    	this.balance-=amount; // (1) 
//    	to.balance+=amount; // (2)
    	this.withdraw(amount);
    	to.deposit(amount);
    	
    	
    	return true;
    	
    		
    }
    
    /**
     * 정보 출력(printInfo).
     * 계좌 번호와 잔고를 출력.
     */
    //TODO
    public void printInfo() {
    	System.out.printf("계좌정보(번호: %d, 잔액: %f)\n", this.accountNo, this.balance);
//    	System.out.println("계죄번호: "+ this.accountNo);
//    	System.out.println("잔액: "+ this. balance);
    }
}
