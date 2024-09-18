package edu.java.jdbc04;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;


public class JdbcMain04 {

	public static void main(String[] args) {
		// 과제 JDBC delete :
		// delete from BLOGS where ID = ? 
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 오라클 드라이버 등록
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("-----");
			// 오라클 DB에 접속
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(conn);
			
			//SQL 문장(statement)을 준비.
			String sql = String.format("delete from %s where %s =?" ,TBL_NAME, COL_ID);
			
			// SQL 문장을 실행할 수 있는 Statement 타입 객체 생성.
			stmt = conn.prepareStatement(sql);
			System.out.println("삭제할 아이디 입력.");
			Integer id = Integer.parseInt(scanner.nextLine());
			
			stmt.setInt(1, id);
			
			// SQL 문장을 DB 서버에 실행.
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삭제됐습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		
		
	}

}
