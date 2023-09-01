package com.application.blog.comments;


import com.application.blog.article.ArticleEntity;
import com.application.blog.user.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class CommentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    @NonNull
    private String body;
    @CreatedDate
    private Date createdAt;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private ArticleEntity articleEntity;
}
