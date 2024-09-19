package com.inventarioelectrico.app_electrico.infraestructure.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.inventarioelectrico.app_electrico.domain.entity.Producto;

@Component
public class IProductoRepository implements ProductoRepository{
    List<Producto> products;

    public IProductoRepository() {
       this.products = Arrays.asList(
        new Producto(1L,"Computador",2000L),
        new Producto(2L,"Celular",2500L),
        new Producto(3L,"Portatil",60000L),
        new Producto(4L,"Nevera",202000L),
        new Producto(5L,"Televisor",90000L),
        new Producto(6L,"Carro",9000000L),
        new Producto(7L,"Moto",23400000L),
        new Producto(8L,"Karol",2500000000L));
    }
    @Override
    public List<Producto> findAll(){
        return products;
    }
    @Override
    public Producto findById(Long id) {
        return products.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow();
    }
    
}
