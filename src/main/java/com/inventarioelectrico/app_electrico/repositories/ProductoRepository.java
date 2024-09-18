package com.inventarioelectrico.app_electrico.repositories;

import java.util.List;

import com.inventarioelectrico.app_electrico.domain.entity.Producto;
import com.inventarioelectrico.app_electrico.domain.service.ProductoService;

public interface ProductoRepository extends ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);

}
