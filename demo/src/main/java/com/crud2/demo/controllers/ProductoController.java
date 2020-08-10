package com.crud2.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud2.demo.aplicacion.ProductoApplication;
import com.crud2.demo.dominio.service.ProductoService;
import com.crud2.demo.infraestructure.dto.ProductoRest;
import com.crud2.demo.infraestructure.mapper.ProductoMapper;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private ProductoApplication productoApplication;
	
	public ProductoController(@Autowired ProductoService productoService,
							@Autowired ProductoMapper productoMapper) {
		this.productoApplication = new ProductoApplication(productoService, productoMapper);
	}
	
	@PostMapping
	public ProductoRest crear (@RequestBody ProductoRest producto) {
		return productoApplication.crear(producto);
	}

	@GetMapping
	public List<ProductoRest> mostrarTodos () {
		return productoApplication.mostrarTodos();
	}

	@GetMapping("/{codigo}")
	public ProductoRest mostrarUno (@PathVariable String codigo) {
		return productoApplication.buscarUno(codigo);
	}

	@PutMapping("/{codigo}")
	public ProductoRest actualizar (@RequestBody ProductoRest producto, @PathVariable  String codigo) {
		return productoApplication.actualizar(producto, codigo);
	}

	@DeleteMapping("/{codigo}")
	public void eliminar (@PathVariable String codigo) {
		productoApplication.eliminar(codigo);
	}
	
}
