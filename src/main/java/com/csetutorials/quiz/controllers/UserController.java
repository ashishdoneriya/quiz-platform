package com.csetutorials.quiz.controllers;

import com.csetutorials.quiz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserRepository repo;

	@GetMapping
	public Object get() {
		return repo.findAll();
	}

}
