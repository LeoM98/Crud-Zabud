package com.crud2.demo.shared.dominio;

import com.crud2.demo.exceptions.CaracteresException;

public class Codigo {
	
	private final String codigo;

	public Codigo(String codigo) {
	
		this.codigo = codigo;
		if ( codigo.length() >1000) {
			
			throw new CaracteresException();
		}
	}

	public String getCodigo() {
		return codigo;
	}

}