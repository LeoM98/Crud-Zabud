package com.crud2.demo.infraestructure.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer cantidad;
	private Double valar_total;
	@OneToOne
	private ProductoDto productoDto;
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(Long id, Integer cantidad, Double valar_total, ProductoDto productoDto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.valar_total = valar_total;
		this.productoDto = productoDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValar_total() {
		return valar_total;
	}

	public void setValar_total(Double valar_total) {
		this.valar_total = valar_total;
	}

	public ProductoDto getProductoDto() {
		return productoDto;
	}

	public void setProductoDto(ProductoDto productoDto) {
		this.productoDto = productoDto;
	}
	
	
}
