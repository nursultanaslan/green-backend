package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
