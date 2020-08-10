package com.crud2.demo.exceptions;

public class NombreException extends RuntimeException {
	public NombreException() {
		super("El nombre debe contener solo letras");
	}
}
