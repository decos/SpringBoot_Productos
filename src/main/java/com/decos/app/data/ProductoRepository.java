package com.decos.app.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decos.app.dto.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>  {

}
