package com.caragency.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8744447397095404189L;

	@Column(name = "id_auto")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAuto;

	@Column
	private String modelo;
	
	//En caso de que la entidad tenga algun campo de fecha podemos usar el siguiente metodo:
	/*
	 * @PrePersist
	 * public void prePersist(){
	 * campoFecha = new Date();
	 * */

	public Long getId_auto() {
		return idAuto;
	}

	public void setId_auto(Long idAuto) {
		this.idAuto = idAuto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
