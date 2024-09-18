package com.itwill.spring3.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.spring3.dto.PostCreateDto;
import com.itwill.spring3.dto.PostSearchDto;
import com.itwill.spring3.dto.PostUpdateDto;
import com.itwill.spring3.repository.post.Post;
import com.itwill.spring3.repository.post.PostRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {
    // 생성자를 사용한 의존성 주입:
    private final PostRepository postRepository;
    
    
    /**
     * 리스트
     *
     */
    // DB POTS 테이블에서 전체 검색한 결과를 리턴
    @Transactional(readOnly = true)
    public List<Post> read(){
        log.info("read()");
        
        return postRepository.findByOrderByIdDesc();
    }
    
    /**
     * 새 포스트 작성
     * @param 작성하기  DTO
     */
    // DB POSTS 테이블에 엔터티를 삽입(insert):
    public Post create(PostCreateDto dto) {
        log.info("create(dto={}" , dto);
        
        // DTO를 엔더티로 변환
        Post entity = dto.toEntity();
        log.info("entity={}" , entity);
        
        // DB 테이블에 저장
        postRepository.save(entity);
        log.info("entity={}" , entity);
        
        return entity;
        
    }
    
    /**
     * 상세보기
     * @param 포스트 ID
     */
    
    @Transactional(readOnly = true)
    public Post read(Long id) {
        log.info("read(id={})" , id);
        // 그 리스트들 중 포스트 ID 값을 찾는 값을 리턴
        return postRepository.findById(id).orElseThrow();
    }
    
    /**
     * 삭제하기
     * @param 포스트 ID 
     */
    public void delete(Long id) {
       log.info("delete{}" , id);
       // 포스트 아이디를 잦아서 삭제를 함 deleteById는 void 값임
       postRepository.deleteById(id);
        
    }
    
    /**
     * 수정하기 
     * @param 포스트 ID 그리고 DTO
     */
    /*
     * public Post update(PostUpdateDto dto, Long id) { // 상세 페이지에서 그 ID값을 찾음 Post
     * entity = postRepository.findById(id).orElseThrow();
     * log.info("update POST (dto={} , id={})" , dto , id);
     * 
     * // DTO 엔티티를 업데이트 entity.update(dto); log.info("entity={}" , entity);
     * 
     * // DTO 엔티티를 변경 내용을 저장함 postRepository.saveAndFlush(entity);
     * log.info("entity={}" , entity);
     * 
     * 
     * return entity; }
     */
    
    
    
    
    @Transactional // (1)
    public void update(PostUpdateDto dto) {
        log.info("update(dto={})" , dto);
        
        // (1) 메서드에 @Transactional 애너테이션을 설정하고, 
        // (2) DB에서 entity를 검색하고 
        // (3)검색한 엔더티를 수정하면,
        // 트랙잭션이 끝나는 시점에 DB 업데이트가 자동으로 수행됨!
        
        Post entity = postRepository.findById(dto.getId()).orElseThrow(); // (2)
        
        entity.update(dto); //(3)
        
    }
    
    @Transactional(readOnly = true)
    public List<Post> search(PostSearchDto dto){
        log.info("search(dto={})" , dto);
        List<Post> list = null;
        switch (dto.getType()) {
        case "t":
            list= postRepository.findByTitleContainsIgnoreCaseOrderByIdDesc(dto.getKeyword());
            break;
        case "c":
            list = postRepository.findByContentContainsIgnoreCaseOrderByIdDesc(dto.getKeyword());
            break;
        case "tc":
            list= postRepository.searchBykeyword(dto.getKeyword());
            break;
        case "a":
            list = postRepository.findByAuthorContainsIgnoreCaseOrderByIdDesc(dto.getKeyword());
            break;
        }
        
        return list;
    }
    
    
    
}
