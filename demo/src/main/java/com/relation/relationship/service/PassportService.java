package com.relation.relationship.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relation.relationship.model.Passport;
import com.relation.relationship.reposistry.PassportRepository;

@Service
public class PassportService {

	@Autowired
	private EntityManager entityManger;
	
	@Autowired
	private PassportRepository passportRepo;
	
	
	public Passport savingData(Passport pass)
	{
		
		
		Passport save = passportRepo.save(pass);
		return  save ;
	}
}
