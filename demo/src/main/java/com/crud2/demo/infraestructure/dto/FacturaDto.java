package com.crud2.demo.infraestructure.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class FacturaDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero;
	private String nombre;
	private Double valor_total;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ItemDto> items;
	
	public FacturaDto() {
		// TODO Auto-generated constructor stub
	}
	
	public FacturaDto(Long numero, String nombre, Double valor_total, List<ItemDto> items) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.valor_total = valor_total;
		this.items = items;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
		this.items = items;
	}
	
	
}
