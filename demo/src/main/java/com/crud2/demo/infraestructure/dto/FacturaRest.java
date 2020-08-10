package com.crud2.demo.infraestructure.dto;

import java.util.List;

public class FacturaRest {
	
	private Long numero;
	private String nombre;
	private Double valor_total;
	private List<ItemRest> items;
	
	public FacturaRest() {
		// TODO Auto-generated constructor stub
	}

	public FacturaRest(Long numero, String nombre, Double valor_total, List<ItemRest> items) {
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

	public List<ItemRest> getItems() {
		return items;
	}

	public void setItems(List<ItemRest> items) {
		this.items = items;
	}
	
	
	
}
