package com.inventarioelectrico.app_electrico.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "cities")
public class City {

    @Id
    private Long id;

    @Column(length=50, nullable=true)
    private String name;

    @ManyToOne
    private Region regions;

}
