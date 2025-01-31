package com.yee.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yee.entities.Venda;

public interface VendaRepository  extends JpaRepository<Venda, Long>{
	
		@Query("SELECT a FROM Venda a WHERE a.data = :data")
		List<Venda> findByData (@Param("data")Date data);

	}