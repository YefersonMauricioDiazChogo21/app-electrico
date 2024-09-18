package com.inventarioelectrico.app_electrico.domain.entity;

public class Producto implements Cloneable{
    private Long id;
    private String nombre;
    private Long precio;

    public Producto() {
    }

    public Producto(Long id, String nombre, Long precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    @Override
    public Object clone() {
        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            return new Producto(this.id, this.nombre, this.precio);
        }
    }
    
}
