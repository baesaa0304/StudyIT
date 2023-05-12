package com.itwill.post.controller.post;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itwill.post.model.Post;
import com.itwill.post.repository.PostDao;
import com.itwill.post.service.PostService;

/**
 * Servlet implementation class PostDetail
 */
@WebServlet(name ="postDetail", urlPatterns = {"/post/detail"})
public class PostDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(PostDetail.class);
	
	private static PostService postService = PostService.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException {
	        log.info("doGet()");
	    
	    
	    // 요청 URL의 쿼리스트링에 포함된 요청 파라미터 id(포스트 번호, pk) 값을 찾음.
	    // 수정할 포스트 ID를 파라미터로 전달받음
        Long postId = Long.parseLong(request.getParameter("id"));
        log.info("postId = {}", postId);
        
        
        // 강사님 코드
        // String id = request.getParameter(id) // getterParameter는 문자열만 리턴.
        // long id = Long.parseLong(param); // Id는 숫자 타입이어야 하기 때문에 문자열을 숫자로 변환
        // log.info("id = {}" . id);
        
        
        
        // DB에 화면에 보여줄 포스트 내용을 검색
        // 데이터베이스에서 해당 ID에 해당하는 포스트 정보 조회
        Post post = postService.getPostById(postId);
        
        
        // 뷰 (JSP)에 전달
        // 조회된 포스트 정보를 request 객체에 저장하여 JSP로 전달
        request.setAttribute("post", post);
		request.getRequestDispatcher("/WEB-INF/post/detail.jsp")
		.forward(request, response);

	}
	

}
