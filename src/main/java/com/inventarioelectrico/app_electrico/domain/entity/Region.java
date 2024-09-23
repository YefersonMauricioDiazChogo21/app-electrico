package com.inventarioelectrico.app_electrico.domain.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "regions")
public class Region {

    @Id
    private Long id;

    @Column(length=20,nullable=true)
    private String name;
    
    @ManyToOne
    private Country countries;

    @OneToMany(mappedBy="regions")
    private List<City> cities;

}
