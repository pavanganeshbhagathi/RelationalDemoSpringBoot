package com.relation.relationship.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.relationship.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
