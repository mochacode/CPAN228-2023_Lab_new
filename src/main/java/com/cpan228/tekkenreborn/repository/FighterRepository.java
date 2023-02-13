package com.cpan228.tekkenreborn.repository;

import org.springframework.data.repository.CrudRepository;

import com.cpan228.tekkenreborn.model.Fighter;

//It will be an interface that defines operations with the fighter
//table in the database
public interface FighterRepository extends CrudRepository<Fighter, Long> {
}