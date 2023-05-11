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
            <main>
                <table>
                    <thead>
                        <tr>
                            <th>번호</th>
                            <th>제목</th>
                            <th>작성자</th>
                            <th>수정 시간</th>
                        </tr>
                       <tboday>
                            <c:forEach items="${posts}" var= "post" >
                            <tr>
                                <td>${post.id}</td>                             
                                <td>
                                    <c:url value ="/post/detail" var ="postDetail">
                                        <c:param name="id" value="${ post.id }"></c:param>
                                    </c:url>
                                    <a href ="${ postDetail}">${post.title}</a>
                                </td>
                                <td>${post.author }</td>
                                <td>${post.modiDateTime}</td>
                            </tr>
                            </c:forEach>
                       </tboday> 
                    </thead>
                </table>
            </main>    
      
        </body>
</html>