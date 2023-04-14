package edu.java.contact.ojdbc;

public interface OracleConnect {
	// Oracle DB 접속 URL
	String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	// Oracle DB 접속 계정
	String USER = "scott";
	// Oracle 접속 계정 비밀번호
	String PASSWORD = "tiger";
}
