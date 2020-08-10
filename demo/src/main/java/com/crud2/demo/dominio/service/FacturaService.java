package com.crud2.demo.dominio.service;

import java.util.List;

import com.crud2.demo.dominio.model.Factura;
import com.crud2.demo.shared.dominio.Id;

public interface FacturaService {
	public Factura guardar(Factura factura);
	public List<Factura> buscar();
	
	//Los metodos para buscar por id es similar a buscar para eliminar
	public Factura buscarId (Id numero);
	public Factura eliminar (Id numero);
	
	//Y la forma en la que se actualiza es similar a la forma en la que guarda.
	public Factura actualizar(Factura factura, Id numero);
}
