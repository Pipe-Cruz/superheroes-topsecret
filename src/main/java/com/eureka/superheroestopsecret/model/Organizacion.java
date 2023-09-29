package com.eureka.superheroestopsecret.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "organizaciones")
@Getter
@Setter
@NoArgsConstructor

public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @OneToMany
    private List<Superheroe> superheroes;

}
