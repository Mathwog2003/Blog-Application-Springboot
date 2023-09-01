package com.application.blog.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<UserEntity,Long> {
}
