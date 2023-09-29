package com.eureka.superheroestopsecret.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "organizaciones")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @Column(name="ES_VIGENTE")
    private boolean vigencia;
    @OneToMany(mappedBy = "organizacion")
    private List<Superheroe> superheroes;
}
