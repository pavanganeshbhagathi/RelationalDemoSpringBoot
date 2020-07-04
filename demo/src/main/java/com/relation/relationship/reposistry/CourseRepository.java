package com.relation.relationship.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.relationship.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
