package com.cpan228.tekkenreborn.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cpan228.tekkenreborn.model.Fighter;
import com.cpan228.tekkenreborn.model.Fighter.Anime;

//It will be an interface that defines operations with the fighter
//table in the database
public interface FighterRepository extends CrudRepository<Fighter, Long> {
    List<Fighter> findByAnimeFrom(Anime anime);

    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);
}