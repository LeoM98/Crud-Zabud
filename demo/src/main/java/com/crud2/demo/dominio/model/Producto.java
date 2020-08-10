package com.crud2.demo.dominio.model;

import com.crud2.demo.shared.dominio.Codigo;
import com.crud2.demo.shared.dominio.Nombre;
import com.crud2.demo.shared.dominio.Valor_total;

public class Producto {
	
	private final Codigo codigo;
	private final Nombre nombre;
	private final Valor_total valor;
	
	public Producto(Codigo codigo, Nombre nombre, Valor_total valor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.valor = valor;
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public Valor_total getValor() {
		return valor;
	}
	
	public static Producto of(Codigo codigo, Nombre nombre, Valor_total valor) {
		// TODO Auto-generated method stub
		return new Producto(codigo, nombre, valor);
	}
}
