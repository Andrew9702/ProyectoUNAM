package com.cocay.sicecd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "Perfil_sys")
public class Perfil_sys {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_id_perfil_sys")
	int pk_id_perfil_sys;
	@Column(name = "nombre")
	String nombre;

	@OneToMany(mappedBy = "fk_id_estatus_usuario_sys", targetEntity=Usuario_sys.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Usuario_sys> usuarios = new ArrayList<>();

	public int getPk_id_perfil_sys() {
		return pk_id_perfil_sys;
	}

	public void setPk_id_perfil_sys(int pk_id_perfil_sys) {
		this.pk_id_perfil_sys = pk_id_perfil_sys;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario_sys> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario_sys> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
