package com.itwill.post.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.itwill.post.model.Post;

import oracle.jdbc.OracleDriver;



// java Test(자바 단위 테스트)를 하기 위한 클래스.
// JDBC(Java Database Connectivity) 테스트 - ojdbc11 라이브러리 동작 여부 테스트.
// Main 메서드를 만들지 않고 테스트 메서드를 작성하면,
// junit-jupiter-engine에서 테스트 메서드를 실행함.

@TestMethodOrder(OrderAnnotation.class) // test 메서드 실행 순서를 에너테이션으로 설정함.
public class JdbcTest {
    
    // Oracle 데이터베이스 접속 주소
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    // 데이터 베이스 접속 계정
    private static final String USER = "scott";
    // 데이터베이스 접속 비밀번호
    private static final String PASSWORD = "tiger";
    
    // 테스트 메서드 작성:
    // (0) @Test 애네테이션 사용.
    // (1) 가시성: public (2) 리턴타입 : void (3) 파라미터를 갖지 않음.
    // 테스트 성공/실패 여부는 테스트 메서드 작성자가 설정.
    
    
    
    @Test // 테스트 메서드
    @Order(2) // 2번째로 실행할 메서드
    public void testSelect() throws SQLException {
        // 1. JDBC 라이브러리를 DriverManager에 등록.
        DriverManager.registerDriver(new OracleDriver());
//        System.out.println("JDBC 드라이버 등록 성공2");
        
     // 2. 등록된 JDBC 드라이버를 사용해서 데이터베이스 서버에 접속.
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Assertions.assertNotNull(conn);
     
     // -> conn이 null이 아니면 테스트 성공, 그렇지 않으면 테스트 실패. 
//        System.out.println("conn2" + conn);
        
    // TOOD : posts 테이블의 전체 내용을 검색(select)하고
        // ArrayList<post>를 생성하고 
        // 그 결과를 콘솔창에 출력.
        // arrayList<post>의 원소 개수는 1개임을 주장.
       
   
       String sql = "select * from posts";
      
       PreparedStatement stmt = conn.prepareStatement(sql);
       ResultSet rs = stmt.executeQuery();
     
       ArrayList<Post> list = new ArrayList<>();
       while (rs.next()) {
           Integer cid = rs.getInt("ID");
           String title = rs.getString("TITLE");
           String content = rs.getString("CONTENT");
           String author = rs.getString("AUTHOR");
           LocalDateTime createdTime = rs.getTimestamp("CREATED_TIME").toLocalDateTime();
           LocalDateTime modiDateTime = rs.getTimestamp("MODIFIED_TIME").toLocalDateTime();
           
           Post post = new Post(cid, title, content, author, createdTime, modiDateTime);
           System.out.println(post);
           list.add(post);
       }
       
       Assertions.assertEquals(2, list.size());
               
   
      
        
    // 데이터베이스와 연결된 접속을 해제.
    // 사용했단 리소스 해제 - 생성된 순서와 반대로 close 호출.
       rs.close();
       stmt.close();
       conn.close();
       
        
    }
    
    @Test // JUnit 엔진에서 호출할 테스트 메서드
    @Order(1) // 첫번째로 실행할 테스트 메서드.
    public void testInsert() throws SQLException {
        // Driver 등록 -> Connection -> preparedStaement - >execute -> 결과처리 -> 리소스
        DriverManager.registerDriver(new OracleDriver());
        System.out.println("JDBC 드라이버 등록 성공1");
        
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Assertions.assertNotNull(conn);
        System.out.println("conn1" + conn);
        
        // SQl Insert
        String sql = "insert into POSTS (TITLE, CONTENT, AUTHOR) values (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql); 
       
        
        stmt.setString(1, "제목 테스트");
        stmt.setString(2, "내용 테스트");
        stmt.setString(3, "작성자 테스트");
        
        int result = stmt.executeUpdate();
        
        Assertions.assertEquals(1, result);
        
        stmt.close();
        conn.close();
        System.out.println("연결 해제 성공1.");
        
    }
    
    
    
    
    
    
}
