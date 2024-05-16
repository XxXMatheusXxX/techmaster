package com.yee.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Vendedor")

public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	
	@Column(name = "meta", nullable = false, length = 100)
	private Double meta;
	
	@Column(name = "nome", nullable = false, length =245)
	private String nome;
	
	@Column(name = "salario", nullable = false, length =245)
	private Double salario;
	
	@Column(name = "setor", nullable = false, length =245)
	private String setor;
	
	@Column(name = "totalVendas", nullable = false, length =245)
	private Double totalVendas;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe", nullable = false)
	private Equipe equipe;




}