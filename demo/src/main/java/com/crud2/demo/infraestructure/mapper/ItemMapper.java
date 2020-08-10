package com.crud2.demo.infraestructure.mapper;

import org.springframework.stereotype.Component;

import com.crud2.demo.dominio.model.Item;
import com.crud2.demo.infraestructure.dto.ItemDto;
import com.crud2.demo.infraestructure.dto.ItemRest;
import com.crud2.demo.shared.dominio.Cantidad;
import com.crud2.demo.shared.dominio.Id;
import com.crud2.demo.shared.dominio.Valor_total;
import com.crud2.demo.shared.infraestructure.MapperApiRest;
import com.crud2.demo.shared.infraestructure.MapperRepository;

@Component
public class ItemMapper implements MapperRepository<Item, ItemDto>, MapperApiRest<Item, ItemRest>{

	public static final ItemMapper INSTANCE = new ItemMapper();

	@Override
	public Item dtoDominioapi(ItemRest o) {
		return Item.of(new Id(o.getId()), new Cantidad(o.getCantidad()), new Valor_total(o.getValor_total()),
			ProductoMapper.INSTANCE.dtoDominio(o.getProducto()));
	}

	@Override
	public ItemRest dominiodtoapi(Item i) {
		return new ItemRest(i.getId().getId(), i.getCantidad().getCantidad(), i.getValor_total().getvalor(),
			ProductoMapper.INSTANCE.dominiodto(i.getProducto()));
	}

	@Override
	public Item dtoDominio(ItemDto o) {
		return Item.of(new Id(o.getId()), new Cantidad(o.getCantidad()),new Valor_total(o.getValar_total()),
			ProductoMapper.INSTANCE.dtoDominioapi(o.getProductoDto()));

	}

	@Override
	public ItemDto dominiodto(Item i) {
		return new ItemDto(i.getId().getId(), i.getCantidad().getCantidad(), i.getValor_total().getvalor(),
				ProductoMapper.INSTANCE.dominiodtoapi(i.getProducto()));
	}
	
	
	
	
	

}
