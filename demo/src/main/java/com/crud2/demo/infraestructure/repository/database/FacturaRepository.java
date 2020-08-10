package com.crud2.demo.infraestructure.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud2.demo.infraestructure.dto.FacturaDto;

public interface FacturaRepository extends JpaRepository<FacturaDto, Long>{

}
