<%@page import="com.itwill.post.repository.PostDao"%>
<%@page import="com.itwill.post.model.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
    <head>
            <meta charset="UTF-8">
            <title>POST</title>
    </head>
        <body>
            <header>
                 <h1>포스트 수정 페이지</h1>
            </header>
            <nav>
                <li>
                    <c:url var ="mainPage" value = "/"></c:url>
                    <a href = "${ mainPage }">메인 페이지</a>
                </li>
                <li>
                    <c:url var ="postPage" value = "/post"></c:url>
                    <a href = "${postPage}">포스트 목록 페이지</a>
                </li>
            </nav>
            <main>
                
                <c:url value= "/post/detail" var= "postUpdate"/>
                <form action = "${ postUpdate }" method="post">
                    <input type="hidden" name="id" value="${post.id}" /> <!-- 수정할 포스트의 ID값을 hidden으로 전달 -->
                    <div>
                        <input type= "text" name= "title" placeholder= "제목 입력" value="${post.title}"
                        required autofocus />
                    </div>
                    <div>
                        <textarea rows= "S" cols= "80" name="content" placeholder= "내용 입력"
                        required>${post.content}</textarea>
                        
                    </div>
                    <div>
                        <input type= "text" name="author" placeholder="아이디 입력" value="${post.author}"/>
 
                    </div>
                    <div>
                        <input type= "submit"  value= "수정완료"/>
                    </div>
                </form>
            </main>
        </body>
</html>
