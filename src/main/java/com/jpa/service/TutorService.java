package com.jpa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jpa.dto.TutorRequestDTO;
import com.jpa.entity.Tutor;

@Component
public interface TutorService {

	Tutor saveTutor(TutorRequestDTO tutorDTO);

	List<Tutor> getAllTutor();

	Tutor getATutor(int id);

	Tutor updateTutor(int id, TutorRequestDTO tutorDto);

	String deleteTutor(int id);

}
