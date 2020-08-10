package com.crud2.demo.shared.dominio;

import com.crud2.demo.exceptions.NombreException;

public class Nombre {

	private final String nombre;
	
	public Nombre(String nombre) {
		
		this.nombre= nombre;
		if(!nombre.matches("[A-Z].*")) {
			
			throw new NombreException();
		}
			
	}

	public String getNombre() {
		return nombre;
	}
}
