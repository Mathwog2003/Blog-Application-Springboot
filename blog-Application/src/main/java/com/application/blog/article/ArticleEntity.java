package com.application.blog.article;


import com.application.blog.user.UserEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name="users")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable=false)
    @NonNull
    private Long id;
    @Column(nullable=false)
    @NonNull
    private String title;
    @Column(nullable=false,unique = true)
    @NonNull
    private String slug;
    @Nullable
    private String subtitle;
    @Nullable
    private String body;
    @CreatedDate
    private Date createAt;

//    Todo: tags
    @ManyToOne
    @JoinColumn(name = "authorId")
    private UserEntity userEntity;

}
