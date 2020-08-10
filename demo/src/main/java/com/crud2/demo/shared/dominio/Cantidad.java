package com.crud2.demo.shared.dominio;
import com.crud2.demo.exceptions.NegativoException;

public class Cantidad {

	private final Integer cantidad;

	public Cantidad(Integer cantidad) {
		
		this.cantidad= cantidad;
		if (cantidad<1) {
			throw new NegativoException();
			
		}
		
	}

	public Integer getCantidad() {
		return cantidad;
	}
	
	
}
