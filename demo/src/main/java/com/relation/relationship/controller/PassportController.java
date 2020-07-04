package com.relation.relationship.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relation.relationship.model.Passport;
import com.relation.relationship.reposistry.PassportRepository;
import com.relation.relationship.service.PassportService;

@RestController
@RequestMapping(path="/passport")
public class PassportController {

	
	@Autowired
	private PassportService passportservice;
	

	
	@PostMapping("/create")
	public ResponseEntity<Passport> InsertPassport(@Valid @RequestBody Passport pass)
	{
		 Passport savingData = passportservice.savingData(pass);
		return new ResponseEntity<Passport>(savingData, HttpStatus.CREATED);
	}
	//here try one get method for display the data okay sir
	
	
	@GetMapping(path="/getPassport")
	public ResponseEntity<List<Passport>> getData()
	{
		
		List<Passport> dataPassport = passportservice.getDataPassport();
		
	   return new ResponseEntity<List<Passport>>(dataPassport, HttpStatus.OK);
	}
}
