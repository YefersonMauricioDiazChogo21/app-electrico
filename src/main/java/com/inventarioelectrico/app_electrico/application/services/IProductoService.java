package com.inventarioelectrico.app_electrico.application.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.inventarioelectrico.app_electrico.domain.entity.Producto;
import com.inventarioelectrico.app_electrico.infraestructure.repositories.ProductoRepository;

@Service
public class IProductoService implements ProductoService{

    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll().stream().map(p->{
            Double priceTax=p.getPrecio()*1.45d;
            Producto newProducto= (Producto) p.clone();
            newProducto.setPrecio(priceTax.longValue());
            return newProducto;
        }).collect(Collectors.toList());
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id);
    }

}
