package com.itwill.spring3.repository.reply;

import com.itwill.spring3.dto.PostUpdateDto;
import com.itwill.spring3.dto.reply.ReplyUpdateDto;
import com.itwill.spring3.repository.BaseTimeEntity;
import com.itwill.spring3.repository.post.Post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
@ToString(exclude = {"post"})
@Entity
@Table(name = "REPLIES")
@SequenceGenerator(name = "REPLIES_SEQ_GEN", sequenceName = "REPLIES_SEQ", allocationSize = 1)
public class Reply extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REPLIES_SEQ_GEN")
    private Long id; // primary Key
    
    
    //-> 여러 개 (Many)의 댓글이 한 개 (one)의 포스트에 달려 있을 수 있음.
    // post 한개에 reply 댓글이 여러개 달림 // to를 기준으로 앞에는 클래스 기준 ex) reply 여러개 Post 한개 ManyToOne 반대면 OnetoMany
    
    @ManyToOne(fetch = FetchType.LAZY) // EAGER(기본값): 즉시로딩,  LAZY : 지연로딩
    private Post post; // Foreign key , 관계를 맺고 있는 엔터티.
    
    // 제약조건 줌 NOT NULL
    @Column(nullable = false) 
    private String replyText; // 댓글 내용
    
    @Column(nullable = false)
    private String writer; // 댓글 작성자
   
    
    // 댓글 수정
    public Reply update(String replyText) {
        this.replyText = replyText;
      
        return this;
    }
}
