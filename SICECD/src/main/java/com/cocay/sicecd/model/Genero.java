package com.cocay.sicecd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genero")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "pk_id_genero")
	Integer pk_id_genero;
	
	@Column(name = "genero")
	String genero;
	
	//Getters y setters
	public Integer getPk_id_genero() {
		return pk_id_genero;
	}
	public void setPk_id_genero(Integer pk_id_genero) {
		this.pk_id_genero = pk_id_genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
