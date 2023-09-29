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
    private Long id;
    private String alias;
    private Float estatura;
    @Column(name="esta_activo")
    private Boolean vigencia;
    @ManyToOne
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;

}
