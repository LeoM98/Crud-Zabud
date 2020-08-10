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

import com.crud2.demo.aplicacion.FacturaApplication;
import com.crud2.demo.dominio.service.FacturaService;
import com.crud2.demo.dominio.service.ProductoService;
import com.crud2.demo.infraestructure.dto.FacturaRest;
import com.crud2.demo.infraestructure.mapper.FacturaMapper;
import com.crud2.demo.infraestructure.mapper.ProductoMapper;

@RestController
@RequestMapping("/factura")
public class FacturaController {
	
	private FacturaApplication facturaApplication;
	
	public FacturaController(@Autowired FacturaService facturaService,@Autowired ProductoService productoService,
							@Autowired FacturaMapper facturaMapper,@Autowired ProductoMapper productoMapper) {
		this.facturaApplication = new FacturaApplication(facturaService, productoService, facturaMapper, productoMapper);
	}
	
	@PostMapping
	public FacturaRest crear (@RequestBody FacturaRest factura) {
		return facturaApplication.crear(factura);
	}
	
	@GetMapping
	public List<FacturaRest>  mostrarTodos () {
		return facturaApplication.mostrarTodos();
	}
	
	@GetMapping("/{numero}")
	public FacturaRest mostrarUno (@PathVariable Long numero) {
		return facturaApplication.mostrarUno(numero);
	}
	
	@DeleteMapping("/{numero}")
	public void eliminar (@PathVariable Long numero) {
		facturaApplication.eliminar(numero);
	}
	
	@PutMapping("/{numero}")
	public FacturaRest actualizar(@PathVariable Long numero, @RequestBody FacturaRest factura) {
		
		return facturaApplication.actualizar(factura, numero);
		
	}
	
}
