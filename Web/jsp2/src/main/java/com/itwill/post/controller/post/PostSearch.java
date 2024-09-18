package com.itwill.post.controller.post;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itwill.post.model.Post;
import com.itwill.post.repository.PostDao;
import com.itwill.post.service.PostService;

/**
 * Servlet implementation class PostSearch
 */
@WebServlet(name = "PostSearch" , urlPatterns = {"/post/search"})
public class PostSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(PostSearch.class);
	
	private final PostService postService = PostService.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String category = request.getParameter("category");
	    String keyword = request.getParameter("keyword");
	    
	    if (category == null || keyword == null) {
	        // category 또는 keyword request parameter가 없는 경우, 에러 처리
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	        return;
	    }
	    // PostService를 사용해서 검색 결과를 가져오는 코드
	    List<Post> result = postService.search(category, keyword);
	    
	    // 검색 결과를 request attribute에 저장
	    request.setAttribute("posts", result);
	    // 결과 페이지로 forward
	    request.getRequestDispatcher("/WEB-INF/post/post.jsp")
	    .forward(request, response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
