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
import com.itwill.post.service.PostService;

/**
 * Servlet implementation class postModify
 */

@WebServlet(name = "postModify", urlPatterns = {"/post/modify"})
public class postModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(postModify.class);
	
	private final PostService postService = PostService.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("doGet()");
		
		// 수정할 포스트 번호를 요청 파라미터에서 찾음.
		long id =Long.parseLong(request.getParameter("id"));
		log.info("id = {}" , id);
		
		Post post = postService.getPostById(id);
		
		// 포스트 객체를 request 속성으로 설정.
		request.setAttribute("post", post);
		
		// 뷰로 포워드
		request.getRequestDispatcher("/WEB-INF/post/modify.jsp")
		.forward(request, response);
	}

}
