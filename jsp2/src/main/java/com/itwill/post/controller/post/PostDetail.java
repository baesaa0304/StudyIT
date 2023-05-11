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
	    // 수정할 포스트 ID를 파라미터로 전달받음
        Long postId = Long.parseLong(request.getParameter("id"));
        
        // 데이터베이스에서 해당 ID에 해당하는 포스트 정보 조회
        Post post = postService.getPostById(postId);
        
        // 조회된 포스트 정보를 request 객체에 저장하여 JSP로 전달
        request.setAttribute("post", post);
		request.getRequestDispatcher("/WEB-INF/post/detail.jsp")
		.forward(request, response);

	}
	

}
