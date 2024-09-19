package com.inventarioelectrico.app_electrico.infraestructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioelectrico.app_electrico.domain.entity.Producto;
import com.inventarioelectrico.app_electrico.infraestructure.repositories.IProductoRepository;



@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private IProductoRepository productoService;

    @GetMapping
    public List<Producto> list(){
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto show(@PathVariable Long id){
    return productoService.findById(id);
    }

}
