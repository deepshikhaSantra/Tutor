package com.jpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;
import com.jpa.entity.Tutor;
import com.jpa.repository.TutorialRepositary;

@SpringBootApplication
public class TutorjpaApplication implements CommandLineRunner {
	@Autowired
	private TutorialRepositary tutorialrepositary;

	public static void main(String[] args) {
		SpringApplication.run(TutorjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker();
		List<Tutor> tutors = IntStream.rangeClosed(1, 200)
				.mapToObj(i -> new Tutor(null, faker.name().title(), "This is dummy description", faker.bool().bool()))
				.toList();
		tutorialrepositary.saveAll(tutors);

	}

}
