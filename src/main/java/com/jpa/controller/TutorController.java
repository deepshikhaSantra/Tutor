package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.TutorRequestDTO;
import com.jpa.entity.Tutor;
import com.jpa.service.TutorService;

import jakarta.validation.Valid;

@RestController
public class TutorController {
	@Autowired
	private TutorService tutorservice;

	// Gett all the tutor
	@GetMapping("/tut")
	public List<Tutor> returnAll() {
		return tutorservice.getAllTutor();
	}

	// Create a tutor
	@PostMapping("/tut")
	public ResponseEntity<Tutor> createNewTutor(@RequestBody @Valid TutorRequestDTO tutorDTO) {
		return new ResponseEntity<>(tutorservice.saveTutor(tutorDTO), HttpStatus.CREATED);

	}

	// Get a the tutor
	@GetMapping("/tut/{id}")
	public Tutor returnATutor(@PathVariable int id) {
		return tutorservice.getATutor(id);
	}

//update a tutor
	@PutMapping("/tut/{id}")
	public ResponseEntity<Tutor> updateTutor(@PathVariable int id, @RequestBody @Valid TutorRequestDTO tutorDTO) {
		return new ResponseEntity<>(tutorservice.updateTutor(id, tutorDTO), HttpStatus.CREATED);

	}

//delete a tutor
	@DeleteMapping("/tut/{id}")
	public String deleteTutor(int id) {
		return tutorservice.deleteTutor(id);
	}
}
