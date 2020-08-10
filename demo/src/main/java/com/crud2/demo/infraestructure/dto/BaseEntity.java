package com.crud2.demo.infraestructure.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//Para que es esto.
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_cre", nullable = false, updatable = false)
	@CreatedDate
	private Date fechaCre;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_act", nullable = false, updatable = true)
	@LastModifiedDate
	private Date fechaAct;

	public Date getFechaCre() {
		return fechaCre;
	}

	public void setFechaCre(Date fechaCre) {
		this.fechaCre = fechaCre;
	}

	public Date getFechaAct() {
		return fechaAct;
	}

	public void setFechaAct(Date fechaAct) {
		this.fechaAct = fechaAct;
	}
	
	
}
	