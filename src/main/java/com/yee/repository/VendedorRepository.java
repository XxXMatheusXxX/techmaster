package com.yee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yee.entities.Vendedor;

public interface VendedorRepository  extends JpaRepository<Vendedor, Long>{
	
		List<Vendedor>findByNome(String nome);
		
		@Query("SELECT a FROM Vendedor a WHERE a.meta = :meta")
		List<Vendedor> findByMeta(@Param("meta")double meta);

	}