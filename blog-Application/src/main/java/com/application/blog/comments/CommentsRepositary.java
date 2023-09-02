package com.application.blog.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepositary extends JpaRepository<CommentsEntity,Long> {
}
