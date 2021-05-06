package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {
	
}