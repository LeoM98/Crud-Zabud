package com.crud2.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crud2.demo.controllers.ProductoController;
import com.crud2.demo.infraestructure.dto.ProductoDto;
import com.crud2.demo.infraestructure.dto.ProductoRest;
import com.crud2.demo.infraestructure.repository.database.FacturaRepository;
import com.crud2.demo.infraestructure.repository.database.ProductoRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DemoApplicationTests {

	
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	FacturaRepository facturaRepository;
	
	@Autowired
	ProductoController productoController;

	@Test
	public void TestProducto() {
		
		ProductoDto productoDto = new ProductoDto("25","sopa",14.58);
		
		productoRepository.save(productoDto);
		
		ProductoDto foudProducto = productoRepository.findById(productoDto.getCodigo()).get();
		
		assertEquals("sopa", foudProducto.getNombre());
		
	}
		
	@Test
	public void TestPorductoController() {
		
		ProductoRest producto = new ProductoRest("25","LECHE",14.58);
		
		productoController.crear(producto);
		
	}

}
