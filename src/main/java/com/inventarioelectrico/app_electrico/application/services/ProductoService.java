package com.inventarioelectrico.app_electrico.application.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.inventarioelectrico.app_electrico.domain.entity.Producto;

@Component
public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
    
}
