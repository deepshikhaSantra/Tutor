package com.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dto.TutorRequestDTO;
import com.jpa.entity.Tutor;
import com.jpa.repository.TutorialRepositary;
import com.jpa.service.TutorService;

@Service
public class TutorServiceImpl implements TutorService {

	@Autowired
	private TutorialRepositary tutorialrepositary;

	@Override
	public Tutor saveTutor(TutorRequestDTO tutorDTO) {
		Tutor tutor = Tutor.builder().tittle(tutorDTO.getTittle()).description(tutorDTO.getDescription())
				.published(tutorDTO.getPublished()).build();

		return tutorialrepositary.save(tutor);

	}

	@Override
	public List<Tutor> getAllTutor() {

		return tutorialrepositary.findAll();

	}

	@Override
	public Tutor getATutor(int id) {

		return tutorialrepositary.findById(id).get();
	}

	@Override
	public Tutor updateTutor(int id, TutorRequestDTO tutorDTO) {

		Tutor t = tutorialrepositary.findById(id).get();
		t.setTittle(tutorDTO.getTittle());
		t.setDescription(tutorDTO.getDescription());
		t.setPublished(tutorDTO.getPublished());
		Tutor tutor = Tutor.builder().tittle(tutorDTO.getTittle()).description(tutorDTO.getDescription())
				.published(tutorDTO.getPublished()).build();
		return tutorialrepositary.save(tutor);

	}

	@Override
	public String deleteTutor(int id) {
		tutorialrepositary.deleteById(id);

		return "the tutor with id" + id + "has been deleted";
	}

}
