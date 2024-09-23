package com.inventarioelectrico.app_electrico.infraestructure.repositories;

import java.util.List;

import com.inventarioelectrico.app_electrico.application.services.ProductoService;
import com.inventarioelectrico.app_electrico.domain.entity.Producto;

public interface ProductoRepository extends ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);

}
