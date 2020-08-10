package com.crud2.demo.shared.dominio;

import com.crud2.demo.exceptions.RangoException;

public class Id {

	private final Long id;
	public Id(Long id) {

		this.id = id;
		if (id<0) {
			
			throw new RangoException();
		}
		
		
	}
	public Long getId() {
		return id;
	}
}