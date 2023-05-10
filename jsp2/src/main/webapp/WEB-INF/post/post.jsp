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
			<h1>포스트 목록 페이지</h1>
		    </header>
            <nav>
                <ul>
                    <li>
                        <%-- 상대경로에서 현재 폴더(./)의 의미: context.root까지의 주소 --%>
                        <c:url var ="mainPage" value = "/"> </c:url>
                        <a href="${ mainPage }">메인페이지</a>
                    </li>
                    <li>
                        <c:url var ="postCreate" value = "/post/create"></c:url>
                        <a href ="${ postCreate }">새 포스트 작성</a>
                    </li>
                </ul>
            </nav>    
      
        </body>
</html>