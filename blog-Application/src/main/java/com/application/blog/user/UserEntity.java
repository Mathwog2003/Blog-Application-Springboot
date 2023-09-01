package com.application.blog.user;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    @NonNull
    private String username;
//    @Column(nullable = false)
//    @NonNull
//    private String password;
    @Column(nullable = false)
    @NonNull
    private String email;
    @Column(nullable = true)
    @Nullable
    private String bio;
    @Column(nullable = true)
    @Nullable
    private String image;


}
