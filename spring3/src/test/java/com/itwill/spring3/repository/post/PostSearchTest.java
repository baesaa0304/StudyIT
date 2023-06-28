package com.itwill.spring3.repository.post;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PostSearchTest {
    
    @Autowired
    private  PostRepository postRepository;
    
    @Test
    public void testSearch() {
        // List<Post> list = postRepository.findByTitleContainsIgnoreCaseOrderByIdDesc("JPA"); // 제목
        // List<Post> list = postRepository.findByContentContainsIgnoreCaseOrderByIdDesc("양"); // 내용
        // List<Post> list = postRepository.findByAuthorContainsIgnoreCaseOrderByIdDesc("admin"); // 작성자
        // List<Post> list = postRepository.findByTitleContainsIgnoreCaseOrContentContainsIgnoreCaseOrderByIdDesc("JP", "양"); // 제목 or 내용
        List<Post> list = postRepository.searchBykeyword("양"); // 제목 내용 검색 
        for(Post p : list) {
            log.info(p.toString());
        }
    }
    
}
