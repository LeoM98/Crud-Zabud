package com.crud2.demo.infraestructure.mapper;

import org.springframework.stereotype.Component;

import com.crud2.demo.dominio.model.Factura;
import com.crud2.demo.infraestructure.dto.FacturaDto;
import com.crud2.demo.infraestructure.dto.FacturaRest;
import com.crud2.demo.shared.dominio.Id;
import com.crud2.demo.shared.dominio.Nombre;
import com.crud2.demo.shared.dominio.Valor_total;
import com.crud2.demo.shared.infraestructure.MapperApiRest;
import com.crud2.demo.shared.infraestructure.MapperRepository;

@Component
public class FacturaMapper implements MapperApiRest<Factura, FacturaRest>, MapperRepository<Factura, FacturaDto>{
	
	@Override
	public Factura dtoDominio(FacturaDto o) {
		return Factura.of(new Id(o.getNumero()), new Nombre(o.getNombre()), new Valor_total(o.getValor_total()), 
				ItemMapper.INSTANCE.dtoDominio(o.getItems()));

	}

	@Override
	public FacturaDto dominiodto(Factura i) {
		return new FacturaDto(i.getNumero().getId(), i.getNombre().getNombre(), i.getValor_total().getvalor(),
				ItemMapper.INSTANCE.dominiodto(i.getItems()));
	}

	@Override
	public Factura dtoDominioapi(FacturaRest o) {
		return Factura.of(new Id(o.getNumero()), new Nombre(o.getNombre()), new Valor_total(o.getValor_total()), 
				ItemMapper.INSTANCE.dtoDominioapi(o.getItems()));
	}

	@Override
	public FacturaRest dominiodtoapi(Factura i) {
		return new FacturaRest(i.getNumero().getId(), i.getNombre().getNombre(), i.getValor_total().getvalor(),
				ItemMapper.INSTANCE.dominiodtoapi(i.getItems()));
	}
	
}
