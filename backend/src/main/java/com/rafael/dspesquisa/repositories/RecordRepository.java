package com.rafael.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.dspesquisa.entities.Genre;

@Repository
public interface RecordRepository extends JpaRepository<Genre, Long>{

}
