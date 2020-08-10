package com.crud2.demo.exceptions;

public class RegistroNoEncontradoExeception extends RuntimeException{
	public RegistroNoEncontradoExeception() {
		
		super("registro no encontrado");
		
	}
}
