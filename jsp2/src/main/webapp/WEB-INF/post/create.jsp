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
			     <h1>새 포스트 작성 페이지</h1>
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
		</body>
</html>