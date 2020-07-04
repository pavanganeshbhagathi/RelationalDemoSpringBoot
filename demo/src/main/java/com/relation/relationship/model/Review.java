package com.relation.relationship.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Review {

	
	@Id
	@GeneratedValue
	private Long id;

	

	private String description;

	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Course course;
}
