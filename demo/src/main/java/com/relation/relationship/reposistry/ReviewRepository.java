package com.relation.relationship.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.relationship.model.Review;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
