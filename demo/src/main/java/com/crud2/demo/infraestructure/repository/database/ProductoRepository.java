package com.crud2.demo.infraestructure.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud2.demo.infraestructure.dto.ProductoDto;

public interface ProductoRepository extends JpaRepository<ProductoDto, String> {

}
