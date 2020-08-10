package com.crud2.demo.aplicacion;

import java.util.List;

import com.crud2.demo.dominio.service.ProductoService;
import com.crud2.demo.infraestructure.dto.ProductoRest;
import com.crud2.demo.infraestructure.mapper.ProductoMapper;
import com.crud2.demo.shared.dominio.Codigo;

public class ProductoApplication {

	private ProductoService productoService;
	private ProductoMapper productoMapper;
	
	public ProductoApplication(ProductoService productoService, ProductoMapper productoMapper) {
		this.productoService = productoService;
		this.productoMapper = productoMapper;
	}
		
	public ProductoRest crear (ProductoRest producto) {
		productoService.guardar(productoMapper.dtoDominio(producto));
		return producto;
	}
	
	public List<ProductoRest> mostrarTodos () {
		List<ProductoRest> productos = productoMapper.dominiodto(productoService.buscarTodos());

		return productos;
	}
	
	public ProductoRest buscarUno (String codigo) {
		ProductoRest producto = productoMapper.dominiodto(productoService.buscarxId(new Codigo(codigo)));
		return producto;
	}
	
	public void eliminar (String codigo) {
		ProductoRest producto = productoMapper.dominiodto(productoService.borrar(new Codigo(codigo)));
	}
	
	public ProductoRest actualizar (ProductoRest producto, String codigo) {
		ProductoRest encontrado = productoMapper.dominiodto(productoService.actualizar(productoMapper.dtoDominio(producto), new Codigo(codigo)));
		return producto;
	}
	
}
