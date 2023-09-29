package com.eureka.superheroestopsecret.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "superheroes")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Superheroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String alias;
    private float estatura;
    @Column(name="ES_ACTIVO")
    private boolean vigencia;
    @ManyToOne
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;

}
