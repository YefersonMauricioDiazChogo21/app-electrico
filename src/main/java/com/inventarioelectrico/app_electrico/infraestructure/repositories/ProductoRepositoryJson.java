package com.inventarioelectrico.app_electrico.infraestructure.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventarioelectrico.app_electrico.domain.entity.Producto;

public class ProductoRepositoryJson implements ProductoRepository{
    private List<Producto> list;

    public ProductoRepositoryJson(){
        ClassPathResource resource = new ClassPathResource("products.json");
        ObjectMapper objectmapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectmapper.readValue(resource.getFile(),Producto[].class));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    @Override
    public List<Producto> findAll() {
        return list;
    }

    @Override
    public Producto findById(Long id) {
        return list.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow();
    }

}
