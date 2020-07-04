package com.relation.relationship.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.relationship.model.Passport;


@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
