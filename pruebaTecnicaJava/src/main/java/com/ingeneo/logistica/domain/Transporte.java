package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="TRANSPORTE")
public class Transporte {
	
	@Column(name="placa")
	@Size(message="Como maximo puede ingresar solo 6 caracteres.", max=6)
	@Pattern(message="La placa debe estar compuesta por 3 letras iniciales y 3 números finales", 
		regexp = "^([A-Z]{3}[0-9]{3})\\z")
	private String placa;
	
	@Column(name="nFlota")
	@Size(message="Como maximo puede ingresar solo 8 caracteres.", max=8)
	@Pattern(message="La placa debe estar compuesta por 3 letras iniciales, 4 números y una letra al final", 
		regexp = "^([A-Z]{3}[0-9]{4}[A-Z]{1})\\z")
	private String nFlota;
	
}
