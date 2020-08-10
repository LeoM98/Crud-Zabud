package com.crud2.demo.infraestructure.repository.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud2.demo.dominio.model.Producto;
import com.crud2.demo.dominio.service.ProductoService;
import com.crud2.demo.exceptions.RegistroNoEncontradoExeception;
import com.crud2.demo.infraestructure.mapper.ProductoMapper;
import com.crud2.demo.infraestructure.repository.database.ProductoRepository;
import com.crud2.demo.shared.dominio.Codigo;

@Service
public class ProductoAdapter implements ProductoService{
	
	@Autowired
	public ProductoRepository productoRepository;
	
	@Autowired
	public ProductoMapper productoMapper;
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(productoMapper.dominiodtoapi(producto));
		
	}

	@Override
	public List<Producto> buscarTodos() {
		// TODO Auto-generated method stub
		return productoMapper.dtoDominioapi(productoRepository.findAll());
	}

	@Override
	public Producto buscarxId(Codigo codigo) {
		Producto producto = productoMapper
				.dtoDominioapi(productoRepository.findById(codigo.getCodigo()).orElseThrow(() -> new RegistroNoEncontradoExeception()));

		return producto;
	}

	@Override
	public Producto borrar(Codigo codigo) {
		Producto producto = buscarxId(codigo);
		productoRepository.deleteById(codigo.getCodigo());

		return producto;
	}

	@Override
	public Producto actualizar(Producto producto, Codigo codigo) {
		Producto p = buscarxId(codigo);
		guardar(producto);
		
		return p;
	}

	@Override
	public List<Producto> buscarxIds(List<Codigo> codigos) {
		return productoRepository.findAllById(codigos.stream().map(codigo -> codigo.getCodigo()).collect(Collectors.toList()))
				.stream().map(producto -> productoMapper.dtoDominioapi(producto)).collect(Collectors.toList());
	}

}
