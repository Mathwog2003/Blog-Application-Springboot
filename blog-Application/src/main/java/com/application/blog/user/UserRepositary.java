package com.application.blog.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
}
