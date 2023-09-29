package com.eureka.superheroestopsecret.model;

import lombok.*;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "organizaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name="es_publico")
    private Boolean publico;
    @OneToMany(
            mappedBy = "organizacion",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Superheroe> superheroes;
}
