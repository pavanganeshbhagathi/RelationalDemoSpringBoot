package com.relation.relationship.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relation.relationship.model.Passport;
import com.relation.relationship.service.PassportService;

@RestController
@RequestMapping(path="/passport")
public class PassportController {

	
	@Autowired
	private PassportService passportservice;
	
	@PostMapping()
	public ResponseEntity<Passport> InsertPassport(@Valid @RequestBody Passport pass)
	{
		
		 Passport savingData = passportservice.savingData(pass);
		return new ResponseEntity<Passport>(savingData, HttpStatus.CREATED);
	}
}
