package com.eureka.superheroestopsecret.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "superheroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Superheroe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alias;
    private Double estatura;
    @Column(name="esta_activo")
    private Boolean vigencia;
    @ManyToOne
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;

}
