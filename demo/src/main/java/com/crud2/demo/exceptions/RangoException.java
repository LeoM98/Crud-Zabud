package com.crud2.demo.exceptions;

public class RangoException extends RuntimeException{
	public RangoException() {
		super("El rango es indebido");
	}
}
