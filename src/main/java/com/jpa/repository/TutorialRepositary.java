package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Tutor;

public interface TutorialRepositary extends JpaRepository<Tutor, Integer> {

}
