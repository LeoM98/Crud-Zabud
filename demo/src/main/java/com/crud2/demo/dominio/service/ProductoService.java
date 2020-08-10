package com.crud2.demo.dominio.service;

import java.util.List;

import com.crud2.demo.dominio.model.Producto;
import com.crud2.demo.shared.dominio.Codigo;

public interface ProductoService {
	
	public void guardar (Producto producto);
	
	public List<Producto> buscarTodos();
	
	public Producto buscarxId (Codigo codigo);
	public List<Producto> buscarxIds (List<Codigo> codigos);

	
	public Producto borrar (Codigo codigo);
	
	public Producto actualizar(Producto producto, Codigo codigo);
}
