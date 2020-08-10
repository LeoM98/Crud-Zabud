package com.crud2.demo.shared.dominio;

import com.crud2.demo.exceptions.NegativoException;
import com.crud2.demo.exceptions.RangoException;

public class Valor_total {

	private final Double valor;
	
	public Valor_total( Double valor) {
		this.valor = valor;
		
		if (valor<1) {
			throw new NegativoException();
			
		}
		if (valor>9999.0) {
			
			throw new RangoException();
		}
		
	}

	public Double getvalor() {
		return valor;
	}
}