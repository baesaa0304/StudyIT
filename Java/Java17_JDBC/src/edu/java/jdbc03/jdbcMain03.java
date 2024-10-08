package edu.java.jdbc03;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;
public class jdbcMain03 {

	public static void main(String[] args) {
		// TODO update : 
		
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Oracle JDBC 드라이버를 등록.
			DriverManager.registerDriver(new OracleDriver());
			
			
			// 오라클 DB에 접속.
			// update blogs set title = ? , content = ? , modified_time = sysdate
			// where id = ?
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(conn);
			
			// Statement 준비.
			String sql = String.format("update %s set %s = ?, %s = ?, %s = sysdate where %s = ?"
					,TBL_NAME, COL_TITLE, COL_CONTENT, COL_MODIFIED_TIME, COL_ID
					);
			System.out.println(sql);
			
			stmt = conn.prepareStatement(sql);
			
			// SQL 문장의 ? 부분을 채우기 위해서 id, 업데이트할 제목/내용을 입력받음.
			System.out.println("수정할 글 번호 >>>");
			Integer id = Integer.parseInt(scanner.nextLine());
			System.out.println("제목 업데이트 >>>");
			String title = scanner.nextLine();
			System.out.println("내용 업데이트 >>>");
			String content = scanner.nextLine();
			
			// SQL 문장의 ? 부분을 채움.
			stmt.setString(1, title);
			stmt.setString(2, content);
			stmt.setInt(3, id);
			
			// SQL 문장을 DB 서버에 실행.
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 업데이트됐습니다.");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			// 사용했던 리소스들을 생성 순서의 반대로 해제(close).
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
