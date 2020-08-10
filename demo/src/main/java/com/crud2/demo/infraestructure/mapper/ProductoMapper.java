package com.crud2.demo.infraestructure.mapper;

import org.springframework.stereotype.Component;

import com.crud2.demo.dominio.model.Producto;
import com.crud2.demo.infraestructure.dto.ProductoDto;
import com.crud2.demo.infraestructure.dto.ProductoRest;
import com.crud2.demo.shared.dominio.Codigo;
import com.crud2.demo.shared.dominio.Nombre;
import com.crud2.demo.shared.dominio.Valor_total;
import com.crud2.demo.shared.infraestructure.MapperApiRest;
import com.crud2.demo.shared.infraestructure.MapperRepository;

@Component
public class ProductoMapper implements MapperApiRest<Producto, ProductoDto>, MapperRepository<Producto, ProductoRest> {
	
	public static final ProductoMapper INSTANCE = new ProductoMapper();
	
	@Override
	public Producto dtoDominio(ProductoRest o) {
		return Producto.of( new Codigo(o.getCodigo()), new Nombre(o.getNombre()),
				new Valor_total(o.getValor()));
	}

	@Override
	public ProductoRest dominiodto(Producto i) {
		ProductoRest pd = new ProductoRest();
		pd.setCodigo(i.getCodigo().getCodigo());
		pd.setNombre(i.getNombre().getNombre());
		pd.setValor(i.getValor().getvalor());
		return pd;
	}

	@Override
	public Producto dtoDominioapi(ProductoDto o) {
		return Producto.of( new Codigo(o.getCodigo()), new Nombre(o.getNombre()),
				new Valor_total(o.getValor()));
	}

	@Override
	public ProductoDto dominiodtoapi(Producto i) {
		ProductoDto pd = new ProductoDto();
		pd.setCodigo(i.getCodigo().getCodigo());
		pd.setNombre(i.getNombre().getNombre());
		pd.setValor(i.getValor().getvalor());
		return pd;
	}
	
	
	

}
