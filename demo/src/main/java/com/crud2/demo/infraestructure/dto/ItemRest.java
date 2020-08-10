package com.crud2.demo.infraestructure.dto;

public class ItemRest {
	
	private Long id;
	private Integer cantidad;
	private Double valor_total;
	private ProductoRest producto;
	
	public ItemRest() {
		// TODO Auto-generated constructor stub
	}

	public ItemRest(Long id, Integer cantidad, Double valor_total, ProductoRest producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.valor_total = valor_total;
		this.producto = producto;
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

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public ProductoRest getProducto() {
		return producto;
	}

	public void setProducto(ProductoRest producto) {
		this.producto = producto;
	}
	
	
}
