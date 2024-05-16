package com.yee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yee.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	
		List<Equipe>findByNome(String nome);
		
		@Query("SELECT a FROM Equipe a WHERE a.cidade = :cidade")
		List<Equipe> findByCidade (@Param("cidade")String cidade);
	}