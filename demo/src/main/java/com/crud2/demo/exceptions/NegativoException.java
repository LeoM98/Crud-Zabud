package com.crud2.demo.exceptions;

public class NegativoException extends RuntimeException{
	public NegativoException(){
		super("El valor no puede ser negativo");
	}
}
